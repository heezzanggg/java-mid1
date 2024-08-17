package exception1.ex2;


/**
 * NetworkServiceV2_2 리팩토링 => 정상흐름과 예외 흐름 구분하기
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data) {

        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
    }
}
