package exception1.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
