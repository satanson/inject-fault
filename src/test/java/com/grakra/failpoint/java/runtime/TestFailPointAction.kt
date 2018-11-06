package com.grakra.failpoint.java.runtime

import org.testng.annotations.Test

class TestFailPointAction {
  @Test
  fun test0(){
    val return10 = FpReturn(10)
    println(return10.stringify())
  }
  @Test
  fun testFpSequental() {
    val fp = FpSequential(arrayOf(
      FpRepeated(FpReturn(10), 10),
      FpRepeated(FpNop, 2),
      FpRepeated(FpStall(1000), 1),
      FpRepeated(FpStallReturn(1000, 2), 3),
      FpRepeated(FpRandomized(
        arrayOf(
          FpProbable(FpNop, 30.0),
          FpProbable(FpReturn(13), 10.0),
          FpProbable(FpReturn(14), 10.0),
          FpProbable(FpReturn(15), 10.0),
          FpProbable(FpStall(2000), 10.0),
          FpProbable(FpStall(3000), 10.0),
          FpProbable(FpStallReturn(4000, 16), 10.0)
        )), 11),
      FpRepeated(FpDisable, 1)))

    println(fp.stringify())
    for (i:Int in 1..100) {
      println(fp.next().stringify())
    }
  }
}