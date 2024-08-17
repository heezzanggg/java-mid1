package exception1.ex2;

/**
 * NetworkServiceV2_2 리팩토링 => 정상흐름과 예외 흐름 구분하기
 * 이 코드의 문제점
 * catch에서 잡을 수 없는 예외가 발생하는 경우
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data) {

        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();
    }
}
