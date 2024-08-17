package exception1.basic.unchecked;

public class Service {
    Client client = new Client();

    /**
     * 필요한 경우 예외를 잡아서 처리하면 됨
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 예외를 잡지 않아도 됨. 자연스럽게 상위로 넘어감
     * 체크 예외와 다르게 throws 예외 선언 하지 않아도 됨
     */
    public void callThrow(){
        client.call();
    }
}
