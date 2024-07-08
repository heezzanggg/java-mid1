package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = "+Grade.BASIC.getClass());
        System.out.println("class GOLD = "+Grade.GOLD.getClass());
        System.out.println("class DIAMOND = "+Grade.DIAMOND.getClass());

        System.out.println("rev BASIC = "+ refValue(Grade.BASIC));
        System.out.println("rev GOLD = "+ refValue(Grade.GOLD));
        System.out.println("rev DIAMOND = "+ refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }



}
