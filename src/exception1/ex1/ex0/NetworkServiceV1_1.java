package exception1.ex1.ex0;

/**
 *NetworkClient 이용해서 데이터 전송함.
 * NetworkClient 사용하기위한 연결,전송,연결 종료의 복잡한 흐름을 제어 담당
 */
public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.innitError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
