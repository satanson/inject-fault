package com.grakra.failpoint.util

object Util {
  fun str2int64(s: String): Long {
    return String(s.filter { it != '_' }.toCharArray()).let {
      when {
        it matches Regex("^0$") -> 0L
        it matches Regex("^0[xX].*") -> it.substring(2).toLong(16)
        it matches Regex("^0[bB].*") -> it.substring(2).toLong(2)
        it matches Regex("^0[1-7].*") -> it.substring(1).toLong(8)
        else -> it.toLong(10)
      }
    }
  }
}