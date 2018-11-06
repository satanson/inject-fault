// Generated from com/grakra/failpoint/inject/FailPointParser.g4 by ANTLR 4.7.1
package com.grakra.failpoint.inject;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FailPointParser}.
 */
public interface FailPointParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FailPointParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(FailPointParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(FailPointParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#file_content}.
	 * @param ctx the parse tree
	 */
	void enterFile_content(FailPointParser.File_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#file_content}.
	 * @param ctx the parse tree
	 */
	void exitFile_content(FailPointParser.File_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#non_failpoint_line}.
	 * @param ctx the parse tree
	 */
	void enterNon_failpoint_line(FailPointParser.Non_failpoint_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#non_failpoint_line}.
	 * @param ctx the parse tree
	 */
	void exitNon_failpoint_line(FailPointParser.Non_failpoint_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#regular_line}.
	 * @param ctx the parse tree
	 */
	void enterRegular_line(FailPointParser.Regular_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#regular_line}.
	 * @param ctx the parse tree
	 */
	void exitRegular_line(FailPointParser.Regular_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#external_dependentency}.
	 * @param ctx the parse tree
	 */
	void enterExternal_dependentency(FailPointParser.External_dependentencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#external_dependentency}.
	 * @param ctx the parse tree
	 */
	void exitExternal_dependentency(FailPointParser.External_dependentencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#blank_line}.
	 * @param ctx the parse tree
	 */
	void enterBlank_line(FailPointParser.Blank_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#blank_line}.
	 * @param ctx the parse tree
	 */
	void exitBlank_line(FailPointParser.Blank_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#non_blank_line}.
	 * @param ctx the parse tree
	 */
	void enterNon_blank_line(FailPointParser.Non_blank_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#non_blank_line}.
	 * @param ctx the parse tree
	 */
	void exitNon_blank_line(FailPointParser.Non_blank_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#import_line}.
	 * @param ctx the parse tree
	 */
	void enterImport_line(FailPointParser.Import_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#import_line}.
	 * @param ctx the parse tree
	 */
	void exitImport_line(FailPointParser.Import_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#import_package}.
	 * @param ctx the parse tree
	 */
	void enterImport_package(FailPointParser.Import_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#import_package}.
	 * @param ctx the parse tree
	 */
	void exitImport_package(FailPointParser.Import_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#include_line}.
	 * @param ctx the parse tree
	 */
	void enterInclude_line(FailPointParser.Include_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#include_line}.
	 * @param ctx the parse tree
	 */
	void exitInclude_line(FailPointParser.Include_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#include_header}.
	 * @param ctx the parse tree
	 */
	void enterInclude_header(FailPointParser.Include_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#include_header}.
	 * @param ctx the parse tree
	 */
	void exitInclude_header(FailPointParser.Include_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#failpoint_block}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_block(FailPointParser.Failpoint_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#failpoint_block}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_block(FailPointParser.Failpoint_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#failpoint_begin_line}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_begin_line(FailPointParser.Failpoint_begin_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#failpoint_begin_line}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_begin_line(FailPointParser.Failpoint_begin_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#commented_code_line}.
	 * @param ctx the parse tree
	 */
	void enterCommented_code_line(FailPointParser.Commented_code_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#commented_code_line}.
	 * @param ctx the parse tree
	 */
	void exitCommented_code_line(FailPointParser.Commented_code_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#failpoint_end_line}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_end_line(FailPointParser.Failpoint_end_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#failpoint_end_line}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_end_line(FailPointParser.Failpoint_end_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#leading_space}.
	 * @param ctx the parse tree
	 */
	void enterLeading_space(FailPointParser.Leading_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#leading_space}.
	 * @param ctx the parse tree
	 */
	void exitLeading_space(FailPointParser.Leading_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(FailPointParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(FailPointParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#failpoint_declare}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_declare(FailPointParser.Failpoint_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#failpoint_declare}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_declare(FailPointParser.Failpoint_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FailPointParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FailPointParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#default_literal}.
	 * @param ctx the parse tree
	 */
	void enterDefault_literal(FailPointParser.Default_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#default_literal}.
	 * @param ctx the parse tree
	 */
	void exitDefault_literal(FailPointParser.Default_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FailPointParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FailPointParser.VarContext ctx);
}