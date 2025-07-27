// Generated from /home/dimitri/Desktop/Univr/Linguaggi/Elaborato/src/Imp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImpParser}.
 */
public interface ImpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ImpParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ImpParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code output}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ImpParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ImpParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonDet}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNonDet(ImpParser.NonDetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonDet}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNonDet(ImpParser.NonDetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCom}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCom(ImpParser.FunctionComContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCom}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCom(ImpParser.FunctionComContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDef}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterFunDef(ImpParser.FunDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDef}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitFunDef(ImpParser.FunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNothing(ImpParser.NothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNothing(ImpParser.NothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forPascal}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterForPascal(ImpParser.ForPascalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forPascal}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitForPascal(ImpParser.ForPascalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slyArnold}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSlyArnold(ImpParser.SlyArnoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slyArnold}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSlyArnold(ImpParser.SlyArnoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idDecAsgn}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIdDecAsgn(ImpParser.IdDecAsgnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idDecAsgn}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIdDecAsgn(ImpParser.IdDecAsgnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ImpParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ImpParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ImpParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ImpParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(ImpParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(ImpParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSeq(ImpParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSeq(ImpParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ImpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ImpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ImpParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ImpParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorDeclaration}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void enterVectorDeclaration(ImpParser.VectorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorDeclaration}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void exitVectorDeclaration(ImpParser.VectorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorAssign}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void enterVectorAssign(ImpParser.VectorAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorAssign}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 */
	void exitVectorAssign(ImpParser.VectorAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#idAssign}.
	 * @param ctx the parse tree
	 */
	void enterIdAssign(ImpParser.IdAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#idAssign}.
	 * @param ctx the parse tree
	 */
	void exitIdAssign(ImpParser.IdAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#idTypeDec}.
	 * @param ctx the parse tree
	 */
	void enterIdTypeDec(ImpParser.IdTypeDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#idTypeDec}.
	 * @param ctx the parse tree
	 */
	void exitIdTypeDec(ImpParser.IdTypeDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funStr}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFunStr(ImpParser.FunStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funStr}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFunStr(ImpParser.FunStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterInput(ImpParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitInput(ImpParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(ImpParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(ImpParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(ImpParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(ImpParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(ImpParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCalls}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCalls(ImpParser.FunctionCallsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCalls}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCalls(ImpParser.FunctionCallsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPow(ImpParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPow(ImpParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ImpParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ImpParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ImpParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ImpParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConcat(ImpParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConcat(ImpParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterType(ImpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitType(ImpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integers}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(ImpParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integers}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(ImpParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ImpParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ImpParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ImpParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ImpParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void enterString(ImpParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void exitString(ImpParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void enterId(ImpParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#types}.
	 * @param ctx the parse tree
	 */
	void exitId(ImpParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#bfCom}.
	 * @param ctx the parse tree
	 */
	void enterBfCom(ImpParser.BfComContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#bfCom}.
	 * @param ctx the parse tree
	 */
	void exitBfCom(ImpParser.BfComContext ctx);
}