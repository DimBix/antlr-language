import Value.ExpValue;
import Value.Types;
import Value.ValueType;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Conf {

    private final ArrayList<FunType> functions = new ArrayList<>();
    private ArrayList<Integer> pointerFun = new ArrayList<>();

    public ImpParser.FunDefContext returnFunBody(){
        return getFunctionScope().getCommands();
    }

    public void initFunPointer(){
        pointerFun.addFirst(0);
    }

    public void initFunScope(){
        functions.addFirst(new FunType("program0", new ArrayList(), null, -1));
    }

    public Integer getPointerFun(){
        return pointerFun.getLast();
    }

    public FunType getFunctionScope() {
        return functions.get(getPointerFun());
    }

    public FunType getFunctionScope(int index) {return functions.get(index);}

    public void exitFunScope(){
        functions.remove(pointerFun);
        pointerFun.removeLast();
    }

    public void killAllChildrens(int index, int father){
        ArrayList<Integer> childrens = getFunctionScope(index).getChildrenScopes();
        if(childrens.size()  != 0) {
            for (int i = 0; i < childrens.size(); i++) {
                killAllChildrens(childrens.get(i), father);
            }
        }else{
            if(index != father)
                functions.remove(index);
        }
    }


    public void enterFunScope(String id){
        if(containsFun(id)){
            int i = functions.size()-1;
            while(functions.get(i).getId().compareTo(id) != 0 && i >= 0){i--;}
            pointerFun.addLast(i);
        }else{
            System.err.println("The function " + id + " is not defined, define it first");
            System.exit(1);
        }
    }

    public void createPushScope(){
        getFunctionScope().getList().addLast(new HashMap());
    }

    public ArrayList<Map<String, ValueType>> getList(){
        return getFunctionScope().getList();
    }

    public ArrayList<Map<String, ValueType>> getList(int scope){ return getFunctionScope(scope).getList();}

    public void popScope(){
        getFunctionScope().getList().removeLast();
    }

    public void createFunScope(String id, ImpParser.FunDefContext ctx){
        if(!containsFun(id)) {
            functions.addLast(new FunType(id, new ArrayList(), ctx, getPointerFun()));
        } else{
            System.err.println("The function " + id + " is already defined, choose a different name");
            System.exit(1);
        }
    }

    public boolean containsFun(String id){
        int i = 0;
        while(functions.size() > i && functions.get(functions.size() - 1 - i).getId().compareTo(id) != 0){i++;}
        return functions.size() == i ? false : true;
    }

    public int returnPositionInScope(String id, int scope){
        int i = 0;
        int listSize = getList(scope).size();
        boolean found = false;
        if(listSize != 0){
            found = getList(scope).get(listSize - 1).containsKey(id);

            while (i < listSize && !found) {
                found = getList(scope).get(listSize - 1 - i).containsKey(id);
                if(!found)
                    i++;
            }
        }
        return listSize - 1 - i;
    }


    public int returnScopeOfId(String id){
        int i, fatherScope = getPointerFun();
        int listSize = getList(fatherScope).size();
        boolean found = getList(fatherScope).get(listSize - 1).containsKey(id);

        while(fatherScope >= 0 && !found) {
            i = 0;
            while (listSize > i && !found) {
                found = getList(fatherScope).get(listSize - 1 - i).containsKey(id);
                listSize = getList(fatherScope).size();
                i++;
            }
            if(!found)
                fatherScope = getFunctionScope(fatherScope).getFatherScope();
        }

        return fatherScope;
    }

    public ValueType getValueType(String id){
        int idScope = returnScopeOfId(id);
        if( idScope >= 0) {
            return getList(idScope).get(returnPositionInScope(id, idScope)).get(id);
        }else{
            System.err.println("The variable " + id + " does not exist, choose a different name");
            System.exit(1);
        }
        return null;
    }

    public void createElementPush(String id, ExpValue<?> value, Types type){
        if(returnPositionInScope(id, getPointerFun()) < 0) {
            ValueType val = new ValueType(value, type);
            getList().getLast().put(id, val);
        }else{
            System.err.println("The variable " + id + " is already defined, choose a different name");
            System.exit(1);
        }
    }

    public void update(String id, ExpValue<?> value){
        Types type = getValueType(id).getT();
        ValueType val = new ValueType(value, type);
        getList(returnScopeOfId(id)).getLast().put(id, val);
    }

    public static class FunType {

        private String id;
        private ArrayList<Map<String, ValueType>> list;
        private ImpParser.FunDefContext commands;
        private ArrayList<String> stackArgsId;
        private ArrayList<Types> stackArgsType;
        private int fatherScope;
        private ArrayList<Integer> childrensScopes;

        public FunType(String id, ArrayList<Map<String, ValueType>> list, ImpParser.FunDefContext ctx, int fatherScope) {
            this.id = id;
            this.list = list;
            this.commands = ctx;
            stackArgsId = new ArrayList<>();
            stackArgsType = new ArrayList<>();
            list.add(new HashMap<>());
            this.fatherScope = fatherScope;
            this.childrensScopes = new ArrayList<>();
        }

        public void addChildrenScope(int index){
            childrensScopes.addLast(index);
        }

        public void resetChildrenScope(){
            childrensScopes = new ArrayList<>();
        }

        public ArrayList<Integer> getChildrenScopes(){
            return childrensScopes;
        }

        public ImpParser.FunDefContext getCommands() {
            return commands;
        }

        public String getId() {
            return id;
        }

        public ArrayList<Map<String, ValueType>> getList() {
            return list;
        }

        public String getStackArgsId() { return stackArgsId.getLast(); }

        public void resetList(){
            list = new ArrayList<>();
            list.add(new HashMap<>());
        }

        public void pushArg(String id){
            stackArgsId.addLast(id);
        }

        public Types getStackArgType() { return stackArgsType.getLast(); }

        public void pushArgType(Types type){
            stackArgsType.addLast(type);
        }

        public int getFatherScope(){
            return fatherScope;
        }
    }
}
