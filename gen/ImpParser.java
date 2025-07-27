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
		RULE_idTypeDec = 4, RULE_fun = 5, RULE_args = 6, RULE_exp = 7, RULE_oper = 8, 
		RULE_mulExp = 9, RULE_powExp = 10, RULE_module = 11, RULE_factor = 12, 
		RULE_parExp = 13, RULE_numericType = 14, RULE_brainFuckProg = 15, RULE_bfCom = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "com", "idDecAssign", "idAssign", "idTypeDec", "fun", "args", 
			"exp", "oper", "mulExp", "powExp", "module", "factor", "parExp", "numericType", 
			"brainFuckProg", "bfCom"
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
			setState(34);
			com(0);
			setState(35);
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
		public TerminalNode RET() { return getToken(ImpParser.RET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public FunDefContext(ComContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitForPascal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlyArnoldContext extends ComContext {
		public TerminalNode SLY() { return getToken(ImpParser.SLY, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public BrainFuckProgContext brainFuckProg() {
			return getRuleContext(BrainFuckProgContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public TerminalNode ARNOLD() { return getToken(ImpParser.ARNOLD, 0); }
		public SlyArnoldContext(ComContext ctx) { copyFrom(ctx); }
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new OutputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				match(PRINT);
				setState(39);
				match(LPAR);
				setState(40);
				exp(0);
				setState(41);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new IdDecAsgnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				idDecAssign();
				}
				break;
			case 3:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(SKIPP);
				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(WHILE);
				setState(46);
				match(LPAR);
				setState(47);
				exp(0);
				setState(48);
				match(RPAR);
				setState(49);
				match(LBRACE);
				setState(50);
				com(0);
				setState(51);
				match(RBRACE);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(52);
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
				setState(55);
				match(IF);
				setState(56);
				match(LPAR);
				setState(57);
				exp(0);
				setState(58);
				match(RPAR);
				setState(59);
				match(LBRACE);
				setState(60);
				com(0);
				setState(61);
				match(RBRACE);
				setState(62);
				match(ELSE);
				setState(63);
				match(LBRACE);
				setState(64);
				com(0);
				setState(65);
				match(RBRACE);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(66);
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
				setState(69);
				match(FOR);
				setState(70);
				match(LPAR);
				setState(71);
				match(VAR);
				setState(72);
				match(ID);
				setState(73);
				idAssign();
				setState(74);
				match(TO);
				setState(75);
				exp(0);
				setState(76);
				match(RPAR);
				setState(77);
				match(LBRACE);
				setState(78);
				com(0);
				setState(79);
				match(RBRACE);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(80);
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
				setState(83);
				match(LBRACE);
				setState(84);
				com(0);
				setState(85);
				match(RBRACE);
				setState(86);
				match(ND);
				setState(87);
				match(LQUAD);
				setState(88);
				com(0);
				setState(89);
				match(RQUAD);
				}
				break;
			case 8:
				{
				_localctx = new SlyArnoldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(SLY);
				setState(92);
				match(LBRACE);
				setState(93);
				brainFuckProg();
				setState(94);
				match(RBRACE);
				setState(95);
				match(ARNOLD);
				}
				break;
			case 9:
				{
				_localctx = new FunDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(FUN);
				setState(98);
				match(ID);
				setState(99);
				match(LPAR);
				setState(100);
				match(RPAR);
				setState(101);
				match(LBRACE);
				setState(102);
				com(0);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RET) {
					{
					setState(103);
					match(RET);
					setState(104);
					match(ID);
					setState(105);
					match(SEMICOLON);
					}
				}

				setState(108);
				match(RBRACE);
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(109);
					com(0);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new FunctionComContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				fun();
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
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(116);
					if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
					setState(117);
					match(SEMICOLON);
					setState(118);
					com(10);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdDecAssignContext idDecAssign() throws RecognitionException {
		IdDecAssignContext _localctx = new IdDecAssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idDecAssign);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				idTypeDec();
				setState(125);
				match(ID);
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(126);
					idAssign();
					}
					break;
				}
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				setState(130);
				idAssign();
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
			setState(133);
			match(ASSIGN);
			setState(134);
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
			setState(136);
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
		public FunCallContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				_localctx = new FunStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(STR);
				setState(139);
				match(LPAR);
				setState(140);
				exp(0);
				setState(141);
				match(RPAR);
				}
				break;
			case INPUT:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(INPUT);
				setState(144);
				match(LPAR);
				setState(145);
				match(RPAR);
				}
				break;
			case ID:
				_localctx = new FunCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(ID);
				setState(147);
				match(LPAR);
				setState(148);
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
	public static class ArgsContext extends ParserRuleContext {
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
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35597762756638L) != 0)) {
				{
				setState(151);
				exp(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					exp(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitString(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
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
		public List<TerminalNode> CONC() { return getTokens(ImpParser.CONC); }
		public TerminalNode CONC(int i) {
			return getToken(ImpParser.CONC, i);
		}
		public ConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ExpContext {
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public OperationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOperation(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				match(BOOL);
				}
				break;
			case 2:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new OperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				oper();
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(NOT);
				setState(167);
				exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
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
						setState(172);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
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
						setState(175);
						exp(4);
						}
						break;
					case 3:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
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
						setState(178);
						exp(3);
						}
						break;
					case 4:
						{
						_localctx = new ConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(179);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(180);
								match(CONC);
								setState(181);
								exp(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(184); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class OperContext extends ParserRuleContext {
		public Token op;
		public List<MulExpContext> mulExp() {
			return getRuleContexts(MulExpContext.class);
		}
		public MulExpContext mulExp(int i) {
			return getRuleContext(MulExpContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ImpParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ImpParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ImpParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ImpParser.SUB, i);
		}
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oper);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			mulExp();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					((OperContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((OperContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(193);
					mulExp();
					}
					} 
				}
				setState(198);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulExpContext extends ParserRuleContext {
		public Token op;
		public List<PowExpContext> powExp() {
			return getRuleContexts(PowExpContext.class);
		}
		public PowExpContext powExp(int i) {
			return getRuleContext(PowExpContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ImpParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ImpParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ImpParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ImpParser.DIV, i);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		MulExpContext _localctx = new MulExpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			powExp();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					((MulExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
						((MulExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					powExp();
					}
					} 
				}
				setState(206);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowExpContext extends ParserRuleContext {
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(ImpParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(ImpParser.POW, i);
		}
		public PowExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPowExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpContext powExp() throws RecognitionException {
		PowExpContext _localctx = new PowExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_powExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			module();
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(POW);
					setState(209);
					module();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class ModuleContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			factor();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(216);
				match(MOD);
				setState(217);
				factor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends FactorContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TypesContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdTypeContext extends FactorContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdTypeContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIdType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends FactorContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExpContext extends FactorContext {
		public ParExpContext parExp() {
			return getRuleContext(ParExpContext.class,0);
		}
		public ParentesisExpContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParentesisExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ParentesisExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				parExp();
				}
				break;
			case 2:
				_localctx = new TypesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				numericType();
				}
				break;
			case 3:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				fun();
				}
				break;
			case 4:
				_localctx = new IdTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(ID);
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
	public static class ParExpContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpContext parExp() throws RecognitionException {
		ParExpContext _localctx = new ParExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LPAR);
			setState(227);
			exp(0);
			setState(228);
			match(RPAR);
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
	public static class NumericTypeContext extends ParserRuleContext {
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
	 
		public NumericTypeContext() { }
		public void copyFrom(NumericTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends NumericTypeContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public FloatContext(NumericTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegersContext extends NumericTypeContext {
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public IntegersContext(NumericTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericType);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(FLOAT);
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
	public static class BrainFuckProgContext extends ParserRuleContext {
		public BfComContext bfCom() {
			return getRuleContext(BfComContext.class,0);
		}
		public BrainFuckProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brainFuckProg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBrainFuckProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrainFuckProgContext brainFuckProg() throws RecognitionException {
		BrainFuckProgContext _localctx = new BrainFuckProgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_brainFuckProg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			bfCom();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBfCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfComContext bfCom() throws RecognitionException {
		BfComContext _localctx = new BfComContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bfCom);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 214404773716352L) != 0)) {
					{
					{
					setState(236);
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
					setState(241);
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
		case 7:
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
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"D\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001R\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001o\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001s\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001x\b\u0001\n\u0001\f\u0001{\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0080\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0084\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0096\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u009b\b\u0006\n\u0006\f\u0006\u009e\t\u0006\u0003\u0006"+
		"\u00a0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a9\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00b7\b\u0007"+
		"\u000b\u0007\f\u0007\u00b8\u0005\u0007\u00bb\b\u0007\n\u0007\f\u0007\u00be"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00c3\b\b\n\b\f\b\u00c6\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00cb\b\t\n\t\f\t\u00ce\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u00d3\b\n\n\n\f\n\u00d6\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00db\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e9\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u00ee"+
		"\b\u0010\n\u0010\f\u0010\u00f1\t\u0010\u0001\u0010\u0003\u0010\u00f4\b"+
		"\u0010\u0001\u0010\u0000\u0002\u0002\u000e\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0007"+
		"\u0001\u0000\u0005\u0006\u0001\u0000\u0013\u0016\u0001\u0000\u0011\u0012"+
		"\u0001\u0000\u000e\u000f\u0001\u0000\u0007\b\u0001\u0000\t\n\u0005\u0000"+
		"\u0007\b\r\r\u0015\u0016()./\u010d\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"r\u0001\u0000\u0000\u0000\u0004\u0083\u0001\u0000\u0000\u0000\u0006\u0085"+
		"\u0001\u0000\u0000\u0000\b\u0088\u0001\u0000\u0000\u0000\n\u0095\u0001"+
		"\u0000\u0000\u0000\f\u009f\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000"+
		"\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000"+
		"\u0000\u0000\u0014\u00cf\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000"+
		"\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u00e2\u0001\u0000"+
		"\u0000\u0000\u001c\u00e8\u0001\u0000\u0000\u0000\u001e\u00ea\u0001\u0000"+
		"\u0000\u0000 \u00f3\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000"+
		"#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0006\u0001"+
		"\uffff\uffff\u0000&\'\u0005\u001d\u0000\u0000\'(\u0005&\u0000\u0000()"+
		"\u0003\u000e\u0007\u0000)*\u0005\'\u0000\u0000*s\u0001\u0000\u0000\u0000"+
		"+s\u0003\u0004\u0002\u0000,s\u0005\u001b\u0000\u0000-.\u0005\u001a\u0000"+
		"\u0000./\u0005&\u0000\u0000/0\u0003\u000e\u0007\u000001\u0005\'\u0000"+
		"\u000012\u0005*\u0000\u000023\u0003\u0002\u0001\u000035\u0005+\u0000\u0000"+
		"46\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006s\u0001\u0000\u0000\u000078\u0005\u0017\u0000\u000089\u0005&\u0000"+
		"\u00009:\u0003\u000e\u0007\u0000:;\u0005\'\u0000\u0000;<\u0005*\u0000"+
		"\u0000<=\u0003\u0002\u0001\u0000=>\u0005+\u0000\u0000>?\u0005\u0019\u0000"+
		"\u0000?@\u0005*\u0000\u0000@A\u0003\u0002\u0001\u0000AC\u0005+\u0000\u0000"+
		"BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000Ds\u0001\u0000\u0000\u0000EF\u0005\u0018\u0000\u0000FG\u0005&\u0000"+
		"\u0000GH\u0005\u0006\u0000\u0000HI\u0005-\u0000\u0000IJ\u0003\u0006\u0003"+
		"\u0000JK\u0005\"\u0000\u0000KL\u0003\u000e\u0007\u0000LM\u0005\'\u0000"+
		"\u0000MN\u0005*\u0000\u0000NO\u0003\u0002\u0001\u0000OQ\u0005+\u0000\u0000"+
		"PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000Rs\u0001\u0000\u0000\u0000ST\u0005*\u0000\u0000TU\u0003\u0002\u0001"+
		"\u0000UV\u0005+\u0000\u0000VW\u0005!\u0000\u0000WX\u0005(\u0000\u0000"+
		"XY\u0003\u0002\u0001\u0000YZ\u0005)\u0000\u0000Zs\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u001f\u0000\u0000\\]\u0005*\u0000\u0000]^\u0003\u001e\u000f"+
		"\u0000^_\u0005+\u0000\u0000_`\u0005 \u0000\u0000`s\u0001\u0000\u0000\u0000"+
		"ab\u0005#\u0000\u0000bc\u0005-\u0000\u0000cd\u0005&\u0000\u0000de\u0005"+
		"\'\u0000\u0000ef\u0005*\u0000\u0000fj\u0003\u0002\u0001\u0000gh\u0005"+
		"$\u0000\u0000hi\u0005-\u0000\u0000ik\u0005,\u0000\u0000jg\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0005"+
		"+\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000os\u0001\u0000\u0000\u0000ps\u0003\n\u0005\u0000qs\u0001"+
		"\u0000\u0000\u0000r%\u0001\u0000\u0000\u0000r+\u0001\u0000\u0000\u0000"+
		"r,\u0001\u0000\u0000\u0000r-\u0001\u0000\u0000\u0000r7\u0001\u0000\u0000"+
		"\u0000rE\u0001\u0000\u0000\u0000rS\u0001\u0000\u0000\u0000r[\u0001\u0000"+
		"\u0000\u0000ra\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000sy\u0001\u0000\u0000\u0000tu\n\t\u0000\u0000uv\u0005"+
		",\u0000\u0000vx\u0003\u0002\u0001\nwt\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\u0003\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\b\u0004"+
		"\u0000}\u007f\u0005-\u0000\u0000~\u0080\u0003\u0006\u0003\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0084"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005-\u0000\u0000\u0082\u0084\u0003"+
		"\u0006\u0003\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001c"+
		"\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0007\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005%\u0000\u0000\u008b\u008c\u0005&\u0000\u0000\u008c"+
		"\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005\'\u0000\u0000\u008e\u0096"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001e\u0000\u0000\u0090\u0091"+
		"\u0005&\u0000\u0000\u0091\u0096\u0005\'\u0000\u0000\u0092\u0093\u0005"+
		"-\u0000\u0000\u0093\u0094\u0005&\u0000\u0000\u0094\u0096\u0005\'\u0000"+
		"\u0000\u0095\u008a\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000"+
		"\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0096\u000b\u0001\u0000\u0000"+
		"\u0000\u0097\u009c\u0003\u000e\u0007\u0000\u0098\u0099\u0005/\u0000\u0000"+
		"\u0099\u009b\u0003\u000e\u0007\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\u0007\uffff\uffff\u0000\u00a2\u00a9\u0005\u0003\u0000\u0000"+
		"\u00a3\u00a9\u0005\u0001\u0000\u0000\u00a4\u00a9\u0005-\u0000\u0000\u00a5"+
		"\u00a9\u0003\u0010\b\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000\u00a7\u00a9"+
		"\u0003\u000e\u0007\u0001\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u0004\u0000\u0000\u00ab\u00ac\u0007"+
		"\u0001\u0000\u0000\u00ac\u00bb\u0003\u000e\u0007\u0005\u00ad\u00ae\n\u0003"+
		"\u0000\u0000\u00ae\u00af\u0007\u0002\u0000\u0000\u00af\u00bb\u0003\u000e"+
		"\u0007\u0004\u00b0\u00b1\n\u0002\u0000\u0000\u00b1\u00b2\u0007\u0003\u0000"+
		"\u0000\u00b2\u00bb\u0003\u000e\u0007\u0003\u00b3\u00b6\n\u0006\u0000\u0000"+
		"\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u00b7\u0003\u000e\u0007\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00aa\u0001\u0000\u0000\u0000\u00ba"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ba\u00b0\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b3\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u000f\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c4\u0003\u0012\t\u0000\u00c0\u00c1\u0007\u0004\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0012\t\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u0011\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00cc\u0003\u0014\n\u0000\u00c8\u00c9\u0007\u0005"+
		"\u0000\u0000\u00c9\u00cb\u0003\u0014\n\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u0013\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d4\u0003\u0016\u000b"+
		"\u0000\u00d0\u00d1\u0005\f\u0000\u0000\u00d1\u00d3\u0003\u0016\u000b\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0003\u0018\f\u0000\u00d8\u00d9\u0005\u000b\u0000\u0000\u00d9"+
		"\u00db\u0003\u0018\f\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u0017\u0001\u0000\u0000\u0000\u00dc\u00e1"+
		"\u0003\u001a\r\u0000\u00dd\u00e1\u0003\u001c\u000e\u0000\u00de\u00e1\u0003"+
		"\n\u0005\u0000\u00df\u00e1\u0005-\u0000\u0000\u00e0\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0019\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3\u00e4\u0003\u000e\u0007"+
		"\u0000\u00e4\u00e5\u0005\'\u0000\u0000\u00e5\u001b\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0005\u0002\u0000\u0000\u00e7\u00e9\u0005\u0004\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u001d\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003 \u0010\u0000\u00eb"+
		"\u001f\u0001\u0000\u0000\u0000\u00ec\u00ee\u0007\u0006\u0000\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4!\u0001\u0000\u0000\u0000\u00185C"+
		"Qjnry\u007f\u0083\u0095\u009c\u009f\u00a8\u00b8\u00ba\u00bc\u00c4\u00cc"+
		"\u00d4\u00da\u00e0\u00e8\u00ef\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}