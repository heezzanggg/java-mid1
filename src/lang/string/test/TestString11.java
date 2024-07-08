 package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        // StringBuilder에 있는 reverse() 이용해서 문자열 반대로 뒤집기
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(str).reverse().toString();
        System.out.println("reversed = " + reversed);

        String str1 = "str1";
        str1 = "new";
        System.out.println("str1 = " + str1);

    }
}
