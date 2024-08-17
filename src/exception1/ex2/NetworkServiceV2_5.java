package exception1.ex2;

/**
 * try ~ catch ~ finally : 정상흐름, 예외흐름, 마무리 흐름 제공
 * try 시작하기만 하면 finally 코드 블럭은 어떤 경우라도 반드시 호출됨
 * tray, catch 안에서 잡을 수 없는 예외가 발생해도 finally 반듯이 호출 됨
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data) {

        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }
    }
}
