package com.grakra.failpoint.util

import org.testng.Assert
import org.testng.annotations.Test

class TestUtil {
  @Test
  fun test() {
    val testcases = listOf(
        "0"
            to 0L,
        "1234"
            to 1234L,
        "5_6_7_8_"
            to 5678L,
        "0b_1111_0000"
            to 15L * 16L,
        "0_755"
            to 7L * 64L + 5L * 8L + 5L,
        "0x_1234_5678_9abc_def0"
            to 0x123456789abcdef0
    )
    testcases.forEachIndexed { i, (s, expect) ->
      println("tc#$i: s=$s expect=$expect")
      Assert.assertEquals(Util.str2int64(s), expect)
    }
  }
}