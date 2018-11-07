package com.grakra.failpoint.java.runtime

import org.testng.annotations.Test

class TestFailPointAction {
  @Test
  fun test0() {
    val return10 = FpReturn(10)
    println(return10.stringify())
  }

  @Test
  fun test1() {
    val testcases = listOf(
        "return(1)->return(2)->return(3)",
        "return(0.2)->return(0.3)->return(0.4)",
        "return(true)->return(false)->return(true)",
        "return(\"ok\")->return(\"err\")->return(\"unknown\")",
        "stall(100)->stall(1000)->stall(10000)->stall(10000)",
        "nop->nop->nop->nop",

        "" +
            "stall_return(1000, 10)->" +
            "stall_return(10000, true)->" +
            "stall_return(100000, 3.14)->" +
            "stall_return(1000000, \"deadbeef\")",

        "" +
            "[0.1*return(1), " +
            "0.2*nop, " +
            "0.3*stall(2000), " +
            "0.4*stall_return(3000, 10)]",
        """
            return(1) ->
            stall(2000) ->
            nop ->
            stall_return(3333, 0b1111_1111) ->
            [
              100.0*return(2),
              200.0*stall(1111),
              300.0*nop,
              400.0*stall_return(4444, 1000)
            ]
        """
    )
    testcases.forEach {
      FailPointAction.parse(it) bind {
        println(it.stringify())
      } onErr {
        it.printStackTrace()
      }
    }
  }

  @Test
  fun testFpSequental() {
    val fp = FpSeries(arrayOf(
        FpSeriesElm(10, FpReturn(10)),
        FpSeriesElm(2, FpNop),
        FpSeriesElm(1, FpStall(1000)),
        FpSeriesElm(3, FpStallReturn(1000, 2)),
        FpSeriesElm(11, FpRandom(
            arrayOf(
                FpRandomElm(30.0, FpNop),
                FpRandomElm(10.0, FpReturn(13)),
                FpRandomElm(10.0, FpReturn(14)),
                FpRandomElm(10.0, FpReturn(15)),
                FpRandomElm(10.0, FpStall(2000)),
                FpRandomElm(10.0, FpStall(3000)),
                FpRandomElm(10.0, FpStallReturn(4000, 16))
            )))),
        FpSeriesTrail)

    println(fp.stringify())
    for (i: Int in 1..100) {
      println(fp.next().stringify())
    }
  }
}