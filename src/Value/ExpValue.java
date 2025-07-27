package Value;

import java.util.Objects;

public abstract class ExpValue<T> extends Value {

    private final T value;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if(getClass() != obj.getClass()) {
            if((this instanceof IntegerValue || this instanceof FloatValue) && (obj instanceof IntegerValue || obj instanceof FloatValue)){
                float first = Float.parseFloat(this.value.toString());
                float second = Float.parseFloat(((ExpValue<?>) obj).value.toString());
                return (new FloatValue(first)).equals(new FloatValue(second));
            }
            System.err.println("Type mismatch, the two objects doesn't have the same type.");
            System.err.println(">>>>>>>>>>>>>>>>>>>>");
            System.err.println("<<<<<<<<<<<<<<<<<<<<");
            System.exit(1);
        }

        ExpValue<T> expValue = (ExpValue<T>) obj;
        return value.equals(expValue.value);
    }

    public int compareTo(Object obj) {
        ExpValue<T> expValue = (ExpValue<T>) obj;
        return Float.compare(Float.parseFloat(this.value.toString()), Float.parseFloat(expValue.value.toString()));
    }

    @Override
    public String toString(){
        return value.toString();
    }

    public T toJavaValue(){
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    ExpValue(T value) {
        this.value = value;
    }



}
