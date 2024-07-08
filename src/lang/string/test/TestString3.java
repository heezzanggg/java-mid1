package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        //str에서 ".txt" 문자열이 언제부터 시작하는지
        System.out.println("index = " + index);
    }
}
