package com.grakra.failpoint.java.tool

import com.grakra.failpoint.inject.FailPointParser
import com.grakra.failpoint.inject.FailPointParserBaseListener
import java.io.*

class JavaFailPointListener(
  op: OutputStream) : FailPointParserBaseListener() {

  private val ps = op.let {
    OutputStreamWriter(it, Charsets.UTF_8)
  }.let {
    BufferedWriter(it)
  }.let {
    PrintWriter(it)
  }

  val importedPackages = mutableListOf<String>()
  val includedHeaders = mutableListOf<String>()

  class FailPointDesc {
    var indent: String = ""
    var type: String = ""
    var variable: String = ""
    var default: String? = null
    val codes = mutableListOf<String>()

    override fun toString(): String {
      val lines = mutableListOf<String>()
      val align = "  "
      lines.run {
        add("do {\n")
        add("${align}FailPointRegistry fp = FailPointTable.get(\"$variable\");\n")
        add("${align}try {\n")
        add("$align${align}fp.acquire();\n")
        add("$align${align}if (fp.disabled()) {\n")
        add("$align$align${align}break;\n")
        add("$align$align}\n")
        add("$align$align$type $variable = ($type)fp.value();\n")
        addAll(codes.map { "$align$align$it" })
        add("$align} catch (Throwable elm) {\n")
        add("$align${align}elm.printStackTrace();\n")
        add("$align} finally {\n")
        add("$align${align}fp.release();\n")
        add("$align}\n")
        add("} while(false);\n")
      }
      return lines.asSequence().map { "$indent$it" }.joinToString("")
    }
  }

  val failPoints = mutableListOf<FailPointDesc>()

  override fun enterRegular_line(ctx: FailPointParser.Regular_lineContext?) {
    ps.print(ctx!!.text)
    ps.flush()
    super.enterRegular_line(ctx)
  }

  override fun enterExternal_dependentency(ctx: FailPointParser.External_dependentencyContext?) {
    ps.print(ctx!!.text)
    ps.flush()
    super.enterExternal_dependentency(ctx)
  }

  override fun enterImport_package(ctx: FailPointParser.Import_packageContext?) {
    importedPackages.add(ctx!!.text)
    super.enterImport_package(ctx)
  }

  override fun enterInclude_header(ctx: FailPointParser.Include_headerContext?) {
    includedHeaders.add(ctx!!.text)
    super.enterInclude_header(ctx)
  }

  override fun enterCode(ctx: FailPointParser.CodeContext?) {
    var code = ctx!!.text!!
    if (!code.isEmpty() && code[0].isWhitespace()) {
      code = code.substring(1)
    }
    failPoints.last().codes.add(code)
    super.enterCode(ctx)
  }

  override fun enterFailpoint_begin_line(ctx: FailPointParser.Failpoint_begin_lineContext?) {
    failPoints.add(FailPointDesc())
    ctx!!.FailPointLine_Prefix().text?.let {
      it.takeWhile(Char::isWhitespace)
    }?.let {
      failPoints.last().indent = it
    }
    super.enterFailpoint_begin_line(ctx)
  }

  override fun enterType(ctx: FailPointParser.TypeContext?) {
    failPoints.last().type = ctx!!.text
    super.enterType(ctx)
  }

  override fun enterVar(ctx: FailPointParser.VarContext?) {
    failPoints.last().variable = ctx!!.text
    super.enterVar(ctx)
  }

  override fun enterDefault_literal(ctx: FailPointParser.Default_literalContext?) {
    failPoints.last().default = ctx!!.text
    super.enterDefault_literal(ctx)
  }

  override fun exitFailpoint_block(ctx: FailPointParser.Failpoint_blockContext?) {
    ps.print(failPoints.last())
    super.exitFailpoint_block(ctx)
  }
}