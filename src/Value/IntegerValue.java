package Value;

public class IntegerValue extends ExpValue<Integer> {

    public IntegerValue(Integer value) {
        super(value);
    }

    public Integer de(){
        return this.toJavaValue();
    }

}
