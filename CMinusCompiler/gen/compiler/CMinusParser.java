// Generated from /home/nicbacic/workspace/java/antlr/trabalho-ach2087/CMinusCompiler/CMinus.g4 by ANTLR 4.7
package compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, COMMENT=27, WS=28, LETTER=29, DIGIT=30;
	public static final int
		RULE_program = 0, RULE_list_declartion = 1, RULE_declaration = 2, RULE_var_declaration = 3, 
		RULE_function_declaration = 4, RULE_type = 5, RULE_params = 6, RULE_list_params = 7, 
		RULE_param = 8, RULE_function = 9, RULE_local_var_declaration = 10, RULE_list_statement = 11, 
		RULE_statement = 12, RULE_expression_declaration = 13, RULE_if_else_declaration = 14, 
		RULE_iterator_declaration = 15, RULE_return_declaration = 16, RULE_expression = 17, 
		RULE_var = 18, RULE_simple_expression = 19, RULE_sum_expression = 20, 
		RULE_term = 21, RULE_factor = 22, RULE_function_call = 23, RULE_args = 24, 
		RULE_arg_list = 25, RULE_write_func = 26, RULE_relational_operator = 27, 
		RULE_sum = 28, RULE_mult = 29;
	public static final String[] ruleNames = {
		"program", "list_declartion", "declaration", "var_declaration", "function_declaration", 
		"type", "params", "list_params", "param", "function", "local_var_declaration", 
		"list_statement", "statement", "expression_declaration", "if_else_declaration", 
		"iterator_declaration", "return_declaration", "expression", "var", "simple_expression", 
		"sum_expression", "term", "factor", "function_call", "args", "arg_list", 
		"write_func", "relational_operator", "sum", "mult"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'('", "')'", "'int'", "'void'", "','", "'{'", 
		"'}'", "'if'", "'else'", "'while'", "'return'", "'='", "'write'", "'<='", 
		"'<'", "'>'", "'>='", "'=='", "'!='", "'+'", "'-'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMMENT", "WS", "LETTER", "DIGIT"
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
	public String getGrammarFileName() { return "CMinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List_declartionContext list_declartion() {
			return getRuleContext(List_declartionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			list_declartion(0);
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

	public static class List_declartionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Write_funcContext write_func() {
			return getRuleContext(Write_funcContext.class,0);
		}
		public List_declartionContext list_declartion() {
			return getRuleContext(List_declartionContext.class,0);
		}
		public List_declartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_declartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterList_declartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitList_declartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitList_declartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_declartionContext list_declartion() throws RecognitionException {
		return list_declartion(0);
	}

	private List_declartionContext list_declartion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_declartionContext _localctx = new List_declartionContext(_ctx, _parentState);
		List_declartionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_list_declartion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				{
				setState(63);
				declaration();
				}
				break;
			case T__15:
				{
				setState(64);
				write_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_declartionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list_declartion);
					setState(67);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(68);
					declaration();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				function_declaration();
				}
				break;
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

	public static class Var_declarationContext extends ParserRuleContext {
		public Token varName;
		public Token number;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(CMinusParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(CMinusParser.DIGIT, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type();
				setState(79);
				((Var_declarationContext)_localctx).varName = match(LETTER);
				setState(80);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				type();
				setState(83);
				((Var_declarationContext)_localctx).varName = match(LETTER);
				setState(84);
				match(T__1);
				setState(85);
				((Var_declarationContext)_localctx).number = match(DIGIT);
				setState(86);
				match(T__2);
				setState(87);
				match(T__0);
				}
				break;
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Token funcName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(CMinusParser.LETTER, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			type();
			setState(92);
			((Function_declarationContext)_localctx).funcName = match(LETTER);
			setState(93);
			match(T__3);
			setState(94);
			params();
			setState(95);
			match(T__4);
			setState(96);
			function();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ParamsContext extends ParserRuleContext {
		public List_paramsContext list_params() {
			return getRuleContext(List_paramsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				list_params(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__6);
				}
				break;
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

	public static class List_paramsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public List_paramsContext list_params() {
			return getRuleContext(List_paramsContext.class,0);
		}
		public List_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterList_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitList_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitList_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_paramsContext list_params() throws RecognitionException {
		return list_params(0);
	}

	private List_paramsContext list_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_paramsContext _localctx = new List_paramsContext(_ctx, _parentState);
		List_paramsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_list_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list_params);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(T__7);
					setState(109);
					param();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Token paramName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(CMinusParser.LETTER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				type();
				setState(116);
				((ParamContext)_localctx).paramName = match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				type();
				setState(119);
				((ParamContext)_localctx).paramName = match(LETTER);
				setState(120);
				match(T__1);
				setState(121);
				match(T__2);
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public Local_var_declarationContext local_var_declaration() {
			return getRuleContext(Local_var_declarationContext.class,0);
		}
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			setState(126);
			local_var_declaration();
			setState(127);
			list_statement();
			setState(128);
			match(T__9);
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

	public static class Local_var_declarationContext extends ParserRuleContext {
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public Local_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterLocal_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitLocal_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitLocal_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_var_declarationContext local_var_declaration() throws RecognitionException {
		Local_var_declarationContext _localctx = new Local_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_local_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(130);
				var_declaration();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class List_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterList_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitList_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitList_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_statementContext list_statement() throws RecognitionException {
		List_statementContext _localctx = new List_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public Expression_declarationContext expression_declaration() {
			return getRuleContext(Expression_declarationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public If_else_declarationContext if_else_declaration() {
			return getRuleContext(If_else_declarationContext.class,0);
		}
		public Iterator_declarationContext iterator_declaration() {
			return getRuleContext(Iterator_declarationContext.class,0);
		}
		public Return_declarationContext return_declaration() {
			return getRuleContext(Return_declarationContext.class,0);
		}
		public Write_funcContext write_func() {
			return getRuleContext(Write_funcContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case LETTER:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expression_declaration();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				function();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				if_else_declaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				iterator_declaration();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				return_declaration();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				write_func();
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

	public static class Expression_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExpression_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExpression_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExpression_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_declarationContext expression_declaration() throws RecognitionException {
		Expression_declarationContext _localctx = new Expression_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression_declaration);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case LETTER:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expression();
				setState(151);
				match(T__0);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__0);
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

	public static class If_else_declarationContext extends ParserRuleContext {
		public If_else_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_declaration; }
	 
		public If_else_declarationContext() { }
		public void copyFrom(If_else_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseContext extends If_else_declarationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseContext(If_else_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends If_else_declarationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfContext(If_else_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_declarationContext if_else_declaration() throws RecognitionException {
		If_else_declarationContext _localctx = new If_else_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_else_declaration);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__10);
				setState(157);
				match(T__3);
				setState(158);
				expression();
				setState(159);
				match(T__4);
				setState(160);
				statement();
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__10);
				setState(163);
				match(T__3);
				setState(164);
				expression();
				setState(165);
				match(T__4);
				setState(166);
				statement();
				setState(167);
				match(T__11);
				setState(168);
				statement();
				}
				break;
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

	public static class Iterator_declarationContext extends ParserRuleContext {
		public Iterator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator_declaration; }
	 
		public Iterator_declarationContext() { }
		public void copyFrom(Iterator_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends Iterator_declarationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(Iterator_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iterator_declarationContext iterator_declaration() throws RecognitionException {
		Iterator_declarationContext _localctx = new Iterator_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iterator_declaration);
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__12);
			setState(173);
			match(T__3);
			setState(174);
			expression();
			setState(175);
			match(T__4);
			setState(176);
			statement();
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

	public static class Return_declarationContext extends ParserRuleContext {
		public Return_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_declaration; }
	 
		public Return_declarationContext() { }
		public void copyFrom(Return_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpressionContext extends Return_declarationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(Return_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends Return_declarationContext {
		public ReturnContext(Return_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_declarationContext return_declaration() throws RecognitionException {
		Return_declarationContext _localctx = new Return_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_declaration);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__13);
				setState(179);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__13);
				setState(181);
				expression();
				setState(182);
				match(T__0);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				var();
				setState(187);
				match(T__14);
				setState(188);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				simple_expression();
				}
				break;
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

	public static class VarContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode LETTER() { return getToken(CMinusParser.LETTER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((VarContext)_localctx).varName = match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((VarContext)_localctx).varName = match(LETTER);
				setState(195);
				match(T__1);
				setState(196);
				expression();
				setState(197);
				match(T__2);
				}
				break;
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public List<Sum_expressionContext> sum_expression() {
			return getRuleContexts(Sum_expressionContext.class);
		}
		public Sum_expressionContext sum_expression(int i) {
			return getRuleContext(Sum_expressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple_expression);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				sum_expression(0);
				setState(202);
				relational_operator();
				setState(203);
				sum_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				sum_expression(0);
				}
				break;
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

	public static class Sum_expressionContext extends ParserRuleContext {
		public Sum_expressionContext left;
		public TermContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Sum_expressionContext sum_expression() {
			return getRuleContext(Sum_expressionContext.class,0);
		}
		public Sum_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSum_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_expressionContext sum_expression() throws RecognitionException {
		return sum_expression(0);
	}

	private Sum_expressionContext sum_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sum_expressionContext _localctx = new Sum_expressionContext(_ctx, _parentState);
		Sum_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_sum_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_expressionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sum_expression);
					setState(211);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(212);
					sum();
					setState(213);
					((Sum_expressionContext)_localctx).right = term(0);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext left;
		public FactorContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					mult();
					setState(225);
					((TermContext)_localctx).right = factor();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Token number;
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(CMinusParser.DIGIT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__3);
				setState(233);
				simple_expression();
				setState(234);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				((FactorContext)_localctx).number = match(DIGIT);
				}
				break;
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

	public static class Function_callContext extends ParserRuleContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(CMinusParser.LETTER, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((Function_callContext)_localctx).funcName = match(LETTER);
			setState(242);
			match(T__3);
			setState(243);
			args();
			setState(244);
			match(T__4);
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

	public static class ArgsContext extends ParserRuleContext {
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				setState(246);
				arg_list(0);
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

	public static class Arg_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		return arg_list(0);
	}

	private Arg_listContext arg_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arg_listContext _localctx = new Arg_listContext(_ctx, _parentState);
		Arg_listContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arg_list);
					setState(252);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(253);
					match(T__7);
					setState(254);
					expression();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Write_funcContext extends ParserRuleContext {
		public Token number;
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(CMinusParser.DIGIT, 0); }
		public Write_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterWrite_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitWrite_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitWrite_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_funcContext write_func() throws RecognitionException {
		Write_funcContext _localctx = new Write_funcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_write_func);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__15);
				setState(261);
				match(T__3);
				setState(262);
				function_call();
				setState(263);
				match(T__4);
				setState(264);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__15);
				setState(267);
				match(T__3);
				setState(268);
				var();
				setState(269);
				match(T__4);
				setState(270);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(T__15);
				setState(273);
				match(T__3);
				setState(274);
				((Write_funcContext)_localctx).number = match(DIGIT);
				setState(275);
				match(T__4);
				setState(276);
				match(T__0);
				}
				break;
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

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
	 
		public Relational_operatorContext() { }
		public void copyFrom(Relational_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BgContext extends Relational_operatorContext {
		public BgContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BneqContext extends Relational_operatorContext {
		public BneqContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBneq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBneq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBneq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BleqContext extends Relational_operatorContext {
		public BleqContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBleq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBleq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBleq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlContext extends Relational_operatorContext {
		public BlContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BgeqContext extends Relational_operatorContext {
		public BgeqContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBgeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBgeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBgeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeqContext extends Relational_operatorContext {
		public BeqContext(Relational_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterBeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitBeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitBeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relational_operator);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new BleqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new BlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new BgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new BgeqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new BeqContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new BneqContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				match(T__21);
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

	public static class SumContext extends ParserRuleContext {
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	 
		public SumContext() { }
		public void copyFrom(SumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends SumContext {
		public AddContext(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends SumContext {
		public SubContext(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sum);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__23);
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

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	 
		public MultContext() { }
		public void copyFrom(MultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends MultContext {
		public DivContext(MultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiContext extends MultContext {
		public MultiContext(MultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mult);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new MultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T__25);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return list_declartion_sempred((List_declartionContext)_localctx, predIndex);
		case 7:
			return list_params_sempred((List_paramsContext)_localctx, predIndex);
		case 20:
			return sum_expression_sempred((Sum_expressionContext)_localctx, predIndex);
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		case 25:
			return arg_list_sempred((Arg_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_declartion_sempred(List_declartionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean list_params_sempred(List_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_expression_sempred(Sum_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arg_list_sempred(Arg_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\5\3D\n\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\5\4O\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f"+
		"\t\16\tt\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\r\7\r\u008c\n\r\f\r"+
		"\16\r\u008f\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3"+
		"\17\3\17\3\17\5\17\u009d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ad\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00c2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ca\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u00da\n\26\f\26\16\26\u00dd\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00f2\n\30\3\31\3\31\3\31\3\31\3\31\3\32\5\32\u00fa"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0102\n\33\f\33\16\33\u0105\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0118\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0120\n\35\3\36\3\36\5\36\u0124\n\36\3\37\3\37\5\37\u0128\n\37\3\37\2"+
		"\7\4\20*,\64 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<\2\3\3\2\b\t\2\u012f\2>\3\2\2\2\4C\3\2\2\2\6N\3\2\2\2\b[\3\2\2\2"+
		"\n]\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22}\3\2\2\2\24\177\3\2"+
		"\2\2\26\u0087\3\2\2\2\30\u008d\3\2\2\2\32\u0096\3\2\2\2\34\u009c\3\2\2"+
		"\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00ba\3\2\2\2$\u00c1\3\2\2\2&\u00c9"+
		"\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00de\3\2\2\2.\u00f1\3\2\2\2\60"+
		"\u00f3\3\2\2\2\62\u00f9\3\2\2\2\64\u00fb\3\2\2\2\66\u0117\3\2\2\28\u011f"+
		"\3\2\2\2:\u0123\3\2\2\2<\u0127\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@A\b\3\1\2"+
		"AD\5\6\4\2BD\5\66\34\2C@\3\2\2\2CB\3\2\2\2DI\3\2\2\2EF\f\5\2\2FH\5\6\4"+
		"\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LO\5\b"+
		"\5\2MO\5\n\6\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2PQ\5\f\7\2QR\7\37\2\2RS\7"+
		"\3\2\2S\\\3\2\2\2TU\5\f\7\2UV\7\37\2\2VW\7\4\2\2WX\7 \2\2XY\7\5\2\2YZ"+
		"\7\3\2\2Z\\\3\2\2\2[P\3\2\2\2[T\3\2\2\2\\\t\3\2\2\2]^\5\f\7\2^_\7\37\2"+
		"\2_`\7\6\2\2`a\5\16\b\2ab\7\7\2\2bc\5\24\13\2c\13\3\2\2\2de\t\2\2\2e\r"+
		"\3\2\2\2fi\5\20\t\2gi\7\t\2\2hf\3\2\2\2hg\3\2\2\2i\17\3\2\2\2jk\b\t\1"+
		"\2kl\5\22\n\2lr\3\2\2\2mn\f\4\2\2no\7\n\2\2oq\5\22\n\2pm\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\5\f\7\2vw\7\37\2\2w~"+
		"\3\2\2\2xy\5\f\7\2yz\7\37\2\2z{\7\4\2\2{|\7\5\2\2|~\3\2\2\2}u\3\2\2\2"+
		"}x\3\2\2\2~\23\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\5\26\f\2\u0081\u0082"+
		"\5\30\r\2\u0082\u0083\7\f\2\2\u0083\25\3\2\2\2\u0084\u0086\5\b\5\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\27\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\32\16\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\31\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0097\5\34\17\2\u0091"+
		"\u0097\5\24\13\2\u0092\u0097\5\36\20\2\u0093\u0097\5 \21\2\u0094\u0097"+
		"\5\"\22\2\u0095\u0097\5\66\34\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2"+
		"\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\33\3\2\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\3\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009d\7\3\2\2\u009c\u0098\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\35\3\2\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1"+
		"\5$\23\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00ad\3\2\2\2"+
		"\u00a4\u00a5\7\r\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8"+
		"\7\7\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\5\32\16"+
		"\2\u00ab\u00ad\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ad\37"+
		"\3\2\2\2\u00ae\u00af\7\17\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\5$\23\2"+
		"\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\32\16\2\u00b3!\3\2\2\2\u00b4\u00b5"+
		"\7\20\2\2\u00b5\u00bb\7\3\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5$\23\2"+
		"\u00b8\u00b9\7\3\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\21\2\2\u00be"+
		"\u00bf\5$\23\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5(\25\2\u00c1\u00bc\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00ca\7\37\2\2\u00c4\u00c5"+
		"\7\37\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\7\5\2\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\'\3"+
		"\2\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd\58\35\2\u00cd\u00ce\5*\26\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d1\5*\26\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1)\3\2\2\2\u00d2\u00d3\b\26\1\2\u00d3\u00d4\5,\27\2\u00d4\u00db"+
		"\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\5:\36\2\u00d7\u00d8\5,\27\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\b\27\1\2\u00df\u00e0\5.\30\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\f\4\2\2"+
		"\u00e2\u00e3\5<\37\2\u00e3\u00e4\5.\30\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"-\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5(\25\2"+
		"\u00ec\u00ed\7\7\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00f2\5&\24\2\u00ef\u00f2"+
		"\5\60\31\2\u00f0\u00f2\7 \2\2\u00f1\u00ea\3\2\2\2\u00f1\u00ee\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2/\3\2\2\2\u00f3\u00f4\7"+
		"\37\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7\7\2\2"+
		"\u00f7\61\3\2\2\2\u00f8\u00fa\5\64\33\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u00fc\b\33\1\2\u00fc\u00fd\5$\23\2\u00fd"+
		"\u0103\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100\7\n\2\2\u0100\u0102\5$"+
		"\23\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\65\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\22\2"+
		"\2\u0107\u0108\7\6\2\2\u0108\u0109\5\60\31\2\u0109\u010a\7\7\2\2\u010a"+
		"\u010b\7\3\2\2\u010b\u0118\3\2\2\2\u010c\u010d\7\22\2\2\u010d\u010e\7"+
		"\6\2\2\u010e\u010f\5&\24\2\u010f\u0110\7\7\2\2\u0110\u0111\7\3\2\2\u0111"+
		"\u0118\3\2\2\2\u0112\u0113\7\22\2\2\u0113\u0114\7\6\2\2\u0114\u0115\7"+
		" \2\2\u0115\u0116\7\7\2\2\u0116\u0118\7\3\2\2\u0117\u0106\3\2\2\2\u0117"+
		"\u010c\3\2\2\2\u0117\u0112\3\2\2\2\u0118\67\3\2\2\2\u0119\u0120\7\23\2"+
		"\2\u011a\u0120\7\24\2\2\u011b\u0120\7\25\2\2\u011c\u0120\7\26\2\2\u011d"+
		"\u0120\7\27\2\2\u011e\u0120\7\30\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3"+
		"\2\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u01209\3\2\2\2\u0121\u0124\7\31\2\2\u0122\u0124\7\32\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124;\3\2\2\2\u0125\u0128"+
		"\7\33\2\2\u0126\u0128\7\34\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2"+
		"\u0128=\3\2\2\2\33CIN[hr}\u0087\u008d\u0096\u009c\u00ac\u00ba\u00c1\u00c9"+
		"\u00d0\u00db\u00e7\u00f1\u00f9\u0103\u0117\u011f\u0123\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}