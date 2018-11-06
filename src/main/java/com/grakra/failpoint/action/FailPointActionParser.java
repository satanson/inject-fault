// Generated from com/grakra/failpoint/action/FailPointAction.g4 by ANTLR 4.7.1
package com.grakra.failpoint.action;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FailPointActionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BooleanLiteral=1, StringLiteral=2, IntegerLiteral=3, FloatLiteral=4, Ignored_Ws=5, 
		Arrow=6, Gdb=7, Gcore=8, Return=9, Stall=10, StallReturn=11, Disable=12, 
		Enable=13, Show=14, Status=15, Clear=16, Nop=17, LeftParenthesis=18, RightParenthesis=19, 
		LeftBracket=20, RightBracket=21, Star=22, Comma=23;
	public static final int
		RULE_failpoint_action = 0, RULE_failpoint_action_internal = 1, RULE_act_series = 2, 
		RULE_act_series_trail = 3, RULE_act_simple = 4, RULE_act_series_elm = 5, 
		RULE_act_random = 6, RULE_act_random_elm = 7, RULE_random_prob = 8, RULE_act_qualifiable = 9, 
		RULE_act_repeated = 10, RULE_repeat_times = 11, RULE_act_repeatable = 12, 
		RULE_act_gdb = 13, RULE_act_gcore = 14, RULE_act_nop = 15, RULE_act_stall_return = 16, 
		RULE_act_stall = 17, RULE_act_return = 18, RULE_act_show = 19, RULE_act_disable = 20, 
		RULE_act_enable = 21, RULE_act_status = 22, RULE_act_clear = 23, RULE_literal = 24, 
		RULE_numerical_literal = 25, RULE_booleanLiteral = 26, RULE_stringLiteral = 27, 
		RULE_integerLiteral = 28, RULE_floatLiteral = 29;
	public static final String[] ruleNames = {
		"failpoint_action", "failpoint_action_internal", "act_series", "act_series_trail", 
		"act_simple", "act_series_elm", "act_random", "act_random_elm", "random_prob", 
		"act_qualifiable", "act_repeated", "repeat_times", "act_repeatable", "act_gdb", 
		"act_gcore", "act_nop", "act_stall_return", "act_stall", "act_return", 
		"act_show", "act_disable", "act_enable", "act_status", "act_clear", "literal", 
		"numerical_literal", "booleanLiteral", "stringLiteral", "integerLiteral", 
		"floatLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'->'", "'gdb'", "'gcore'", "'return'", 
		"'stall'", "'stall_return'", "'disable'", "'enable'", "'show'", "'status'", 
		"'clear'", "'nop'", "'('", "')'", "'['", "']'", "'*'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BooleanLiteral", "StringLiteral", "IntegerLiteral", "FloatLiteral", 
		"Ignored_Ws", "Arrow", "Gdb", "Gcore", "Return", "Stall", "StallReturn", 
		"Disable", "Enable", "Show", "Status", "Clear", "Nop", "LeftParenthesis", 
		"RightParenthesis", "LeftBracket", "RightBracket", "Star", "Comma"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FailPointAction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FailPointActionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Failpoint_actionContext extends ParserRuleContext {
		public Failpoint_action_internalContext failpoint_action_internal() {
			return getRuleContext(Failpoint_action_internalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FailPointActionParser.EOF, 0); }
		public Failpoint_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failpoint_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterFailpoint_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitFailpoint_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitFailpoint_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Failpoint_actionContext failpoint_action() throws RecognitionException {
		Failpoint_actionContext _localctx = new Failpoint_actionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_failpoint_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			failpoint_action_internal();
			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Failpoint_action_internalContext extends ParserRuleContext {
		public Act_simpleContext act_simple() {
			return getRuleContext(Act_simpleContext.class,0);
		}
		public Act_seriesContext act_series() {
			return getRuleContext(Act_seriesContext.class,0);
		}
		public Failpoint_action_internalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failpoint_action_internal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterFailpoint_action_internal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitFailpoint_action_internal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitFailpoint_action_internal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Failpoint_action_internalContext failpoint_action_internal() throws RecognitionException {
		Failpoint_action_internalContext _localctx = new Failpoint_action_internalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_failpoint_action_internal);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Gdb:
			case Gcore:
			case Disable:
			case Enable:
			case Show:
			case Status:
			case Clear:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				act_simple();
				}
				break;
			case IntegerLiteral:
			case Return:
			case Stall:
			case StallReturn:
			case Nop:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				act_series();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_seriesContext extends ParserRuleContext {
		public List<Act_series_elmContext> act_series_elm() {
			return getRuleContexts(Act_series_elmContext.class);
		}
		public Act_series_elmContext act_series_elm(int i) {
			return getRuleContext(Act_series_elmContext.class,i);
		}
		public List<TerminalNode> Arrow() { return getTokens(FailPointActionParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(FailPointActionParser.Arrow, i);
		}
		public Act_series_trailContext act_series_trail() {
			return getRuleContext(Act_series_trailContext.class,0);
		}
		public Act_seriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_series(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_series(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_series(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_seriesContext act_series() throws RecognitionException {
		Act_seriesContext _localctx = new Act_seriesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_act_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			act_series_elm();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Arrow) {
				{
				{
				setState(68);
				match(Arrow);
				setState(69);
				act_series_elm();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Disable) {
				{
				setState(75);
				act_series_trail();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_series_trailContext extends ParserRuleContext {
		public Act_disableContext act_disable() {
			return getRuleContext(Act_disableContext.class,0);
		}
		public Act_series_trailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_series_trail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_series_trail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_series_trail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_series_trail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_series_trailContext act_series_trail() throws RecognitionException {
		Act_series_trailContext _localctx = new Act_series_trailContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_act_series_trail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			act_disable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_simpleContext extends ParserRuleContext {
		public Act_gdbContext act_gdb() {
			return getRuleContext(Act_gdbContext.class,0);
		}
		public Act_gcoreContext act_gcore() {
			return getRuleContext(Act_gcoreContext.class,0);
		}
		public Act_enableContext act_enable() {
			return getRuleContext(Act_enableContext.class,0);
		}
		public Act_statusContext act_status() {
			return getRuleContext(Act_statusContext.class,0);
		}
		public Act_clearContext act_clear() {
			return getRuleContext(Act_clearContext.class,0);
		}
		public Act_showContext act_show() {
			return getRuleContext(Act_showContext.class,0);
		}
		public Act_disableContext act_disable() {
			return getRuleContext(Act_disableContext.class,0);
		}
		public Act_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_simpleContext act_simple() throws RecognitionException {
		Act_simpleContext _localctx = new Act_simpleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_act_simple);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Gdb:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				act_gdb();
				}
				break;
			case Gcore:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				act_gcore();
				}
				break;
			case Enable:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				act_enable();
				}
				break;
			case Status:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				act_status();
				}
				break;
			case Clear:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				act_clear();
				}
				break;
			case Show:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				act_show();
				}
				break;
			case Disable:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				act_disable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_series_elmContext extends ParserRuleContext {
		public Act_repeatableContext act_repeatable() {
			return getRuleContext(Act_repeatableContext.class,0);
		}
		public Act_repeatedContext act_repeated() {
			return getRuleContext(Act_repeatedContext.class,0);
		}
		public Act_series_elmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_series_elm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_series_elm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_series_elm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_series_elm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_series_elmContext act_series_elm() throws RecognitionException {
		Act_series_elmContext _localctx = new Act_series_elmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_act_series_elm);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
			case Stall:
			case StallReturn:
			case Nop:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				act_repeatable();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				act_repeated();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_randomContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(FailPointActionParser.LeftBracket, 0); }
		public List<Act_random_elmContext> act_random_elm() {
			return getRuleContexts(Act_random_elmContext.class);
		}
		public Act_random_elmContext act_random_elm(int i) {
			return getRuleContext(Act_random_elmContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(FailPointActionParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(FailPointActionParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(FailPointActionParser.Comma, i);
		}
		public Act_randomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_random(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_random(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_random(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_randomContext act_random() throws RecognitionException {
		Act_randomContext _localctx = new Act_randomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_act_random);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LeftBracket);
			setState(94);
			act_random_elm();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(95);
				match(Comma);
				setState(96);
				act_random_elm();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_random_elmContext extends ParserRuleContext {
		public Random_probContext random_prob() {
			return getRuleContext(Random_probContext.class,0);
		}
		public TerminalNode Star() { return getToken(FailPointActionParser.Star, 0); }
		public Act_qualifiableContext act_qualifiable() {
			return getRuleContext(Act_qualifiableContext.class,0);
		}
		public Act_random_elmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_random_elm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_random_elm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_random_elm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_random_elm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_random_elmContext act_random_elm() throws RecognitionException {
		Act_random_elmContext _localctx = new Act_random_elmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_act_random_elm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			random_prob();
			setState(105);
			match(Star);
			setState(106);
			act_qualifiable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Random_probContext extends ParserRuleContext {
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public Random_probContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random_prob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterRandom_prob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitRandom_prob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitRandom_prob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Random_probContext random_prob() throws RecognitionException {
		Random_probContext _localctx = new Random_probContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_random_prob);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			floatLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_qualifiableContext extends ParserRuleContext {
		public Act_nopContext act_nop() {
			return getRuleContext(Act_nopContext.class,0);
		}
		public Act_stallContext act_stall() {
			return getRuleContext(Act_stallContext.class,0);
		}
		public Act_returnContext act_return() {
			return getRuleContext(Act_returnContext.class,0);
		}
		public Act_stall_returnContext act_stall_return() {
			return getRuleContext(Act_stall_returnContext.class,0);
		}
		public Act_qualifiableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_qualifiable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_qualifiable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_qualifiable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_qualifiable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_qualifiableContext act_qualifiable() throws RecognitionException {
		Act_qualifiableContext _localctx = new Act_qualifiableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_act_qualifiable);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nop:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				act_nop();
				}
				break;
			case Stall:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				act_stall();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				act_return();
				}
				break;
			case StallReturn:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				act_stall_return();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_repeatedContext extends ParserRuleContext {
		public Repeat_timesContext repeat_times() {
			return getRuleContext(Repeat_timesContext.class,0);
		}
		public TerminalNode Star() { return getToken(FailPointActionParser.Star, 0); }
		public Act_repeatableContext act_repeatable() {
			return getRuleContext(Act_repeatableContext.class,0);
		}
		public Act_repeatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_repeated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_repeated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_repeated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_repeated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_repeatedContext act_repeated() throws RecognitionException {
		Act_repeatedContext _localctx = new Act_repeatedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_act_repeated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			repeat_times();
			setState(117);
			match(Star);
			setState(118);
			act_repeatable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_timesContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public Repeat_timesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_times; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterRepeat_times(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitRepeat_times(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitRepeat_times(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_timesContext repeat_times() throws RecognitionException {
		Repeat_timesContext _localctx = new Repeat_timesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeat_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_repeatableContext extends ParserRuleContext {
		public Act_qualifiableContext act_qualifiable() {
			return getRuleContext(Act_qualifiableContext.class,0);
		}
		public Act_randomContext act_random() {
			return getRuleContext(Act_randomContext.class,0);
		}
		public Act_repeatableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_repeatable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_repeatable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_repeatable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_repeatable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_repeatableContext act_repeatable() throws RecognitionException {
		Act_repeatableContext _localctx = new Act_repeatableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_act_repeatable);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
			case Stall:
			case StallReturn:
			case Nop:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				act_qualifiable();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				act_random();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_gdbContext extends ParserRuleContext {
		public TerminalNode Gdb() { return getToken(FailPointActionParser.Gdb, 0); }
		public Act_gdbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_gdb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_gdb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_gdb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_gdb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_gdbContext act_gdb() throws RecognitionException {
		Act_gdbContext _localctx = new Act_gdbContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_act_gdb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Gdb);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_gcoreContext extends ParserRuleContext {
		public TerminalNode Gcore() { return getToken(FailPointActionParser.Gcore, 0); }
		public Act_gcoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_gcore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_gcore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_gcore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_gcore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_gcoreContext act_gcore() throws RecognitionException {
		Act_gcoreContext _localctx = new Act_gcoreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_act_gcore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Gcore);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_nopContext extends ParserRuleContext {
		public TerminalNode Nop() { return getToken(FailPointActionParser.Nop, 0); }
		public Act_nopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_nop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_nop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_nop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_nop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_nopContext act_nop() throws RecognitionException {
		Act_nopContext _localctx = new Act_nopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_act_nop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Nop);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_stall_returnContext extends ParserRuleContext {
		public TerminalNode StallReturn() { return getToken(FailPointActionParser.StallReturn, 0); }
		public TerminalNode LeftParenthesis() { return getToken(FailPointActionParser.LeftParenthesis, 0); }
		public Numerical_literalContext numerical_literal() {
			return getRuleContext(Numerical_literalContext.class,0);
		}
		public TerminalNode Comma() { return getToken(FailPointActionParser.Comma, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(FailPointActionParser.RightParenthesis, 0); }
		public Act_stall_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_stall_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_stall_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_stall_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_stall_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_stall_returnContext act_stall_return() throws RecognitionException {
		Act_stall_returnContext _localctx = new Act_stall_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_act_stall_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(StallReturn);
			setState(133);
			match(LeftParenthesis);
			setState(134);
			numerical_literal();
			setState(135);
			match(Comma);
			setState(136);
			literal();
			setState(137);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_stallContext extends ParserRuleContext {
		public TerminalNode Stall() { return getToken(FailPointActionParser.Stall, 0); }
		public TerminalNode LeftParenthesis() { return getToken(FailPointActionParser.LeftParenthesis, 0); }
		public Numerical_literalContext numerical_literal() {
			return getRuleContext(Numerical_literalContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(FailPointActionParser.RightParenthesis, 0); }
		public Act_stallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_stall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_stall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_stall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_stall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_stallContext act_stall() throws RecognitionException {
		Act_stallContext _localctx = new Act_stallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_act_stall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Stall);
			setState(140);
			match(LeftParenthesis);
			setState(141);
			numerical_literal();
			setState(142);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_returnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(FailPointActionParser.Return, 0); }
		public TerminalNode LeftParenthesis() { return getToken(FailPointActionParser.LeftParenthesis, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(FailPointActionParser.RightParenthesis, 0); }
		public Act_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_returnContext act_return() throws RecognitionException {
		Act_returnContext _localctx = new Act_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_act_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Return);
			setState(145);
			match(LeftParenthesis);
			setState(146);
			literal();
			setState(147);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_showContext extends ParserRuleContext {
		public TerminalNode Show() { return getToken(FailPointActionParser.Show, 0); }
		public Act_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_show(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_show(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_showContext act_show() throws RecognitionException {
		Act_showContext _localctx = new Act_showContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_act_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Show);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_disableContext extends ParserRuleContext {
		public TerminalNode Disable() { return getToken(FailPointActionParser.Disable, 0); }
		public Act_disableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_disable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_disable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_disable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_disable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_disableContext act_disable() throws RecognitionException {
		Act_disableContext _localctx = new Act_disableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_act_disable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(Disable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_enableContext extends ParserRuleContext {
		public TerminalNode Enable() { return getToken(FailPointActionParser.Enable, 0); }
		public Act_enableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_enable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_enable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_enable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_enable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_enableContext act_enable() throws RecognitionException {
		Act_enableContext _localctx = new Act_enableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_act_enable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Enable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_statusContext extends ParserRuleContext {
		public TerminalNode Status() { return getToken(FailPointActionParser.Status, 0); }
		public Act_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_status(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_status(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_statusContext act_status() throws RecognitionException {
		Act_statusContext _localctx = new Act_statusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_act_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Status);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Act_clearContext extends ParserRuleContext {
		public TerminalNode Clear() { return getToken(FailPointActionParser.Clear, 0); }
		public Act_clearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterAct_clear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitAct_clear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitAct_clear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Act_clearContext act_clear() throws RecognitionException {
		Act_clearContext _localctx = new Act_clearContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_act_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Clear);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				booleanLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				stringLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				integerLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				floatLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numerical_literalContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public Numerical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterNumerical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitNumerical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitNumerical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_literalContext numerical_literal() throws RecognitionException {
		Numerical_literalContext _localctx = new Numerical_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numerical_literal);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				integerLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				floatLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(FailPointActionParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(FailPointActionParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(FailPointActionParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(FailPointActionParser.FloatLiteral, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FailPointActionListener ) ((FailPointActionListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FailPointActionVisitor ) return ((FailPointActionVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FloatLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\5\4O\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\5\7^\n\7\3\b\3\b\3"+
		"\b\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\177\n"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00a6\n\32\3\33"+
		"\3\33\5\33\u00aa\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2"+
		" \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2"+
		"\u00a8\2>\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bP\3\2\2\2\nY\3\2\2\2\f]\3\2\2"+
		"\2\16_\3\2\2\2\20j\3\2\2\2\22n\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2\30z\3\2"+
		"\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2\"\u0086"+
		"\3\2\2\2$\u008d\3\2\2\2&\u0092\3\2\2\2(\u0097\3\2\2\2*\u0099\3\2\2\2,"+
		"\u009b\3\2\2\2.\u009d\3\2\2\2\60\u009f\3\2\2\2\62\u00a5\3\2\2\2\64\u00a9"+
		"\3\2\2\2\66\u00ab\3\2\2\28\u00ad\3\2\2\2:\u00af\3\2\2\2<\u00b1\3\2\2\2"+
		">?\5\4\3\2?@\7\2\2\3@\3\3\2\2\2AD\5\n\6\2BD\5\6\4\2CA\3\2\2\2CB\3\2\2"+
		"\2D\5\3\2\2\2EJ\5\f\7\2FG\7\b\2\2GI\5\f\7\2HF\3\2\2\2IL\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\5\b\5\2NM\3\2\2\2NO\3\2\2\2O\7\3"+
		"\2\2\2PQ\5*\26\2Q\t\3\2\2\2RZ\5\34\17\2SZ\5\36\20\2TZ\5,\27\2UZ\5.\30"+
		"\2VZ\5\60\31\2WZ\5(\25\2XZ\5*\26\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2"+
		"\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\13\3\2\2\2[^\5\32\16\2\\^\5\26\f\2"+
		"][\3\2\2\2]\\\3\2\2\2^\r\3\2\2\2_`\7\26\2\2`e\5\20\t\2ab\7\31\2\2bd\5"+
		"\20\t\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi"+
		"\7\27\2\2i\17\3\2\2\2jk\5\22\n\2kl\7\30\2\2lm\5\24\13\2m\21\3\2\2\2no"+
		"\5<\37\2o\23\3\2\2\2pu\5 \21\2qu\5$\23\2ru\5&\24\2su\5\"\22\2tp\3\2\2"+
		"\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\25\3\2\2\2vw\5\30\r\2wx\7\30\2\2xy\5"+
		"\32\16\2y\27\3\2\2\2z{\5:\36\2{\31\3\2\2\2|\177\5\24\13\2}\177\5\16\b"+
		"\2~|\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080\u0081\7\t\2\2\u0081\35\3\2"+
		"\2\2\u0082\u0083\7\n\2\2\u0083\37\3\2\2\2\u0084\u0085\7\23\2\2\u0085!"+
		"\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\24\2\2\u0088\u0089\5\64\33"+
		"\2\u0089\u008a\7\31\2\2\u008a\u008b\5\62\32\2\u008b\u008c\7\25\2\2\u008c"+
		"#\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f\7\24\2\2\u008f\u0090\5\64\33"+
		"\2\u0090\u0091\7\25\2\2\u0091%\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0094"+
		"\7\24\2\2\u0094\u0095\5\62\32\2\u0095\u0096\7\25\2\2\u0096\'\3\2\2\2\u0097"+
		"\u0098\7\20\2\2\u0098)\3\2\2\2\u0099\u009a\7\16\2\2\u009a+\3\2\2\2\u009b"+
		"\u009c\7\17\2\2\u009c-\3\2\2\2\u009d\u009e\7\21\2\2\u009e/\3\2\2\2\u009f"+
		"\u00a0\7\22\2\2\u00a0\61\3\2\2\2\u00a1\u00a6\5\66\34\2\u00a2\u00a6\58"+
		"\35\2\u00a3\u00a6\5:\36\2\u00a4\u00a6\5<\37\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\63\3\2\2"+
		"\2\u00a7\u00aa\5:\36\2\u00a8\u00aa\5<\37\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\65\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac\67\3\2\2\2\u00ad\u00ae"+
		"\7\4\2\2\u00ae9\3\2\2\2\u00af\u00b0\7\5\2\2\u00b0;\3\2\2\2\u00b1\u00b2"+
		"\7\6\2\2\u00b2=\3\2\2\2\fCJNY]et~\u00a5\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}