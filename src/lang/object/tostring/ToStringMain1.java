package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String str = object.toString();

        //toString() 반환값
        System.out.println("str = " + str);
        // obj 직접출력
        System.out.println("obj = " + object);

    }
}
