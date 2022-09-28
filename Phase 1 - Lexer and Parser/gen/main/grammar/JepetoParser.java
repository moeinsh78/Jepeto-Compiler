// Generated from /Users/atieharmin/Desktop/term 6/Compiler/Project/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JepetoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINT=2, FUNC=3, RETURN=4, IF=5, ELSE=6, VOID=7, SIZE=8, TRUE=9, 
		FALSE=10, ARROW=11, GREATER_THAN=12, LESS_THAN=13, NOT_EQUAL=14, EQUAL=15, 
		MULT=16, DIVIDE=17, PLUS=18, MINUS=19, AND=20, OR=21, NOT=22, ASSIGN=23, 
		LPAR=24, RPAR=25, LBRACK=26, RBRACK=27, LBRACE=28, RBRACE=29, COMMA=30, 
		COLON=31, APPEND=32, SEMICOLLON=33, INT_VALUE=34, IDENTIFIER=35, STRING_VALUE=36, 
		COMMENT=37, WS=38;
	public static final int
		RULE_jepeto = 0, RULE_jepetoProgram = 1, RULE_main = 2, RULE_functionCall = 3, 
		RULE_functionCallArguments = 4, RULE_valueArguments = 5, RULE_keyValueArguments = 6, 
		RULE_func = 7, RULE_funcBody = 8, RULE_returnStatement = 9, RULE_functionPointer = 10, 
		RULE_returnBlock = 11, RULE_normalBlock = 12, RULE_printStatement = 13, 
		RULE_expression = 14, RULE_andExpression = 15, RULE_equalityExpression = 16, 
		RULE_comparitiveExpression = 17, RULE_additiveExpression = 18, RULE_multiplicativeExpression = 19, 
		RULE_unaryExpression = 20, RULE_appendicalExpression = 21, RULE_sizeExpression = 22, 
		RULE_sizePrimeExpression = 23, RULE_getAccessExpression = 24, RULE_otherExpression = 25, 
		RULE_values = 26, RULE_list = 27, RULE_ifStatement = 28, RULE_ifBody = 29, 
		RULE_ifReturnStatement = 30, RULE_ifReturnBody = 31, RULE_statement = 32, 
		RULE_identifier = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"jepeto", "jepetoProgram", "main", "functionCall", "functionCallArguments", 
			"valueArguments", "keyValueArguments", "func", "funcBody", "returnStatement", 
			"functionPointer", "returnBlock", "normalBlock", "printStatement", "expression", 
			"andExpression", "equalityExpression", "comparitiveExpression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "appendicalExpression", 
			"sizeExpression", "sizePrimeExpression", "getAccessExpression", "otherExpression", 
			"values", "list", "ifStatement", "ifBody", "ifReturnStatement", "ifReturnBody", 
			"statement", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'print'", "'func'", "'return'", "'if'", "'else'", "'void'", 
			"'.size'", "'true'", "'false'", "'->'", "'>'", "'<'", "'not'", "'is'", 
			"'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'~'", "'='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "':'", "'::'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINT", "FUNC", "RETURN", "IF", "ELSE", "VOID", "SIZE", 
			"TRUE", "FALSE", "ARROW", "GREATER_THAN", "LESS_THAN", "NOT_EQUAL", "EQUAL", 
			"MULT", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "NOT", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "COLON", "APPEND", 
			"SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Jepeto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JepetoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JepetoContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JepetoParser.EOF, 0); }
		public JepetoProgramContext jepetoProgram() {
			return getRuleContext(JepetoProgramContext.class,0);
		}
		public JepetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jepeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterJepeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitJepeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitJepeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JepetoContext jepeto() throws RecognitionException {
		JepetoContext _localctx = new JepetoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jepeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN || _la==FUNC) {
				{
				setState(68);
				jepetoProgram();
				}
			}

			setState(71);
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

	public static class JepetoProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public JepetoProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jepetoProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterJepetoProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitJepetoProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitJepetoProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JepetoProgramContext jepetoProgram() throws RecognitionException {
		JepetoProgramContext _localctx = new JepetoProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jepetoProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(73);
				func();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			main();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(80);
				func();
				}
				}
				setState(85);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(JepetoParser.MAIN, 0); }
		public TerminalNode COLON() { return getToken(JepetoParser.COLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MAIN);

			                System.out.println("Main");
			            
			setState(88);
			match(COLON);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(89);
				functionCall();
				}
				break;
			case PRINT:
				{
				setState(90);
				printStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public List<TerminalNode> LPAR() { return getTokens(JepetoParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(JepetoParser.LPAR, i);
		}
		public List<FunctionCallArgumentsContext> functionCallArguments() {
			return getRuleContexts(FunctionCallArgumentsContext.class);
		}
		public FunctionCallArgumentsContext functionCallArguments(int i) {
			return getRuleContext(FunctionCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(JepetoParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(JepetoParser.RPAR, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			identifier();

			                            System.out.println("FunctionCall");
			                         
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(LPAR);
				setState(96);
				functionCallArguments();
				setState(97);
				match(RPAR);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAR );
			setState(103);
			match(SEMICOLLON);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public KeyValueArgumentsContext keyValueArguments() {
			return getRuleContext(KeyValueArgumentsContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCallArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(105);
				valueArguments();
				}
				break;
			case 2:
				{
				setState(106);
				keyValueArguments();
				}
				break;
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

	public static class ValueArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitValueArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitValueArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valueArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					expression();
					setState(110);
					match(COMMA);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(117);
			expression();
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

	public static class KeyValueArgumentsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(JepetoParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(JepetoParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public KeyValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterKeyValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitKeyValueArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitKeyValueArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueArgumentsContext keyValueArguments() throws RecognitionException {
		KeyValueArgumentsContext _localctx = new KeyValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyValueArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					identifier();
					setState(120);
					match(ASSIGN);
					setState(121);
					expression();
					setState(122);
					match(COMMA);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			{
			setState(129);
			identifier();
			setState(130);
			match(ASSIGN);
			setState(131);
			expression();
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

	public static class FuncContext extends ParserRuleContext {
		public IdentifierContext funcName;
		public IdentifierContext arg;
		public TerminalNode FUNC() { return getToken(JepetoParser.FUNC, 0); }
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(JepetoParser.COLON, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FUNC);
			setState(134);
			((FuncContext)_localctx).funcName = identifier();

			                                    System.out.println("FunctionDec : "+(((FuncContext)_localctx).funcName!=null?_input.getText(((FuncContext)_localctx).funcName.start,((FuncContext)_localctx).funcName.stop):null));
			                                
			setState(136);
			match(LPAR);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						((FuncContext)_localctx).arg = identifier();

						                                                            System.out.println("ArgumentDec : "+(((FuncContext)_localctx).arg!=null?_input.getText(((FuncContext)_localctx).arg.start,((FuncContext)_localctx).arg.stop):null));
						                                                        
						setState(139);
						match(COMMA);
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(146);
				((FuncContext)_localctx).arg = identifier();

				                                                                                    System.out.println("ArgumentDec : "+(((FuncContext)_localctx).arg!=null?_input.getText(((FuncContext)_localctx).arg.start,((FuncContext)_localctx).arg.stop):null));
				                                                                                 
				}
			}

			setState(151);
			match(RPAR);
			setState(152);
			match(COLON);
			setState(153);
			funcBody();
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

	public static class FuncBodyContext extends ParserRuleContext {
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcBody);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				returnBlock();
				}
				break;
			case RETURN:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				returnStatement();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JepetoParser.RETURN, 0); }
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JepetoParser.VOID, 0); }
		public IfReturnStatementContext ifReturnStatement() {
			return getRuleContext(IfReturnStatementContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(RETURN);

				                            System.out.println("Return");
				                        
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case MINUS:
				case NOT:
				case LPAR:
				case LBRACK:
				case INT_VALUE:
				case IDENTIFIER:
				case STRING_VALUE:
					{
					setState(161);
					expression();
					}
					break;
				case VOID:
					{
					setState(162);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165);
				match(SEMICOLLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				ifReturnStatement();
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

	public static class FunctionPointerContext extends ParserRuleContext {
		public IdentifierContext arg;
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public TerminalNode ARROW() { return getToken(JepetoParser.ARROW, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public FunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerContext functionPointer() throws RecognitionException {
		FunctionPointerContext _localctx = new FunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionPointer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LPAR);

			                         System.out.println("Anonymous Function");
			                     
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						((FunctionPointerContext)_localctx).arg = identifier();

						                                            System.out.println("ArgumentDec : "+(((FunctionPointerContext)_localctx).arg!=null?_input.getText(((FunctionPointerContext)_localctx).arg.start,((FunctionPointerContext)_localctx).arg.stop):null));
						                                        
						setState(173);
						match(COMMA);
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(180);
				((FunctionPointerContext)_localctx).arg = identifier();

				                                                                    System.out.println("ArgumentDec : "+(((FunctionPointerContext)_localctx).arg!=null?_input.getText(((FunctionPointerContext)_localctx).arg.start,((FunctionPointerContext)_localctx).arg.stop):null));
				                                                                 
				}
			}

			setState(185);
			match(RPAR);
			setState(186);
			match(ARROW);
			setState(187);
			returnBlock();
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JepetoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JepetoParser.RBRACE, 0); }
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitReturnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LBRACE);
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(190);
							statement();
							}
							} 
						}
						setState(195);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(196);
					returnStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(201);
				statement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(RBRACE);
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

	public static class NormalBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JepetoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JepetoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NormalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterNormalBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitNormalBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitNormalBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalBlockContext normalBlock() throws RecognitionException {
		NormalBlockContext _localctx = new NormalBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_normalBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RBRACE);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(JepetoParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PRINT);

			                        System.out.println("Built-in : print");
			                      
			setState(220);
			match(LPAR);
			setState(221);
			expression();
			setState(222);
			match(RPAR);
			setState(223);
			match(SEMICOLLON);
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
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JepetoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JepetoParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			andExpression();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(226);
				match(OR);
				setState(227);
				andExpression();

				                                                System.out.println("Operator : or");
				                                            
				}
				}
				setState(234);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JepetoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JepetoParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			equalityExpression();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(236);
				match(AND);
				setState(237);
				equalityExpression();

				                                                            System.out.println("Operator : and");
				                                                           
				}
				}
				setState(244);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<ComparitiveExpressionContext> comparitiveExpression() {
			return getRuleContexts(ComparitiveExpressionContext.class);
		}
		public ComparitiveExpressionContext comparitiveExpression(int i) {
			return getRuleContext(ComparitiveExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(JepetoParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JepetoParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(JepetoParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(JepetoParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			comparitiveExpression();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(246);
					match(EQUAL);
					setState(247);
					comparitiveExpression();

					                                                                        System.out.println("Operator : is");
					                                                                        
					}
					break;
				case NOT_EQUAL:
					{
					setState(250);
					match(NOT_EQUAL);
					setState(251);
					comparitiveExpression();

					                                                                                                            System.out.println("Operator : not");
					                                                                                                           
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(258);
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

	public static class ComparitiveExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(JepetoParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(JepetoParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(JepetoParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(JepetoParser.LESS_THAN, i);
		}
		public ComparitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparitiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterComparitiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitComparitiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitComparitiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparitiveExpressionContext comparitiveExpression() throws RecognitionException {
		ComparitiveExpressionContext _localctx = new ComparitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparitiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			additiveExpression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(260);
					match(GREATER_THAN);
					setState(261);
					additiveExpression();

					                                                                                System.out.println("Operator : >");
					                                                                             
					}
					break;
				case LESS_THAN:
					{
					setState(264);
					match(LESS_THAN);
					setState(265);
					additiveExpression();

					                                                                                                                System.out.println("Operator : <");
					                                                                                                            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(272);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JepetoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JepetoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JepetoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JepetoParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			multiplicativeExpression();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(274);
					match(PLUS);
					setState(275);
					multiplicativeExpression();

					                                                                                System.out.println("Operator : +");
					                                                                             
					}
					break;
				case MINUS:
					{
					setState(278);
					match(MINUS);
					setState(279);
					multiplicativeExpression();

					                                                                                        System.out.println("Operator : -");
					                                                                                     
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(286);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(JepetoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(JepetoParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(JepetoParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(JepetoParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			unaryExpression();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				setState(296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(288);
					match(MULT);
					setState(289);
					unaryExpression();

					                                                                    System.out.println("Operator : *");
					                                                                 
					}
					break;
				case DIVIDE:
					{
					setState(292);
					match(DIVIDE);
					setState(293);
					unaryExpression();

					                                                                                System.out.println("Operator : /");
					                                                                           
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(300);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(JepetoParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(JepetoParser.MINUS, 0); }
		public AppendicalExpressionContext appendicalExpression() {
			return getRuleContext(AppendicalExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpression);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(301);
					match(NOT);
					setState(302);
					unaryExpression();

					                                            System.out.println("Operator : ~");
					                                        
					}
					break;
				case MINUS:
					{
					setState(305);
					match(MINUS);
					setState(306);
					unaryExpression();

					                                                                    System.out.println("Operator : -");
					                                                                
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TRUE:
			case FALSE:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				appendicalExpression();
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

	public static class AppendicalExpressionContext extends ParserRuleContext {
		public List<SizeExpressionContext> sizeExpression() {
			return getRuleContexts(SizeExpressionContext.class);
		}
		public SizeExpressionContext sizeExpression(int i) {
			return getRuleContext(SizeExpressionContext.class,i);
		}
		public List<TerminalNode> APPEND() { return getTokens(JepetoParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(JepetoParser.APPEND, i);
		}
		public AppendicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAppendicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAppendicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAppendicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendicalExpressionContext appendicalExpression() throws RecognitionException {
		AppendicalExpressionContext _localctx = new AppendicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_appendicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			sizeExpression();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPEND) {
				{
				{
				setState(315);
				match(APPEND);
				setState(316);
				sizeExpression();

				                                                                System.out.println("Operator : ::");
				                                                            
				}
				}
				setState(323);
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

	public static class SizeExpressionContext extends ParserRuleContext {
		public GetAccessExpressionContext getAccessExpression() {
			return getRuleContext(GetAccessExpressionContext.class,0);
		}
		public SizePrimeExpressionContext sizePrimeExpression() {
			return getRuleContext(SizePrimeExpressionContext.class,0);
		}
		public SizeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSizeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSizeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSizeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeExpressionContext sizeExpression() throws RecognitionException {
		SizeExpressionContext _localctx = new SizeExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sizeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			getAccessExpression();
			setState(325);
			sizePrimeExpression();
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

	public static class SizePrimeExpressionContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(JepetoParser.SIZE, 0); }
		public SizePrimeExpressionContext sizePrimeExpression() {
			return getRuleContext(SizePrimeExpressionContext.class,0);
		}
		public SizePrimeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizePrimeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSizePrimeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSizePrimeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSizePrimeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizePrimeExpressionContext sizePrimeExpression() throws RecognitionException {
		SizePrimeExpressionContext _localctx = new SizePrimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sizePrimeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIZE) {
				{
				setState(327);
				match(SIZE);
				setState(328);
				sizePrimeExpression();

				                                                    System.out.println("Size");
				                                                
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

	public static class GetAccessExpressionContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JepetoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JepetoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JepetoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JepetoParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(JepetoParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(JepetoParser.LPAR, i);
		}
		public List<FunctionCallArgumentsContext> functionCallArguments() {
			return getRuleContexts(FunctionCallArgumentsContext.class);
		}
		public FunctionCallArgumentsContext functionCallArguments(int i) {
			return getRuleContext(FunctionCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(JepetoParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(JepetoParser.RPAR, i);
		}
		public GetAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAccessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterGetAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitGetAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitGetAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAccessExpressionContext getAccessExpression() throws RecognitionException {
		GetAccessExpressionContext _localctx = new GetAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_getAccessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			otherExpression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR || _la==LBRACK) {
				{
				setState(342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(334);
					match(LBRACK);
					setState(335);
					expression();
					setState(336);
					match(RBRACK);
					}
					}
					break;
				case LPAR:
					{
					{
					setState(338);
					match(LPAR);
					setState(339);
					functionCallArguments();
					setState(340);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(346);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_otherExpression);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(LPAR);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
					{
					setState(350);
					expression();
					}
				}

				setState(353);
				match(RPAR);
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JepetoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JepetoParser.FALSE, 0); }
		public TerminalNode INT_VALUE() { return getToken(JepetoParser.INT_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(JepetoParser.STRING_VALUE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionPointerContext functionPointer() {
			return getRuleContext(FunctionPointerContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_values);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(FALSE);
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(INT_VALUE);
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(STRING_VALUE);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				list();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(361);
				functionPointer();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JepetoParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JepetoParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LBRACK);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(365);
						expression();
						setState(366);
						match(COMMA);
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(373);
				expression();
				}
			}

			setState(376);
			match(RBRACK);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JepetoParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(JepetoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JepetoParser.COLON, i);
		}
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JepetoParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(IF);

			                    System.out.println("Conditional : if");
			                
			setState(380);
			expression();
			setState(381);
			match(COLON);
			setState(382);
			ifBody();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(383);
				match(ELSE);

				                                                System.out.println("Conditional : else");
				                                            
				setState(385);
				match(COLON);
				setState(386);
				ifBody();
				}
				break;
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

	public static class IfBodyContext extends ParserRuleContext {
		public NormalBlockContext normalBlock() {
			return getRuleContext(NormalBlockContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifBody);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				normalBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				returnBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				returnStatement();
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

	public static class IfReturnStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JepetoParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(JepetoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JepetoParser.COLON, i);
		}
		public List<IfReturnBodyContext> ifReturnBody() {
			return getRuleContexts(IfReturnBodyContext.class);
		}
		public IfReturnBodyContext ifReturnBody(int i) {
			return getRuleContext(IfReturnBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JepetoParser.ELSE, 0); }
		public IfReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfReturnStatementContext ifReturnStatement() throws RecognitionException {
		IfReturnStatementContext _localctx = new IfReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(IF);

			                        System.out.println("Conditional : if");
			                    
			setState(397);
			expression();
			setState(398);
			match(COLON);
			setState(399);
			ifReturnBody();
			setState(400);
			match(ELSE);

			                                                        System.out.println("Conditional : else");
			                                                     
			setState(402);
			match(COLON);
			setState(403);
			ifReturnBody();
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

	public static class IfReturnBodyContext extends ParserRuleContext {
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfReturnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifReturnBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfReturnBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfReturnBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfReturnBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfReturnBodyContext ifReturnBody() throws RecognitionException {
		IfReturnBodyContext _localctx = new IfReturnBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifReturnBody);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				returnBlock();
				}
				break;
			case RETURN:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				returnStatement();
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				ifStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				printStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				functionCall();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JepetoParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u01a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\3\2\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3"+
		"\3\3\7\3T\n\3\f\3\16\3W\13\3\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\6\5f\n\5\r\5\16\5g\3\5\3\5\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\7"+
		"\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16"+
		"\b\u0082\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090"+
		"\n\t\f\t\16\t\u0093\13\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\13\3\13\5\13"+
		"\u00aa\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b2\n\f\f\f\16\f\u00b5\13\f"+
		"\3\f\3\f\3\f\5\f\u00ba\n\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00c2\n\r\f\r\16"+
		"\r\u00c5\13\r\3\r\6\r\u00c8\n\r\r\r\16\r\u00c9\3\r\7\r\u00cd\n\r\f\r\16"+
		"\r\u00d0\13\r\3\r\3\r\3\16\3\16\7\16\u00d6\n\16\f\16\16\16\u00d9\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00e9\n\20\f\20\16\20\u00ec\13\20\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00f3\n\21\f\21\16\21\u00f6\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u011d\n\24\f\24\16\24\u0120"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u012b\n\25\f"+
		"\25\16\25\u012e\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0138"+
		"\n\26\3\26\5\26\u013b\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0142\n\27\f"+
		"\27\16\27\u0145\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u014e\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0159\n\32\f\32"+
		"\16\32\u015c\13\32\3\33\3\33\3\33\3\33\5\33\u0162\n\33\3\33\5\33\u0165"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016d\n\34\3\35\3\35\3\35\3\35"+
		"\7\35\u0173\n\35\f\35\16\35\u0176\13\35\3\35\5\35\u0179\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0186\n\36\3\37\3\37"+
		"\3\37\3\37\5\37\u018c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\5!\u019a"+
		"\n!\3\"\3\"\3\"\5\"\u019f\n\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\2\u01b5\2G\3\2\2\2\4N\3\2"+
		"\2\2\6X\3\2\2\2\b_\3\2\2\2\nm\3\2\2\2\ft\3\2\2\2\16\u0080\3\2\2\2\20\u0087"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00a9\3\2\2\2\26\u00ab\3\2\2\2\30\u00bf\3"+
		"\2\2\2\32\u00d3\3\2\2\2\34\u00dc\3\2\2\2\36\u00e3\3\2\2\2 \u00ed\3\2\2"+
		"\2\"\u00f7\3\2\2\2$\u0105\3\2\2\2&\u0113\3\2\2\2(\u0121\3\2\2\2*\u013a"+
		"\3\2\2\2,\u013c\3\2\2\2.\u0146\3\2\2\2\60\u014d\3\2\2\2\62\u014f\3\2\2"+
		"\2\64\u0164\3\2\2\2\66\u016c\3\2\2\28\u016e\3\2\2\2:\u017c\3\2\2\2<\u018b"+
		"\3\2\2\2>\u018d\3\2\2\2@\u0199\3\2\2\2B\u019e\3\2\2\2D\u01a0\3\2\2\2F"+
		"H\5\4\3\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\2\2\3J\3\3\2\2\2KM\5\20\t"+
		"\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\5\6\4"+
		"\2RT\5\20\t\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2"+
		"\2\2XY\7\3\2\2YZ\b\4\1\2Z]\7!\2\2[^\5\b\5\2\\^\5\34\17\2][\3\2\2\2]\\"+
		"\3\2\2\2^\7\3\2\2\2_`\5D#\2`e\b\5\1\2ab\7\32\2\2bc\5\n\6\2cd\7\33\2\2"+
		"df\3\2\2\2ea\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7#\2\2"+
		"j\t\3\2\2\2kn\5\f\7\2ln\5\16\b\2mk\3\2\2\2ml\3\2\2\2mn\3\2\2\2n\13\3\2"+
		"\2\2op\5\36\20\2pq\7 \2\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\36\20\2x\r\3\2\2\2yz\5D#\2z{\7\31\2\2{"+
		"|\5\36\20\2|}\7 \2\2}\177\3\2\2\2~y\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\5D#\2\u0084\u0085\7\31\2\2\u0085\u0086\5\36\20\2\u0086\17\3\2\2"+
		"\2\u0087\u0088\7\5\2\2\u0088\u0089\5D#\2\u0089\u008a\b\t\1\2\u008a\u0097"+
		"\7\32\2\2\u008b\u008c\5D#\2\u008c\u008d\b\t\1\2\u008d\u008e\7 \2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\5D#\2\u0095\u0096\b\t\1\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\33\2\2\u009a"+
		"\u009b\7!\2\2\u009b\u009c\5\22\n\2\u009c\21\3\2\2\2\u009d\u00a0\5\30\r"+
		"\2\u009e\u00a0\5\24\13\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\23\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a5\b\13\1\2\u00a3\u00a6\5\36"+
		"\20\2\u00a4\u00a6\7\t\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00aa\7#\2\2\u00a8\u00aa\5> \2\u00a9\u00a1\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00b9"+
		"\b\f\1\2\u00ad\u00ae\5D#\2\u00ae\u00af\b\f\1\2\u00af\u00b0\7 \2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\5D#\2\u00b7\u00b8\b\f\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\33\2\2\u00bc"+
		"\u00bd\7\r\2\2\u00bd\u00be\5\30\r\2\u00be\27\3\2\2\2\u00bf\u00c7\7\36"+
		"\2\2\u00c0\u00c2\5B\"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c8\5\24\13\2\u00c7\u00c3\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\5B"+
		"\"\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\37"+
		"\2\2\u00d2\31\3\2\2\2\u00d3\u00d7\7\36\2\2\u00d4\u00d6\5B\"\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\37\2\2\u00db\33\3\2\2"+
		"\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\b\17\1\2\u00de\u00df\7\32\2\2\u00df"+
		"\u00e0\5\36\20\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2\7#\2\2\u00e2\35\3\2"+
		"\2\2\u00e3\u00ea\5 \21\2\u00e4\u00e5\7\27\2\2\u00e5\u00e6\5 \21\2\u00e6"+
		"\u00e7\b\20\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\37\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f4\5\"\22\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\5"+
		"\"\22\2\u00f0\u00f1\b\21\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5!\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u0102\5$\23\2\u00f8\u00f9\7\21\2\2\u00f9\u00fa"+
		"\5$\23\2\u00fa\u00fb\b\22\1\2\u00fb\u0101\3\2\2\2\u00fc\u00fd\7\20\2\2"+
		"\u00fd\u00fe\5$\23\2\u00fe\u00ff\b\22\1\2\u00ff\u0101\3\2\2\2\u0100\u00f8"+
		"\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0110\5&\24\2"+
		"\u0106\u0107\7\16\2\2\u0107\u0108\5&\24\2\u0108\u0109\b\23\1\2\u0109\u010f"+
		"\3\2\2\2\u010a\u010b\7\17\2\2\u010b\u010c\5&\24\2\u010c\u010d\b\23\1\2"+
		"\u010d\u010f\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111%\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u011e\5(\25\2\u0114\u0115\7\24\2\2\u0115\u0116\5"+
		"(\25\2\u0116\u0117\b\24\1\2\u0117\u011d\3\2\2\2\u0118\u0119\7\25\2\2\u0119"+
		"\u011a\5(\25\2\u011a\u011b\b\24\1\2\u011b\u011d\3\2\2\2\u011c\u0114\3"+
		"\2\2\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\'\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u012c\5*\26\2"+
		"\u0122\u0123\7\22\2\2\u0123\u0124\5*\26\2\u0124\u0125\b\25\1\2\u0125\u012b"+
		"\3\2\2\2\u0126\u0127\7\23\2\2\u0127\u0128\5*\26\2\u0128\u0129\b\25\1\2"+
		"\u0129\u012b\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0126\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d)\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7\30\2\2\u0130\u0131\5*\26\2\u0131\u0132\b"+
		"\26\1\2\u0132\u0138\3\2\2\2\u0133\u0134\7\25\2\2\u0134\u0135\5*\26\2\u0135"+
		"\u0136\b\26\1\2\u0136\u0138\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0133\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u013b\5,\27\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b+\3\2\2\2\u013c\u0143\5.\30\2\u013d\u013e\7\"\2\2"+
		"\u013e\u013f\5.\30\2\u013f\u0140\b\27\1\2\u0140\u0142\3\2\2\2\u0141\u013d"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"-\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\5\62\32\2\u0147\u0148\5\60\31"+
		"\2\u0148/\3\2\2\2\u0149\u014a\7\n\2\2\u014a\u014b\5\60\31\2\u014b\u014c"+
		"\b\31\1\2\u014c\u014e\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\61\3\2\2\2\u014f\u015a\5\64\33\2\u0150\u0151\7\34\2\2\u0151\u0152"+
		"\5\36\20\2\u0152\u0153\7\35\2\2\u0153\u0159\3\2\2\2\u0154\u0155\7\32\2"+
		"\2\u0155\u0156\5\n\6\2\u0156\u0157\7\33\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0150\3\2\2\2\u0158\u0154\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\63\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0165"+
		"\5\66\34\2\u015e\u0165\5D#\2\u015f\u0161\7\32\2\2\u0160\u0162\5\36\20"+
		"\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165"+
		"\7\33\2\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2"+
		"\u0165\65\3\2\2\2\u0166\u016d\7\13\2\2\u0167\u016d\7\f\2\2\u0168\u016d"+
		"\7$\2\2\u0169\u016d\7&\2\2\u016a\u016d\58\35\2\u016b\u016d\5\26\f\2\u016c"+
		"\u0166\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u0169\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\67\3\2\2\2\u016e\u0178"+
		"\7\34\2\2\u016f\u0170\5\36\20\2\u0170\u0171\7 \2\2\u0171\u0173\3\2\2\2"+
		"\u0172\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5\36\20\2"+
		"\u0178\u0174\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b"+
		"\7\35\2\2\u017b9\3\2\2\2\u017c\u017d\7\7\2\2\u017d\u017e\b\36\1\2\u017e"+
		"\u017f\5\36\20\2\u017f\u0180\7!\2\2\u0180\u0185\5<\37\2\u0181\u0182\7"+
		"\b\2\2\u0182\u0183\b\36\1\2\u0183\u0184\7!\2\2\u0184\u0186\5<\37\2\u0185"+
		"\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186;\3\2\2\2\u0187\u018c\5\32\16"+
		"\2\u0188\u018c\5\30\r\2\u0189\u018c\5B\"\2\u018a\u018c\5\24\13\2\u018b"+
		"\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c=\3\2\2\2\u018d\u018e\7\7\2\2\u018e\u018f\b \1\2\u018f\u0190"+
		"\5\36\20\2\u0190\u0191\7!\2\2\u0191\u0192\5@!\2\u0192\u0193\7\b\2\2\u0193"+
		"\u0194\b \1\2\u0194\u0195\7!\2\2\u0195\u0196\5@!\2\u0196?\3\2\2\2\u0197"+
		"\u019a\5\30\r\2\u0198\u019a\5\24\13\2\u0199\u0197\3\2\2\2\u0199\u0198"+
		"\3\2\2\2\u019aA\3\2\2\2\u019b\u019f\5:\36\2\u019c\u019f\5\34\17\2\u019d"+
		"\u019f\5\b\5\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2"+
		"\2\2\u019fC\3\2\2\2\u01a0\u01a1\7%\2\2\u01a1E\3\2\2\2.GNU]gmt\u0080\u0091"+
		"\u0097\u009f\u00a5\u00a9\u00b3\u00b9\u00c3\u00c9\u00ce\u00d7\u00ea\u00f4"+
		"\u0100\u0102\u010e\u0110\u011c\u011e\u012a\u012c\u0137\u013a\u0143\u014d"+
		"\u0158\u015a\u0161\u0164\u016c\u0174\u0178\u0185\u018b\u0199\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}