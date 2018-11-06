// Generated from com/grakra/failpoint/inject/FailPointParser.g4 by ANTLR 4.7.1
package com.grakra.failpoint.inject;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FailPointParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FailPointParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FailPointParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FailPointParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#file_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_content(FailPointParser.File_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#non_failpoint_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_failpoint_line(FailPointParser.Non_failpoint_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#regular_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_line(FailPointParser.Regular_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#external_dependentency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_dependentency(FailPointParser.External_dependentencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#blank_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank_line(FailPointParser.Blank_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#non_blank_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_blank_line(FailPointParser.Non_blank_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#import_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_line(FailPointParser.Import_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#import_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_package(FailPointParser.Import_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#include_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_line(FailPointParser.Include_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#include_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_header(FailPointParser.Include_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#failpoint_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailpoint_block(FailPointParser.Failpoint_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#failpoint_begin_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailpoint_begin_line(FailPointParser.Failpoint_begin_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#commented_code_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommented_code_line(FailPointParser.Commented_code_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#failpoint_end_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailpoint_end_line(FailPointParser.Failpoint_end_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#leading_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeading_space(FailPointParser.Leading_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(FailPointParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#failpoint_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailpoint_declare(FailPointParser.Failpoint_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FailPointParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#default_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_literal(FailPointParser.Default_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FailPointParser.VarContext ctx);
}