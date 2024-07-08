package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7) );
        System.out.println("인덱스 7~12 부분: "+str.substring(7,12));
        System.out.println("문자열 결합: "+str.concat("!!!"));

        System.out.println("'Java' -> 'World': "+str.replace("Java","World"));
        System.out.println("첫번째 'Java' -> 'World': "+str.replaceFirst("Java","World"));

    }
}
