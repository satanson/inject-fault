// Generated from com/grakra/failpoint/action/FailPointAction.g4 by ANTLR 4.7.1
package com.grakra.failpoint.action;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FailPointActionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FailPointActionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#failpoint_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailpoint_action(FailPointActionParser.Failpoint_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_compound(FailPointActionParser.Act_compoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_simple(FailPointActionParser.Act_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_gdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_gdb(FailPointActionParser.Act_gdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_gcore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_gcore(FailPointActionParser.Act_gcoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_repeated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_repeated(FailPointActionParser.Act_repeatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_randomized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_randomized(FailPointActionParser.Act_randomizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_probable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_probable(FailPointActionParser.Act_probableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_nop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_nop(FailPointActionParser.Act_nopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_stall_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_stall_return(FailPointActionParser.Act_stall_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_stall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_stall(FailPointActionParser.Act_stallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_return(FailPointActionParser.Act_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_show(FailPointActionParser.Act_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_disable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_disable(FailPointActionParser.Act_disableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_enable(FailPointActionParser.Act_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_status(FailPointActionParser.Act_statusContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#act_clear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct_clear(FailPointActionParser.Act_clearContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FailPointActionParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#numerical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical_literal(FailPointActionParser.Numerical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(FailPointActionParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FailPointActionParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(FailPointActionParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FailPointActionParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(FailPointActionParser.FloatLiteralContext ctx);
}