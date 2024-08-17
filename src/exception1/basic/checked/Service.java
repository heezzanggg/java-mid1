package exception1.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     * try~catch(...) 사용해서 예외 잡기
     * try에서 발생하는 예외를 잡아서 catch로 넘기기
     * 만약 try에서 잡은 예외가 catch의 대상에 없으면 예외를 잡을 수 없으므로 이때는 예외를 밖으로 던져야함
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야함
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
