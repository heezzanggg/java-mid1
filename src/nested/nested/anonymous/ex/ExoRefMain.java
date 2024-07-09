package nested.nested.anonymous.ex;

public class ExoRefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); //변화x
        System.out.println(str); //변화o
        System.out.println("프로그램 종료"); //변화x
    }

    public static void main(String[] args) {
        hello("Hello Java");
        System.out.println("------");
        hello("Hello Spring");
    }
}
