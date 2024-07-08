package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //박싱 : Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //언박싱 : Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
