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
	 * Enter a parse tree produced by {@link FailPointActionParser#failpoint_action_internal}.
	 * @param ctx the parse tree
	 */
	void enterFailpoint_action_internal(FailPointActionParser.Failpoint_action_internalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#failpoint_action_internal}.
	 * @param ctx the parse tree
	 */
	void exitFailpoint_action_internal(FailPointActionParser.Failpoint_action_internalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_series}.
	 * @param ctx the parse tree
	 */
	void enterAct_series(FailPointActionParser.Act_seriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_series}.
	 * @param ctx the parse tree
	 */
	void exitAct_series(FailPointActionParser.Act_seriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_series_trail}.
	 * @param ctx the parse tree
	 */
	void enterAct_series_trail(FailPointActionParser.Act_series_trailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_series_trail}.
	 * @param ctx the parse tree
	 */
	void exitAct_series_trail(FailPointActionParser.Act_series_trailContext ctx);
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
	 * Enter a parse tree produced by {@link FailPointActionParser#act_series_elm}.
	 * @param ctx the parse tree
	 */
	void enterAct_series_elm(FailPointActionParser.Act_series_elmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_series_elm}.
	 * @param ctx the parse tree
	 */
	void exitAct_series_elm(FailPointActionParser.Act_series_elmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_random}.
	 * @param ctx the parse tree
	 */
	void enterAct_random(FailPointActionParser.Act_randomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_random}.
	 * @param ctx the parse tree
	 */
	void exitAct_random(FailPointActionParser.Act_randomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_random_elm}.
	 * @param ctx the parse tree
	 */
	void enterAct_random_elm(FailPointActionParser.Act_random_elmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_random_elm}.
	 * @param ctx the parse tree
	 */
	void exitAct_random_elm(FailPointActionParser.Act_random_elmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#random_prob}.
	 * @param ctx the parse tree
	 */
	void enterRandom_prob(FailPointActionParser.Random_probContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#random_prob}.
	 * @param ctx the parse tree
	 */
	void exitRandom_prob(FailPointActionParser.Random_probContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_qualifiable}.
	 * @param ctx the parse tree
	 */
	void enterAct_qualifiable(FailPointActionParser.Act_qualifiableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_qualifiable}.
	 * @param ctx the parse tree
	 */
	void exitAct_qualifiable(FailPointActionParser.Act_qualifiableContext ctx);
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
	 * Enter a parse tree produced by {@link FailPointActionParser#repeat_times}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_times(FailPointActionParser.Repeat_timesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#repeat_times}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_times(FailPointActionParser.Repeat_timesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FailPointActionParser#act_repeatable}.
	 * @param ctx the parse tree
	 */
	void enterAct_repeatable(FailPointActionParser.Act_repeatableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FailPointActionParser#act_repeatable}.
	 * @param ctx the parse tree
	 */
	void exitAct_repeatable(FailPointActionParser.Act_repeatableContext ctx);
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