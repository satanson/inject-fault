package com.grakra.failpoint.java.tool

import com.grakra.failpoint.util.Result
import java.io.File

fun main(vararg args: String) {
  Result.b wrap {
    //if (args.isEmpty()) {
    //  throw Exception("Missing argument!!!")
    //}
    //args[0]
    "/home/grakra/workspace/inject-fault/src/main/resources/test.java"
  } bind { srcFile ->
    val ip = File(srcFile).inputStream()!!
    val op = File("$srcFile.fp").outputStream()!!
    val listener = JavaFailPointListener(op)
    FailPointCopy.copy(ip, listener)
    ip.close()
    op.close()
  } unwrap Result.e
}