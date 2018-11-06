package com.grakra.failpoint.java.tool

import com.grakra.failpoint.inject.*
import com.grakra.failpoint.util.Result
import org.antlr.v4.runtime.CodePointBuffer
import org.antlr.v4.runtime.CodePointCharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.*
import java.nio.CharBuffer

object FailPointCopy {
  fun copy(ip: InputStream, listener: FailPointParserListener) {
    Result.wrap {
      Unit.let {
        BufferedReader(InputStreamReader(ip, Charsets.UTF_8))
      }.let {
        it.readText().toCharArray()
      }.let {
        CharBuffer.wrap(it)
      }.let {
        CodePointBuffer.withChars(it)
      }.let {
        CodePointCharStream.fromBuffer(it)
      }.let {
        FailPointLexer(it)
      }.let {
        CommonTokenStream(it)
      }.let {
        FailPointParser(it).file()
      }.let {
        ParseTreeWalker().walk(listener, it)
      }
    }.unwrap()
  }
}