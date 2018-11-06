package com.grakra.failpoint.java.runtime

import com.grakra.failpoint.action.FailPointActionLexer
import com.grakra.failpoint.action.FailPointActionParser
import com.grakra.failpoint.util.Ok
import com.grakra.failpoint.util.Result
import org.antlr.v4.runtime.CodePointBuffer
import org.antlr.v4.runtime.CodePointCharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.nio.CharBuffer
import java.util.*

sealed class FailPointAction {
  fun act(fp: FailPointDescriptor): String = TODO()

  fun parse(s: String): Result<FailPointAction> {
    return Result.b wrap {
      Unit.let {
        s.toCharArray()
      }.let {
        CharBuffer.wrap(it)
      }.let {
        CodePointBuffer.withChars(it)
      }.let {
        CodePointCharStream.fromBuffer(it)
      }.let {
        FailPointActionLexer(it)
      }.let {
        CommonTokenStream(it)
      }.let {
        FailPointActionParser(it).failpoint_action()
      }.let {
        val listener = FailPointActionListener()
        ParseTreeWalker().walk(listener, it)
        listener
      }
    } bind {
      it.failpoint
    }
  }

  fun stringify(): String {
    return when (this) {
      is FpDisable -> "disable"
      is FpNop -> "nop"
      is FpReturn<*> -> "return($v)"
      is FpStall -> "stall($t)"
      is FpStallReturn<*> -> "stall_return($t, $v)"
      is FpProbable -> "$prop*${elm.stringify()}"
      is FpRandomized -> "[${elms.joinToString(", ") { it.stringify() }}]"
      is FpRepeated -> "$times*${elm.stringify()}"
      is FpSequential -> elms.joinToString("->") { it.stringify() }
      is FpEnable -> "enable"
      is FpClear -> "clear"
      is FpShow -> "show"
      is FpStatus -> "status"
    }
  }
}

sealed class QualifiedFailPointAction : FailPointAction() {
  val qualified: FailPointAction
    get() = when (this) {
      is FpRandomized -> this.draw()
      else -> this
    }
}

sealed class ComposableFailPointAction : FailPointAction() {}

sealed class NonComposableFailPointAction : FailPointAction()

object FpShow : NonComposableFailPointAction() {
}

object FpStatus : NonComposableFailPointAction() {
}

object FpClear : NonComposableFailPointAction() {
}

object FpEnable : NonComposableFailPointAction() {
}

object FpDisable : QualifiedFailPointAction() {
}

object FpNop : QualifiedFailPointAction() {
}

data class FpReturn<V>(val v: V) : QualifiedFailPointAction() {
}

data class FpStall(val t: Long) : QualifiedFailPointAction() {
}

data class FpStallReturn<V>(val t: Long, val v: V) : QualifiedFailPointAction() {
}

data class FpProbable(
  val elm: QualifiedFailPointAction,
  val prop: Double) : FailPointAction() {
  init {
    assert(prop > 0.0)
    assert(elm !is FpDisable)
  }
}

data class FpRandomized(
  val elms: Array<FpProbable>) : QualifiedFailPointAction() {
  private val sum = elms.sumByDouble { it.prop }
  private val bounds = elms.fold(listOf(0.0)) { l, p ->
    l + (l.last() + p.prop / sum)
  }.toDoubleArray()

  fun draw(): FailPointAction {
    val v = Random().nextDouble()
    // if not found, then v in (bounds[-i-2], bounds[-i-1])
    val i = bounds.binarySearch(v).let { if (it < 0) -it - 2 else it }
    return elms[i].elm
  }
}

data class FpRepeated(val elm: QualifiedFailPointAction, val times: Int) : ComposableFailPointAction() {
  init {
    assert(times > 0)
    assert(elm !is FpDisable || times == 1)
  }

  var count = 0

  companion object {
    val EndOfComposableFp = Exception("End of ComposableFailPointAction")
  }

  fun next(): Result<FailPointAction> {
    return Result.wrap {
      if (count < times) {
        count += 1
        elm.qualified
      } else {
        count = 0
        throw EndOfComposableFp
      }
    }
  }
}

data class FpSequential(val elms: Array<FpRepeated>) : NonComposableFailPointAction() {
  init {
    assert(!elms.isEmpty())
    assert(elms.size - elms.takeWhile { it.elm !is FpDisable }.size <= 1)
  }

  var idx = 0

  fun next(): FailPointAction {
    while (true) {
      elms[idx].next().let { fp ->
        if (fp is Ok) {
          return fp.v
        } else {
          idx = (idx + 1) % elms.size
        }
      }
    }
  }
}