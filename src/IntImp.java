import Value.*;

import java.io.IOException;
import java.util.Random;
import brainfuck.brainMain;
import java.util.Scanner;

public class IntImp extends ImpBaseVisitor<Value>{

    private final Conf conf;

    public IntImp(Conf conf){
        this.conf = conf;
        conf.initFunPointer();
        conf.initFunScope();
        conf.enterFunScope("program0");
    }

    @Override
    public ComValue visitSlyArnold(ImpParser.SlyArnoldContext ctx){
        try {
            brainMain.run(ctx.bfCom().getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitFunDef(ImpParser.FunDefContext ctx) {
        conf.createFunScope(ctx.ID(0).toString(), ctx);
        int index = conf.getPointerFun();

        conf.enterFunScope(ctx.ID(0).toString());
        conf.getFunctionScope(index).addChildrenScope(conf.getPointerFun());

        int i = 0;
        while(ctx.idTypeDec(i) != null){
            Types type = Types.valueOf(visitIdTypeDec(ctx.idTypeDec(i)).toString());
            String id = ctx.ID(i+1).toString();
            conf.getFunctionScope().pushArg(id);
            conf.getFunctionScope().pushArgType(type);
            i++;
        }

        conf.exitFunScope();
        if(ctx.com(1) != null)
            visitCom(ctx.com(1));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitFunctionCom(ImpParser.FunctionComContext ctx) {
        return visit(ctx.fun());
    }

    @Override
    public ExpValue<?> visitFunCall(ImpParser.FunCallContext ctx) {
        conf.enterFunScope(ctx.ID().toString());
        ImpParser.FunDefContext com = conf.returnFunBody();
        int i = 0;
        while(ctx.exp(i) != null){
            ExpValue<?> value = visitExp(ctx.exp(i));
            String id = conf.getFunctionScope().getStackArgsId();
            Types type = conf.getFunctionScope().getStackArgType();
            conf.createElementPush(id, value, type);
            i++;
        }
        visitCom(com.com(0));
        ExpValue<?> value = null;
        if(com.exp() != null){
            value = visitExp(com.exp());
        }
        conf.getFunctionScope().resetList();
        conf.killAllChildrens(conf.getPointerFun(), conf.getPointerFun());
        conf.getFunctionScope().resetChildrenScope();
        conf.exitFunScope();
        return value;
    }

    @Override
    public ExpValue<?> visitFunStr(ImpParser.FunStrContext ctx) {
        String string = visitExp(ctx.exp()).toString();
        return new StringValue(string);
    }

    @Override
    public ExpValue<?> visitInput(ImpParser.InputContext ctx) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int value = scanner.nextInt();
            scanner.nextLine();
            return new IntegerValue(value);
        }else if (scanner.hasNextFloat()){
            float value = scanner.nextFloat();
            scanner.nextLine();
            return new FloatValue(value);
        } else if(scanner.hasNextBoolean()){
            boolean value = scanner.nextBoolean();
            scanner.nextLine();
            return new BoolValue(value);
        } else{
            String value = scanner.nextLine();
            return new StringValue(value);
        }
    }

    @Override
    public ExpValue<?> visitFunctionCalls(ImpParser.FunctionCallsContext ctx) {
        return (ExpValue<?>) visit(ctx.fun());
    }

    public ComValue visitCom(ImpParser.ComContext ctx){
        visit(ctx);
        return ComValue.INSTANCE;
    }

    public ExpValue<?> visitExp(ImpParser.ExpContext ctx){
        return (ExpValue<?>) visit(ctx);
    }

    public boolean visitBoolExp(ImpParser.ExpContext ctx){
       try{
           return ((BoolValue) visitExp(ctx)).toJavaValue();
       } catch (ClassCastException e) {
          System.err.println("Type mismatch error at line: " + ctx.start.getLine() + " character: " + ctx.start.getCharPositionInLine());
          System.err.println(">>>>>>>>>>>>>>>>>>>>");
          System.err.println(ctx.getText());
          System.err.println("<<<<<<<<<<<<<<<<<<<<");
          System.err.println(">> Expected value was: Boolean <<");
          System.exit(1);
       }
       return false;
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        conf.createPushScope();
        if(visitBoolExp(ctx.exp()))
            visitCom(ctx.com(0));
        else
            visitCom(ctx.com(1));
        conf.popScope();

        if(ctx.com(2) != null)
            visitCom(ctx.com(2));

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitNonDet(ImpParser.NonDetContext ctx) {
        //conf.createPushScope();

        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        boolean randomChoice = random.nextBoolean();
        if(randomChoice){
            visitCom(ctx.com(0));
        }else{
            visitCom(ctx.com(1));
        }

        //conf.popScope();
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitForPascal(ImpParser.ForPascalContext ctx) {
        conf.createPushScope();
        String id = ctx.ID().getText();
        ExpValue<?> value = visitIdAssign(ctx.idAssign());
        int start = Integer.parseInt(value.toString());
        conf.createElementPush(id, value, Types.var);
        visitExp(ctx.exp());

        int cont = Integer.parseInt(visit(ctx.exp()).toString());
        while(start < cont){
            conf.createPushScope();
            visitCom(ctx.com(0));
            conf.popScope();
            conf.update(id, new IntegerValue(start + 1));
            start++;
        }
        conf.popScope();
        if(ctx.com(1) != null)
            visitCom(ctx.com(1));
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        return (ComValue) visit(ctx.com());
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitNothing(ImpParser.NothingContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitIdDecAsgn(ImpParser.IdDecAsgnContext ctx) {
        return visit(ctx.idDecAssign());
    }

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> val = (ExpValue<?>) visit(ctx.idAssign());
        Types type = conf.getValueType(id).getT();
        if(type == Types.CONST){
            System.err.println("It is not possible to modify a constant");
            System.exit(1);
        }
        conf.update(id, val);
        return ComValue.INSTANCE;
    }


    @Override
    public Value visitDeclaration(ImpParser.DeclarationContext ctx) {
        String id = ctx.ID().getText();
        try {
            Types type = Types.valueOf(visitIdTypeDec(ctx.idTypeDec()).toString());
            ExpValue<?> val = null;
            if(ctx.idAssign() != null)
                val = (ExpValue<?>) visit(ctx.idAssign());

            conf.createElementPush(id, val, type);
        } catch (IllegalArgumentException e) {
            System.err.println("Wrong type of the identifier, use (var of CONST)");
            System.err.println("Type mismatch error at line: " + ctx.start.getLine() + " character: " + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<");
            System.exit(1);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public StringValue visitIdTypeDec(ImpParser.IdTypeDecContext ctx) {
        return new StringValue(ctx.idType.getText());
    }

    @Override
    public ExpValue<?> visitIdAssign(ImpParser.IdAssignContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        visitCom(ctx.com(1));

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        conf.createPushScope();
        while(visitBoolExp(ctx.exp()) != false) {
            visitCom(ctx.com(0));
        }
        conf.popScope();
        if(visitCom(ctx.com(1)) != null)
            visitCom(ctx.com(1));
        return ComValue.INSTANCE;
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (conf.returnScopeOfId(id) < 0){
            System.err.println("Variable id used but never initiated at line: " + ctx.start.getLine() + " character: " + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<");
            System.exit(1);
        }
        return conf.getValueType(id).getV();
    }

    @Override
    public Value visitVectorDeclaration(ImpParser.VectorDeclarationContext ctx) {
        String id = ctx.ID(0).getText();
        Types type = Types.var;
        int length = 1;
        switch(ctx.index.getType()){
            case ImpParser.INT -> length = Integer.parseInt(ctx.INT().getText());
            case ImpParser.ID -> length = visitIntNum(ctx.ID(1).getText());
            default -> {}
        }


        ExpValue<?>[] array = new ExpValue<?>[length];
        ExpValue<?> val = new ArrayValue(array);
        conf.createElementPush(id, val, type);

        return ComValue.INSTANCE;
    }

    @Override
    public ExpValue<?> visitArrayAccess(ImpParser.ArrayAccessContext ctx) {
        String id = ctx.ID(0).getText();
        int index = 0;
        switch(ctx.index.getType()){
            case ImpParser.INT -> index = Integer.parseInt(ctx.INT().getText());
            case ImpParser.ID -> index = visitIntNum(ctx.ID(1).getText());
            default -> {}
        }
        ArrayValue array = (ArrayValue) conf.getValueType(id).getV();
        return array.getAccess(index);
    }

    @Override
    public ComValue visitVectorAssign(ImpParser.VectorAssignContext ctx) {
        String id = ctx.ID(0).getText();

        int index = 0;
        switch(ctx.index.getType()){
            case ImpParser.INT -> index = Integer.parseInt(ctx.INT().getText());
            case ImpParser.ID -> index = visitIntNum(ctx.ID(1).getText());
            default -> {}
        }
        ExpValue<?> value = visitIdAssign(ctx.idAssign());
        ArrayValue array = (ArrayValue) conf.getValueType(id).getV();
        array.setArrayValue(index, value);

        return ComValue.INSTANCE;
    }

    public int visitIntNum(String id){
        ExpValue<?> value = conf.getValueType(id).getV();
        if(!(value instanceof IntegerValue)){
            System.err.println("You cannot use a non-integer value as index for an array");
            System.exit(1);
        }
        return Integer.parseInt(value.toString());
    }

    @Override
    public ComValue visitOutput(ImpParser.OutputContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public ExpValue<?> visitType(ImpParser.TypeContext ctx) {
        return (ExpValue<?>) visit(ctx.types());
    }

    @Override
    public IntegerValue visitIntegers(ImpParser.IntegersContext ctx) {
        return new IntegerValue(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public StringValue visitString(ImpParser.StringContext ctx) {
        return new StringValue(ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1));
    }

    @Override
    public FloatValue visitFloat(ImpParser.FloatContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public BoolValue visitBoolean(ImpParser.BooleanContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public BoolValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> first = visitExp(ctx.exp(0));
        ExpValue<?> second =  visitExp(ctx.exp(1));
        return switch(ctx.op.getType()){
            case ImpParser.EQQ -> new BoolValue(first.equals(second));
            case ImpParser.NEQ -> new BoolValue(!first.equals(second));
            default -> null;
        };
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        boolean exp = visitBoolExp(ctx.exp());
        return new BoolValue(!exp);
    }

    @Override
    public BoolValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.AND -> new BoolValue(left && right);
            case ImpParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    public ExpValue<?> visitNumberExp(ImpParser.ExpContext ctx){
        ExpValue<?> exp = visitExp(ctx);
        if (!(exp instanceof IntegerValue) && !(exp instanceof FloatValue) ){
            System.err.println("The two terms are not numbers at line: " + ctx.start.getLine() + " character: " + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<");
            System.exit(1);
        }
        return exp;
    }

    @Override
    public BoolValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        ExpValue<?> left = visitNumberExp(ctx.exp(0));
        ExpValue<?> right = visitNumberExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.LEQ -> new BoolValue(left.compareTo(right) <= 0);
            case ImpParser.GEQ -> new BoolValue(left.compareTo(right) >= 0);
            case ImpParser.LT -> new BoolValue(left.compareTo(right) < 0);
            case ImpParser.GT -> new BoolValue(left.compareTo(right) >= 0);
            default -> null;
        };
    }


    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public StringValue visitConcat(ImpParser.ConcatContext ctx) {
        String concatString = visitExp(ctx.exp(0)).toString();
        String secondString = visitExp(ctx.exp(1)).toString();

        concatString = concatString + secondString;

        return new StringValue(concatString);
    }


    @Override
    public ExpValue<?> visitAddSub(ImpParser.AddSubContext ctx) {
        ExpValue<?> firstOperator = visitNumberExp(ctx.exp(0));
        ExpValue<?> secondOperator = visitNumberExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.ADD -> add(firstOperator, secondOperator);
            case ImpParser.SUB -> sub(firstOperator, secondOperator);
            default -> null;
        };
    }


    @Override
    public ExpValue<?> visitDivMulMod(ImpParser.DivMulModContext ctx) {
        ExpValue<?> firstOperator = visitNumberExp(ctx.exp(0));
        ExpValue<?> secondOperator = visitNumberExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.DIV -> div(firstOperator, secondOperator);
            case ImpParser.MUL -> mul(firstOperator, secondOperator);
            case ImpParser.MOD -> mod(firstOperator, secondOperator);
            default -> null;
        };
    }


    @Override
    public ExpValue<?> visitPow(ImpParser.PowContext ctx) {
        ExpValue<?> firstOperator = visitNumberExp(ctx.exp(0));
        ExpValue<?> secondOperator = visitNumberExp(ctx.exp(1));

        return myPow(firstOperator, secondOperator);
    }


    public ExpValue<?> myPow(ExpValue<?> left, ExpValue<?> right){
        if (left instanceof FloatValue || right instanceof FloatValue) {
            float baseValue = Float.parseFloat(left.toString()) ;
            float exponentValue = Float.parseFloat(right.toString());
            float result = (float) Math.pow(baseValue, exponentValue);
            return new FloatValue(result);
        } else {
            int result = (int) Math.pow(Integer.parseInt(left.toString()), Integer.parseInt(right.toString()));
            return new IntegerValue(result);
        }
    }

    public ExpValue<?> mod(ExpValue<?> left, ExpValue<?> right) {
        if (left instanceof FloatValue || right instanceof FloatValue) {
            float mod = Float.parseFloat(left.toString());
            mod %= Float.parseFloat(right.toString());
            return new FloatValue(mod);
        } else {
            int mod = Integer.parseInt(left.toString()) % Integer.parseInt(right.toString());
            return new IntegerValue(mod);
        }
    }

    public ExpValue<?> add(ExpValue<?> left, ExpValue<?> right) {
        if(left instanceof FloatValue || right instanceof FloatValue){
            return new FloatValue(Float.parseFloat(left.toString()) + Float.parseFloat(right.toString()));
        } else {
            return new IntegerValue(Integer.parseInt(left.toString()) + Integer.parseInt(right.toString()));
        }
    }

    public ExpValue<?> sub(ExpValue<?> left, ExpValue<?> right) {
        if(left instanceof FloatValue || right instanceof FloatValue){
            return new FloatValue(Float.parseFloat(left.toString()) - Float.parseFloat(right.toString()));
        } else {
            return new IntegerValue(Integer.parseInt(left.toString()) - Integer.parseInt(right.toString()));
        }
    }

    public ExpValue<?> mul(ExpValue<?> left, ExpValue<?> right) {
        if(left instanceof FloatValue || right instanceof FloatValue){
            return new FloatValue(Float.parseFloat(left.toString()) * Float.parseFloat(right.toString()));
        } else {
            return new IntegerValue(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
        }
    }

    public ExpValue<?> div(ExpValue<?> left, ExpValue<?> right) {
        return new FloatValue(Float.parseFloat(left.toString()) / Float.parseFloat(right.toString()));
    }

}
