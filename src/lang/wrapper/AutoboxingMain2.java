package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //오토 박싱 : Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;
        //오토 언박싱 : Wrapper -> Primitive
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        System.out.println("sum: "+Integer.sum(10,20));
        System.out.println("min: "+Integer.min(10,20));
        System.out.println("max: "+Integer.max(10,20));
    }
}
