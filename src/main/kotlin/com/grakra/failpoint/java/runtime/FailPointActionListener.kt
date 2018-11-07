package com.grakra.failpoint.java.runtime

import com.grakra.failpoint.action.FailPointActionBaseListener
import com.grakra.failpoint.action.FailPointActionParser
import com.grakra.failpoint.util.Util
import java.util.*


class FailPointActionListener : FailPointActionBaseListener() {
  var stack = Stack<Any>()

  override fun enterBooleanLiteral(ctx: FailPointActionParser.BooleanLiteralContext?) {
    stack.push(ctx!!.text.toBoolean())
    super.enterBooleanLiteral(ctx)
  }

  override fun enterIntegerLiteral(ctx: FailPointActionParser.IntegerLiteralContext?) {
    stack.push(Util.str2int64(ctx!!.text!!))
    super.enterIntegerLiteral(ctx)
  }

  override fun enterFloatLiteral(ctx: FailPointActionParser.FloatLiteralContext?) {
    stack.push(ctx!!.text!!.toDouble())
    super.enterFloatLiteral(ctx)
  }

  override fun enterStringLiteral(ctx: FailPointActionParser.StringLiteralContext?) {
    stack.push(ctx!!.text!!)
    super.enterStringLiteral(ctx)
  }

  override fun exitAct_stall(ctx: FailPointActionParser.Act_stallContext?) {
    stack.push(FpStall(stack.pop() as Long))
    super.enterAct_stall(ctx)
  }

  override fun exitAct_return(ctx: FailPointActionParser.Act_returnContext?) {
    stack.pop()!!.let {
      stack.push(FpReturn(
          when (it) {
            is Boolean -> it
            is Long -> it
            is Double -> it
            is String -> it
            else -> throw TypeCastException(it::class.java.simpleName)
          }
      ))
    }
    super.exitAct_return(ctx)
  }

  override fun exitAct_stall_return(ctx: FailPointActionParser.Act_stall_returnContext?) {
    stack.pop()!!.let {
      stack.push(FpStallReturn(
          stack.pop()!! as Long,
          when (it) {
            is Boolean -> it
            is Long -> it
            is Double -> it
            is String -> it
            else -> throw TypeCastException(it::class.java.simpleName)
          }
      ))
    }
    super.exitAct_stall_return(ctx)
  }

  override fun exitAct_nop(ctx: FailPointActionParser.Act_nopContext?) {
    stack.push(FpNop)
    super.exitAct_nop(ctx)
  }

  override fun exitAct_random_elm(ctx: FailPointActionParser.Act_random_elmContext?) {
    val elm = stack.pop()!! as FpQualifiable
    val prob = stack.pop()!! as Double
    stack.push(FpRandomElm(prob, elm))
    super.exitAct_random_elm(ctx)
  }

  override fun exitAct_random(ctx: FailPointActionParser.Act_randomContext?) {
    val elms = mutableListOf<FpRandomElm>()
    while (!stack.empty() && stack.peek()!! is FpRandomElm) {
      elms.add(0, stack.pop()!! as FpRandomElm)
    }
    stack.push(FpRandom(elms.toTypedArray()))
    super.exitAct_random(ctx)
  }

  override fun exitAct_series_elm(ctx: FailPointActionParser.Act_series_elmContext?) {
    val elm = stack.pop()!! as FpRepeatable
    val times =
        if (!stack.empty() && stack.peek()!! is Long) {
          stack.pop()!! as Long
        } else {
          1L
        }

    stack.push(FpSeriesElm(times, elm))
    super.exitAct_series_elm(ctx)
  }

  override fun enterAct_disable(ctx: FailPointActionParser.Act_disableContext?) {
    stack.push(FpDisable)
    super.enterAct_disable(ctx)
  }

  override fun exitAct_series_trail(ctx: FailPointActionParser.Act_series_trailContext?) {
    assert(!stack.empty() && stack.pop() == FpDisable)
    stack.pop()
    stack.push(FpSeriesTrail)
    super.exitAct_series_trail(ctx)
  }

  override fun exitAct_series(ctx: FailPointActionParser.Act_seriesContext?) {
    val trail =
        if (!stack.isEmpty() && stack.peek()!! is FpSeriesTrail) {
          stack.pop()
          FpSeriesTrail
        } else {
          null
        }

    val elms = mutableListOf<FpSeriesElm>()
    while (!stack.isEmpty() && stack.peek()!! is FpSeriesElm) {
      elms.add(0, stack.pop()!! as FpSeriesElm)
    }
    stack.push(FpSeries(elms.toTypedArray(), trail))
    super.exitAct_series(ctx)
  }

  override fun enterAct_enable(ctx: FailPointActionParser.Act_enableContext?) {
    stack.push(FpEnable)
    super.enterAct_enable(ctx)
  }

  override fun enterAct_gdb(ctx: FailPointActionParser.Act_gdbContext?) {
    stack.push(FpNop)
    super.enterAct_gdb(ctx)
  }

  override fun enterAct_gcore(ctx: FailPointActionParser.Act_gcoreContext?) {
    stack.push(FpNop)
    super.enterAct_gcore(ctx)
  }

  override fun enterAct_clear(ctx: FailPointActionParser.Act_clearContext?) {
    stack.push(FpClear)
    super.enterAct_clear(ctx)
  }

  override fun enterAct_status(ctx: FailPointActionParser.Act_statusContext?) {
    stack.push(FpStatus)
    super.enterAct_status(ctx)
  }

  override fun exitFailpoint_action_internal(ctx: FailPointActionParser.Failpoint_action_internalContext?) {
    assert(stack.size == 1)
    super.exitFailpoint_action_internal(ctx)
  }

  val failpoint: FailPointAction?
    get() =
      if (stack.size == 1 && stack.peek()!! is FailPointAction) {
        stack.peek()!! as FailPointAction
      } else {
        null
      }

}