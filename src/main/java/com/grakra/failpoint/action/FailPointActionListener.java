// Generated from com/grakra/failpoint/action/FailPointAction.g4 by ANTLR 4.7.1
package com.grakra.failpoint.action;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FailPointActionParser}.
 */
public interface FailPointActionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#failpoint_action}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_action(FailPointActionParser.Failpoint_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#failpoint_action}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_action(FailPointActionParser.Failpoint_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_compound}.
	 * @param ctx the parse tree
	 */
	void enterAct_compound(FailPointActionParser.Act_compoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_compound}.
	 * @param ctx the parse tree
	 */
	void exitAct_compound(FailPointActionParser.Act_compoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_simple}.
	 * @param ctx the parse tree
	 */
	void enterAct_simple(FailPointActionParser.Act_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_simple}.
	 * @param ctx the parse tree
	 */
	void exitAct_simple(FailPointActionParser.Act_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_gdb}.
	 * @param ctx the parse tree
	 */
	void enterAct_gdb(FailPointActionParser.Act_gdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_gdb}.
	 * @param ctx the parse tree
	 */
	void exitAct_gdb(FailPointActionParser.Act_gdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_gcore}.
	 * @param ctx the parse tree
	 */
	void enterAct_gcore(FailPointActionParser.Act_gcoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_gcore}.
	 * @param ctx the parse tree
	 */
	void exitAct_gcore(FailPointActionParser.Act_gcoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_repeated}.
	 * @param ctx the parse tree
	 */
	void enterAct_repeated(FailPointActionParser.Act_repeatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_repeated}.
	 * @param ctx the parse tree
	 */
	void exitAct_repeated(FailPointActionParser.Act_repeatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_randomized}.
	 * @param ctx the parse tree
	 */
	void enterAct_randomized(FailPointActionParser.Act_randomizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_randomized}.
	 * @param ctx the parse tree
	 */
	void exitAct_randomized(FailPointActionParser.Act_randomizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_probable}.
	 * @param ctx the parse tree
	 */
	void enterAct_probable(FailPointActionParser.Act_probableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_probable}.
	 * @param ctx the parse tree
	 */
	void exitAct_probable(FailPointActionParser.Act_probableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_nop}.
	 * @param ctx the parse tree
	 */
	void enterAct_nop(FailPointActionParser.Act_nopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_nop}.
	 * @param ctx the parse tree
	 */
	void exitAct_nop(FailPointActionParser.Act_nopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_stall_return}.
	 * @param ctx the parse tree
	 */
	void enterAct_stall_return(FailPointActionParser.Act_stall_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_stall_return}.
	 * @param ctx the parse tree
	 */
	void exitAct_stall_return(FailPointActionParser.Act_stall_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_stall}.
	 * @param ctx the parse tree
	 */
	void enterAct_stall(FailPointActionParser.Act_stallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_stall}.
	 * @param ctx the parse tree
	 */
	void exitAct_stall(FailPointActionParser.Act_stallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_return}.
	 * @param ctx the parse tree
	 */
	void enterAct_return(FailPointActionParser.Act_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_return}.
	 * @param ctx the parse tree
	 */
	void exitAct_return(FailPointActionParser.Act_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_show}.
	 * @param ctx the parse tree
	 */
	void enterAct_show(FailPointActionParser.Act_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_show}.
	 * @param ctx the parse tree
	 */
	void exitAct_show(FailPointActionParser.Act_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_disable}.
	 * @param ctx the parse tree
	 */
	void enterAct_disable(FailPointActionParser.Act_disableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_disable}.
	 * @param ctx the parse tree
	 */
	void exitAct_disable(FailPointActionParser.Act_disableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_enable}.
	 * @param ctx the parse tree
	 */
	void enterAct_enable(FailPointActionParser.Act_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_enable}.
	 * @param ctx the parse tree
	 */
	void exitAct_enable(FailPointActionParser.Act_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_status}.
	 * @param ctx the parse tree
	 */
	void enterAct_status(FailPointActionParser.Act_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_status}.
	 * @param ctx the parse tree
	 */
	void exitAct_status(FailPointActionParser.Act_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_clear}.
	 * @param ctx the parse tree
	 */
	void enterAct_clear(FailPointActionParser.Act_clearContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_clear}.
	 * @param ctx the parse tree
	 */
	void exitAct_clear(FailPointActionParser.Act_clearContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FailPointActionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FailPointActionParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#numerical_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_literal(FailPointActionParser.Numerical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#numerical_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_literal(FailPointActionParser.Numerical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(FailPointActionParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(FailPointActionParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FailPointActionParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FailPointActionParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(FailPointActionParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(FailPointActionParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(FailPointActionParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(FailPointActionParser.FloatLiteralContext ctx);
}