package Value;

public class ArrayValue extends ExpValue<ExpValue<?>[]> {

    public ArrayValue(ExpValue<?>[] value) {
        super(value);
    }

    public int length() {
        return toJavaValue().length;
    }

    public ExpValue<?> getAccess(int index) {
        if (index < 0 || index >= length()) {
            System.err.println("Index out of bound: " + index + ", with Vector of Length: " + length());
            System.exit(1);
        }
        return toJavaValue()[index];
    }

    public void setArrayValue(int index, ExpValue<?> value) {
        if (index < 0 || index >= length()) {
            System.err.println("Index out of bound: " + index + ", with Vector of Length: " + length());
            System.exit(1);
        }
        toJavaValue()[index] = value;
    }
}
