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
      it.failpoint!!
    }
  }

  fun stringify(): String {
    return when (this) {
      is FpDisable -> "disable"
      is FpNop -> "nop"
      is FpReturn<*> -> "return($v)"
      is FpStall -> "stall($t)"
      is FpStallReturn<*> -> "stall_return($t, $v)"
      is FpRandomElm -> "$prop*${elm.stringify()}"
      is FpRandom -> "[${elms.joinToString(", ") { it.stringify() }}]"
      is FpSeriesElm -> "$times*${elm.stringify()}"
      is FpSeriesTrail -> "${FpDisable.stringify()}"
      is FpSeries -> elms.joinToString("->") { it.stringify() }
      is FpEnable -> "enable"
      is FpClear -> "clear"
      is FpShow -> "show"
      is FpStatus -> "status"
    }
  }
}

//sealed class FpRepeated : FailPointAction() {
//  val qualified: FailPointAction
//    get() = when (this) {
//      is FpRandom -> this.draw()
//      else -> this
//    }
//}
sealed class FpSimple : FailPointAction()

sealed class FpQualifiable : FpRepeatable()
sealed class FpRepeatable : FailPointAction() {
  val value: FailPointAction
    get() = when (this) {
      is FpRandom -> draw()
      else -> this
    }
}

sealed class FpRepeated : FailPointAction() {
  companion object {
    val EndOfFpRepeated = Exception("End of ComposableFailPointAction")
  }

  abstract fun next(): Result<FailPointAction>
}

object FpShow : FpSimple()
object FpStatus : FpSimple()
object FpClear : FpSimple()
object FpEnable : FpSimple()
object FpDisable : FpSimple()
object FpNop : FpQualifiable()
data class FpReturn<V>(val v: V) : FpQualifiable() {
}

data class FpStall(val t: Long) : FpQualifiable() {
}

data class FpStallReturn<V>(val t: Long, val v: V) : FpQualifiable() {
}

data class FpRandomElm(
  val elm: FpQualifiable,
  val prop: Double) : FailPointAction() {
  init {
    assert(prop > 0.0)
  }
}

data class FpRandom(
  val elms: Array<FpRandomElm>) : FpRepeatable() {
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

object FpSeriesTrail : FpRepeated() {
  var count = 0
  override fun next(): Result<FailPointAction> {
    return Result.wrap {
      if (count < 1) {
        count += 1
        FpDisable
      } else {
        count = 0
        throw EndOfFpRepeated
      }
    }
  }
}

data class FpSeriesElm(val times: Int, val elm: FpRepeatable) : FpRepeated() {
  init {
    assert(times > 0)
  }

  var count = 0
  override fun next(): Result<FailPointAction> {
    return Result.wrap {
      if (count < times) {
        count += 1
        elm.value
      } else {
        count = 0
        throw EndOfFpRepeated
      }
    }
  }
}

data class FpSeries(val seriesElms: Array<FpSeriesElm>, val trail: FpSeriesTrail?) : FailPointAction() {
  init {
    assert(!seriesElms.isEmpty())
  }

  val elms = trail?.let { arrayOf(*seriesElms, it) } ?: seriesElms
  private var idx = 0

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
