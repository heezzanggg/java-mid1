package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "hello, World!";

        System.out.println("str1 equals str2: "+str1.equals(str2)); //false
        System.out.println("str1 equalsIgnoreCase str2: "+str1.equalsIgnoreCase(str2)); //true

        //두 문자열을 사전순으로 비교 빠르면 0 / 늦으면 1 /
        System.out.println("'b' compareTo 'a': " +"b".compareTo("a")); //1
        System.out.println("str1 compareTo str3: "+str1.compareTo(str3)); //
        System.out.println("str1 compareToIgnoreCase str2: "+str1.compareToIgnoreCase(str2)); //0

        System.out.println("str1 starts with 'Hello': "+str1.startsWith("Hello")); //true
        System.out.println("str1 ends with 'Java!': "+str1.endsWith("Java!"));//true

    }
}
