package exception1.ex0;

/**
 *NetworkClient 이용해서 데이터 전송함.
 * NetworkClient 사용하기위한 연결,전송,연결 종료의 복잡한 흐름을 제어 담당
 * connect() 실패 한 경우, send() 호출 x
 * 사용 후 반드시 disconnect()호출해서 연결 해제해야 함
 */
public class NetworkService0 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
