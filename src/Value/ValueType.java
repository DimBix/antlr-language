package Value;

import java.util.ArrayList;

public class ValueType {

    private ExpValue<?> value;
    private Types type;

    public ValueType(ExpValue<?> value, Types type) {
        this.value = value;
        this.type = type;
    }

    public ExpValue<?> getV() {
        return value;
    }

    public Types getT() {
        return type;
    }

}