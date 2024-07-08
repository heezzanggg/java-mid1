package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열 길이: " + str.length()); //12
        System.out.println("문자열이 비어있는지: " + str.isEmpty()); //false
        System.out.println("문자열이 비어있거나 공백인지1: " +str.isBlank()); //false
        System.out.println("문자열이 비어있거나 공백인지2: " +"    ".isBlank());//true

        char c = str.charAt(0);
        System.out.println("0번 인덱스의 문자: "+c);
    }
}
