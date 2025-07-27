// Generated from /home/dimitri/Desktop/Univr/Linguaggi/Elaborato/src/Imp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ImpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(ImpParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDet}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDet(ImpParser.NonDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCom}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCom(ImpParser.FunctionComContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDef}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDef(ImpParser.FunDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing(ImpParser.NothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forPascal}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForPascal(ImpParser.ForPascalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slyArnold}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlyArnold(ImpParser.SlyArnoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idDecAsgn}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDecAsgn(ImpParser.IdDecAsgnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ImpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ImpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ImpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(ImpParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ImpParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#idDecAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ImpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#idAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAssign(ImpParser.IdAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#idTypeDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTypeDec(ImpParser.IdTypeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funStr}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunStr(ImpParser.FunStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ImpParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(ImpParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ImpParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ImpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ImpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ImpParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ImpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(ImpParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ImpParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(ImpParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(ImpParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#powExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExp(ImpParser.PowExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(ImpParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesisExp}
	 * labeled alternative in {@link ImpParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExp(ImpParser.ParentesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code types}
	 * labeled alternative in {@link ImpParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(ImpParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ImpParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ImpParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link ImpParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(ImpParser.IdTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#parExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integers}
	 * labeled alternative in {@link ImpParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegers(ImpParser.IntegersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ImpParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ImpParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#brainFuckProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrainFuckProg(ImpParser.BrainFuckProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#bfCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfCom(ImpParser.BfComContext ctx);
}