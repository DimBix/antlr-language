// Generated from /home/dimitri/Desktop/Univr/Linguaggi/Elaborato/src/Imp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, INT=2, BOOL=3, FLOAT=4, CONST=5, VAR=6, ADD=7, SUB=8, MUL=9, 
		DIV=10, MOD=11, POW=12, CONC=13, AND=14, OR=15, NOT=16, EQQ=17, NEQ=18, 
		LEQ=19, GEQ=20, LT=21, GT=22, IF=23, FOR=24, ELSE=25, WHILE=26, SKIPP=27, 
		ASSIGN=28, PRINT=29, INPUT=30, SLY=31, ARNOLD=32, ND=33, TO=34, FUN=35, 
		RET=36, STR=37, LPAR=38, RPAR=39, LQUAD=40, RQUAD=41, LBRACE=42, RBRACE=43, 
		SEMICOLON=44, ID=45, DOT=46, COMMA=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_com = 1, RULE_idDecAssign = 2, RULE_idAssign = 3, 
		RULE_idTypeDec = 4, RULE_fun = 5, RULE_exp = 6, RULE_types = 7, RULE_bfCom = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "com", "idDecAssign", "idAssign", "idTypeDec", "fun", "exp", 
			"types", "bfCom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'CONST'", "'var'", "'+'", "'-'", "'*'", 
			"'/'", "'mod'", "'^'", "'++'", "'&&'", "'||'", "'!'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'if'", "'for'", "'else'", "'while'", "'skip'", 
			"'='", "'print'", "'input'", "'sly'", "'arnold'", "'ND'", "'to'", "'fun'", 
			"'ret'", "'str'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", null, 
			"'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "INT", "BOOL", "FLOAT", "CONST", "VAR", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "POW", "CONC", "AND", "OR", "NOT", "EQQ", "NEQ", 
			"LEQ", "GEQ", "LT", "GT", "IF", "FOR", "ELSE", "WHILE", "SKIPP", "ASSIGN", 
			"PRINT", "INPUT", "SLY", "ARNOLD", "ND", "TO", "FUN", "RET", "STR", "LPAR", 
			"RPAR", "LQUAD", "RQUAD", "LBRACE", "RBRACE", "SEMICOLON", "ID", "DOT", 
			"COMMA", "WS"
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
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			com(0);
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ComContext {
		public TerminalNode PRINT() { return getToken(ImpParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public OutputContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonDetContext extends ComContext {
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public TerminalNode ND() { return getToken(ImpParser.ND, 0); }
		public TerminalNode LQUAD() { return getToken(ImpParser.LQUAD, 0); }
		public TerminalNode RQUAD() { return getToken(ImpParser.RQUAD, 0); }
		public NonDetContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNonDet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNonDet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNonDet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionComContext extends ComContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FunctionComContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunctionCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunctionCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunctionCom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDefContext extends ComContext {
		public TerminalNode FUN() { return getToken(ImpParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public List<IdTypeDecContext> idTypeDec() {
			return getRuleContexts(IdTypeDecContext.class);
		}
		public IdTypeDecContext idTypeDec(int i) {
			return getRuleContext(IdTypeDecContext.class,i);
		}
		public TerminalNode RET() { return getToken(ImpParser.RET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FunDefContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NothingContext extends ComContext {
		public NothingContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNothing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForPascalContext extends ComContext {
		public TerminalNode FOR() { return getToken(ImpParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdAssignContext idAssign() {
			return getRuleContext(IdAssignContext.class,0);
		}
		public TerminalNode TO() { return getToken(ImpParser.TO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ForPascalContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterForPascal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitForPascal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitForPascal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlyArnoldContext extends ComContext {
		public TerminalNode SLY() { return getToken(ImpParser.SLY, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public BfComContext bfCom() {
			return getRuleContext(BfComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public TerminalNode ARNOLD() { return getToken(ImpParser.ARNOLD, 0); }
		public SlyArnoldContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSlyArnold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSlyArnold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSlyArnold(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdDecAsgnContext extends ComContext {
		public IdDecAssignContext idDecAssign() {
			return getRuleContext(IdDecAssignContext.class,0);
		}
		public IdDecAsgnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIdDecAsgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIdDecAsgn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIdDecAsgn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(ImpParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_com, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new OutputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(PRINT);
				setState(23);
				match(LPAR);
				setState(24);
				exp(0);
				setState(25);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new IdDecAsgnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				idDecAssign();
				}
				break;
			case 3:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(SKIPP);
				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(WHILE);
				setState(30);
				match(LPAR);
				setState(31);
				exp(0);
				setState(32);
				match(RPAR);
				setState(33);
				match(LBRACE);
				setState(34);
				com(0);
				setState(35);
				match(RBRACE);
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					com(0);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(IF);
				setState(40);
				match(LPAR);
				setState(41);
				exp(0);
				setState(42);
				match(RPAR);
				setState(43);
				match(LBRACE);
				setState(44);
				com(0);
				setState(45);
				match(RBRACE);
				setState(46);
				match(ELSE);
				setState(47);
				match(LBRACE);
				setState(48);
				com(0);
				setState(49);
				match(RBRACE);
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(50);
					com(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new ForPascalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(FOR);
				setState(54);
				match(LPAR);
				setState(55);
				match(VAR);
				setState(56);
				match(ID);
				setState(57);
				idAssign();
				setState(58);
				match(TO);
				setState(59);
				exp(0);
				setState(60);
				match(RPAR);
				setState(61);
				match(LBRACE);
				setState(62);
				com(0);
				setState(63);
				match(RBRACE);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(64);
					com(0);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(LBRACE);
				setState(68);
				com(0);
				setState(69);
				match(RBRACE);
				setState(70);
				match(ND);
				setState(71);
				match(LQUAD);
				setState(72);
				com(0);
				setState(73);
				match(RQUAD);
				}
				break;
			case 8:
				{
				_localctx = new SlyArnoldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(SLY);
				setState(76);
				match(LBRACE);
				setState(77);
				bfCom();
				setState(78);
				match(RBRACE);
				setState(79);
				match(ARNOLD);
				}
				break;
			case 9:
				{
				_localctx = new FunctionComContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				fun();
				}
				break;
			case 10:
				{
				_localctx = new FunDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(FUN);
				setState(83);
				match(ID);
				setState(84);
				match(LPAR);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST || _la==VAR) {
					{
					setState(85);
					idTypeDec();
					setState(86);
					match(ID);
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(87);
							match(COMMA);
							}
							}
							setState(90); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA );
						setState(92);
						idTypeDec();
						setState(93);
						match(ID);
						}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(102);
				match(RPAR);
				setState(103);
				match(LBRACE);
				setState(104);
				com(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RET) {
					{
					setState(105);
					match(RET);
					setState(106);
					exp(0);
					setState(107);
					match(SEMICOLON);
					}
				}

				setState(111);
				match(RBRACE);
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(112);
					com(0);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new NothingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(118);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(119);
					match(SEMICOLON);
					setState(120);
					com(10);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdDecAssignContext extends ParserRuleContext {
		public IdDecAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idDecAssign; }
	 
		public IdDecAssignContext() { }
		public void copyFrom(IdDecAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VectorAssignContext extends IdDecAssignContext {
		public Token index;
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode LQUAD() { return getToken(ImpParser.LQUAD, 0); }
		public TerminalNode RQUAD() { return getToken(ImpParser.RQUAD, 0); }
		public IdAssignContext idAssign() {
			return getRuleContext(IdAssignContext.class,0);
		}
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public VectorAssignContext(IdDecAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterVectorAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitVectorAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitVectorAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VectorDeclarationContext extends IdDecAssignContext {
		public Token index;
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode LQUAD() { return getToken(ImpParser.LQUAD, 0); }
		public TerminalNode RQUAD() { return getToken(ImpParser.RQUAD, 0); }
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public VectorDeclarationContext(IdDecAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterVectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitVectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitVectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends IdDecAssignContext {
		public IdTypeDecContext idTypeDec() {
			return getRuleContext(IdTypeDecContext.class,0);
		}
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdAssignContext idAssign() {
			return getRuleContext(IdAssignContext.class,0);
		}
		public DeclarationContext(IdDecAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends IdDecAssignContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdAssignContext idAssign() {
			return getRuleContext(IdAssignContext.class,0);
		}
		public AssignContext(IdDecAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdDecAssignContext idDecAssign() throws RecognitionException {
		IdDecAssignContext _localctx = new IdDecAssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idDecAssign);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				idTypeDec();
				setState(127);
				match(ID);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(128);
					idAssign();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(ID);
				setState(132);
				idAssign();
				}
				break;
			case 3:
				_localctx = new VectorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(VAR);
				setState(134);
				match(ID);
				setState(135);
				match(LQUAD);
				setState(136);
				((VectorDeclarationContext)_localctx).index = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
					((VectorDeclarationContext)_localctx).index = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				match(RQUAD);
				}
				break;
			case 4:
				_localctx = new VectorAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(ID);
				setState(139);
				match(LQUAD);
				setState(140);
				((VectorAssignContext)_localctx).index = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
					((VectorAssignContext)_localctx).index = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				match(RQUAD);
				setState(142);
				idAssign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdAssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIdAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIdAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIdAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdAssignContext idAssign() throws RecognitionException {
		IdAssignContext _localctx = new IdAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ASSIGN);
			setState(146);
			exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdTypeDecContext extends ParserRuleContext {
		public Token idType;
		public TerminalNode CONST() { return getToken(ImpParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public IdTypeDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idTypeDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIdTypeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIdTypeDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIdTypeDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdTypeDecContext idTypeDec() throws RecognitionException {
		IdTypeDecContext _localctx = new IdTypeDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idTypeDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((IdTypeDecContext)_localctx).idType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==VAR) ) {
				((IdTypeDecContext)_localctx).idType = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	 
		public FunContext() { }
		public void copyFrom(FunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunStrContext extends FunContext {
		public TerminalNode STR() { return getToken(ImpParser.STR, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public FunStrContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends FunContext {
		public TerminalNode INPUT() { return getToken(ImpParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public InputContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends FunContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FunCallContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				_localctx = new FunStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(STR);
				setState(151);
				match(LPAR);
				setState(152);
				exp(0);
				setState(153);
				match(RPAR);
				}
				break;
			case INPUT:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(INPUT);
				setState(156);
				match(LPAR);
				setState(157);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new FunCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(ID);
				setState(159);
				match(LPAR);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35597762756638L) != 0)) {
					{
					setState(160);
					exp(0);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(161);
						match(COMMA);
						setState(162);
						exp(0);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterDivMulMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitDivMulMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterCmpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitCmpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitLogicExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallsContext extends ExpContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FunctionCallsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunctionCalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunctionCalls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunctionCalls(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ImpParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ImpParser.SUB, 0); }
		public AddSubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExpContext {
		public Token index;
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode LQUAD() { return getToken(ImpParser.LQUAD, 0); }
		public TerminalNode RQUAD() { return getToken(ImpParser.RQUAD, 0); }
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public ArrayAccessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CONC() { return getToken(ImpParser.CONC, 0); }
		public ConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ExpContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				types();
				}
				break;
			case 2:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(LPAR);
				setState(176);
				exp(0);
				setState(177);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(NOT);
				setState(180);
				exp(9);
				}
				break;
			case 4:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				setState(182);
				match(LQUAD);
				setState(183);
				((ArrayAccessContext)_localctx).index = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
					((ArrayAccessContext)_localctx).index = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(RQUAD);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				fun();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						match(POW);
						setState(190);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(194);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(195);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						exp(5);
						}
						break;
					case 7:
						{
						_localctx = new ConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						match(CONC);
						setState(208);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(213);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	 
		public TypesContext() { }
		public void copyFrom(TypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends TypesContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BooleanContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends TypesContext {
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public StringContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends TypesContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends TypesContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public FloatContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegersContext extends TypesContext {
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public IntegersContext(TypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIntegers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_types);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(STRING);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BfComContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(ImpParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ImpParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ImpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ImpParser.GT, i);
		}
		public List<TerminalNode> ADD() { return getTokens(ImpParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ImpParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ImpParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ImpParser.SUB, i);
		}
		public List<TerminalNode> LQUAD() { return getTokens(ImpParser.LQUAD); }
		public TerminalNode LQUAD(int i) {
			return getToken(ImpParser.LQUAD, i);
		}
		public List<TerminalNode> RQUAD() { return getTokens(ImpParser.RQUAD); }
		public TerminalNode RQUAD(int i) {
			return getToken(ImpParser.RQUAD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ImpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImpParser.DOT, i);
		}
		public List<TerminalNode> CONC() { return getTokens(ImpParser.CONC); }
		public TerminalNode CONC(int i) {
			return getToken(ImpParser.CONC, i);
		}
		public BfComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfCom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBfCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBfCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBfCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfComContext bfCom() throws RecognitionException {
		BfComContext _localctx = new BfComContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bfCom);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 214404773716352L) != 0)) {
					{
					{
					setState(221);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 214404773716352L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return com_sempred((ComContext)_localctx, predIndex);
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"Y\b\u0001\u000b\u0001\f\u0001Z\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001`\b\u0001\n\u0001\f\u0001c\t\u0001\u0003\u0001e\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001n\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001"+
		"\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0090\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a4"+
		"\b\u0005\n\u0005\f\u0005\u00a7\t\u0005\u0003\u0005\u00a9\b\u0005\u0001"+
		"\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bb\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d2\b\u0006\n\u0006\f\u0006"+
		"\u00d5\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00dc\b\u0007\u0001\b\u0005\b\u00df\b\b\n\b\f\b\u00e2\t\b"+
		"\u0001\b\u0003\b\u00e5\b\b\u0001\b\u0000\u0002\u0002\f\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\b\u0002\u0000\u0002\u0002--\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\t\u000b\u0001\u0000\u0007\b\u0001\u0000\u0013"+
		"\u0016\u0001\u0000\u0011\u0012\u0001\u0000\u000e\u000f\u0005\u0000\u0007"+
		"\b\r\r\u0015\u0016()./\u0109\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"t\u0001\u0000\u0000\u0000\u0004\u008f\u0001\u0000\u0000\u0000\u0006\u0091"+
		"\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n\u00ab\u0001"+
		"\u0000\u0000\u0000\f\u00ba\u0001\u0000\u0000\u0000\u000e\u00db\u0001\u0000"+
		"\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002"+
		"\u0001\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0006\u0001\uffff\uffff\u0000\u0016\u0017\u0005"+
		"\u001d\u0000\u0000\u0017\u0018\u0005&\u0000\u0000\u0018\u0019\u0003\f"+
		"\u0006\u0000\u0019\u001a\u0005\'\u0000\u0000\u001au\u0001\u0000\u0000"+
		"\u0000\u001bu\u0003\u0004\u0002\u0000\u001cu\u0005\u001b\u0000\u0000\u001d"+
		"\u001e\u0005\u001a\u0000\u0000\u001e\u001f\u0005&\u0000\u0000\u001f \u0003"+
		"\f\u0006\u0000 !\u0005\'\u0000\u0000!\"\u0005*\u0000\u0000\"#\u0003\u0002"+
		"\u0001\u0000#%\u0005+\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&u\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u0017\u0000\u0000()\u0005&\u0000\u0000)*\u0003\f\u0006\u0000*+\u0005"+
		"\'\u0000\u0000+,\u0005*\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005"+
		"+\u0000\u0000./\u0005\u0019\u0000\u0000/0\u0005*\u0000\u000001\u0003\u0002"+
		"\u0001\u000013\u0005+\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004u\u0001\u0000\u0000\u000056\u0005"+
		"\u0018\u0000\u000067\u0005&\u0000\u000078\u0005\u0006\u0000\u000089\u0005"+
		"-\u0000\u00009:\u0003\u0006\u0003\u0000:;\u0005\"\u0000\u0000;<\u0003"+
		"\f\u0006\u0000<=\u0005\'\u0000\u0000=>\u0005*\u0000\u0000>?\u0003\u0002"+
		"\u0001\u0000?A\u0005+\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000Bu\u0001\u0000\u0000\u0000CD\u0005"+
		"*\u0000\u0000DE\u0003\u0002\u0001\u0000EF\u0005+\u0000\u0000FG\u0005!"+
		"\u0000\u0000GH\u0005(\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0005)\u0000"+
		"\u0000Ju\u0001\u0000\u0000\u0000KL\u0005\u001f\u0000\u0000LM\u0005*\u0000"+
		"\u0000MN\u0003\u0010\b\u0000NO\u0005+\u0000\u0000OP\u0005 \u0000\u0000"+
		"Pu\u0001\u0000\u0000\u0000Qu\u0003\n\u0005\u0000RS\u0005#\u0000\u0000"+
		"ST\u0005-\u0000\u0000Td\u0005&\u0000\u0000UV\u0003\b\u0004\u0000Va\u0005"+
		"-\u0000\u0000WY\u0005/\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005-\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_X\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000dU\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\'\u0000\u0000gh\u0005*"+
		"\u0000\u0000hm\u0003\u0002\u0001\u0000ij\u0005$\u0000\u0000jk\u0003\f"+
		"\u0006\u0000kl\u0005,\u0000\u0000ln\u0001\u0000\u0000\u0000mi\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0005"+
		"+\u0000\u0000pr\u0003\u0002\u0001\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000"+
		"t\u0015\u0001\u0000\u0000\u0000t\u001b\u0001\u0000\u0000\u0000t\u001c"+
		"\u0001\u0000\u0000\u0000t\u001d\u0001\u0000\u0000\u0000t\'\u0001\u0000"+
		"\u0000\u0000t5\u0001\u0000\u0000\u0000tC\u0001\u0000\u0000\u0000tK\u0001"+
		"\u0000\u0000\u0000tQ\u0001\u0000\u0000\u0000tR\u0001\u0000\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000u{\u0001\u0000\u0000\u0000vw\n\t\u0000\u0000"+
		"wx\u0005,\u0000\u0000xz\u0003\u0002\u0001\nyv\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u0003\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\b\u0004\u0000\u007f\u0081\u0005-\u0000\u0000\u0080\u0082\u0003"+
		"\u0006\u0003\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0090\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"-\u0000\u0000\u0084\u0090\u0003\u0006\u0003\u0000\u0085\u0086\u0005\u0006"+
		"\u0000\u0000\u0086\u0087\u0005-\u0000\u0000\u0087\u0088\u0005(\u0000\u0000"+
		"\u0088\u0089\u0007\u0000\u0000\u0000\u0089\u0090\u0005)\u0000\u0000\u008a"+
		"\u008b\u0005-\u0000\u0000\u008b\u008c\u0005(\u0000\u0000\u008c\u008d\u0007"+
		"\u0000\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u0090\u0003\u0006"+
		"\u0003\u0000\u008f~\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000\u0000"+
		"\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000"+
		"\u0000\u0090\u0005\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001c\u0000"+
		"\u0000\u0092\u0093\u0003\f\u0006\u0000\u0093\u0007\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0007\u0001\u0000\u0000\u0095\t\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005%\u0000\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u0099\u0003"+
		"\f\u0006\u0000\u0099\u009a\u0005\'\u0000\u0000\u009a\u00ac\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\u001e\u0000\u0000\u009c\u009d\u0005&\u0000"+
		"\u0000\u009d\u00ac\u0005\'\u0000\u0000\u009e\u009f\u0005-\u0000\u0000"+
		"\u009f\u00a8\u0005&\u0000\u0000\u00a0\u00a5\u0003\f\u0006\u0000\u00a1"+
		"\u00a2\u0005/\u0000\u0000\u00a2\u00a4\u0003\f\u0006\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\'\u0000\u0000\u00ab\u0096\u0001"+
		"\u0000\u0000\u0000\u00ab\u009b\u0001\u0000\u0000\u0000\u00ab\u009e\u0001"+
		"\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006"+
		"\u0006\uffff\uffff\u0000\u00ae\u00bb\u0003\u000e\u0007\u0000\u00af\u00b0"+
		"\u0005&\u0000\u0000\u00b0\u00b1\u0003\f\u0006\u0000\u00b1\u00b2\u0005"+
		"\'\u0000\u0000\u00b2\u00bb\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0010"+
		"\u0000\u0000\u00b4\u00bb\u0003\f\u0006\t\u00b5\u00b6\u0005-\u0000\u0000"+
		"\u00b6\u00b7\u0005(\u0000\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0005)\u0000\u0000\u00b9\u00bb\u0003\n\u0005\u0000\u00ba\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ba\u00af\u0001\u0000\u0000\u0000\u00ba\u00b3"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00d3\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\n\n\u0000\u0000\u00bd\u00be\u0005\f\u0000\u0000\u00be\u00d2\u0003\f\u0006"+
		"\n\u00bf\u00c0\n\b\u0000\u0000\u00c0\u00c1\u0007\u0002\u0000\u0000\u00c1"+
		"\u00d2\u0003\f\u0006\t\u00c2\u00c3\n\u0007\u0000\u0000\u00c3\u00c4\u0007"+
		"\u0003\u0000\u0000\u00c4\u00d2\u0003\f\u0006\b\u00c5\u00c6\n\u0006\u0000"+
		"\u0000\u00c6\u00c7\u0007\u0004\u0000\u0000\u00c7\u00d2\u0003\f\u0006\u0007"+
		"\u00c8\u00c9\n\u0005\u0000\u0000\u00c9\u00ca\u0007\u0005\u0000\u0000\u00ca"+
		"\u00d2\u0003\f\u0006\u0006\u00cb\u00cc\n\u0004\u0000\u0000\u00cc\u00cd"+
		"\u0007\u0006\u0000\u0000\u00cd\u00d2\u0003\f\u0006\u0005\u00ce\u00cf\n"+
		"\u0003\u0000\u0000\u00cf\u00d0\u0005\r\u0000\u0000\u00d0\u00d2\u0003\f"+
		"\u0006\u0004\u00d1\u00bc\u0001\u0000\u0000\u0000\u00d1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00c2\u0001\u0000\u0000\u0000\u00d1\u00c5\u0001\u0000"+
		"\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\r\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00dc\u0005\u0002\u0000\u0000\u00d7\u00dc\u0005\u0004\u0000"+
		"\u0000\u00d8\u00dc\u0005\u0003\u0000\u0000\u00d9\u00dc\u0005\u0001\u0000"+
		"\u0000\u00da\u00dc\u0005-\u0000\u0000\u00db\u00d6\u0001\u0000\u0000\u0000"+
		"\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u000f\u0001\u0000\u0000\u0000\u00dd\u00df\u0007\u0007\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e5\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u0011\u0001\u0000\u0000\u0000"+
		"\u0015%3AZadmqt{\u0081\u008f\u00a5\u00a8\u00ab\u00ba\u00d1\u00d3\u00db"+
		"\u00e0\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}