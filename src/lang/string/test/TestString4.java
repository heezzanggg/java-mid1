package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,5);
        String extName = str.substring(5,9);
        //subString() 사용해서 hello부분과 .txt 부분 분리
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
