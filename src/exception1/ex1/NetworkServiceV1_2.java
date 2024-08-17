package exception1.ex1;

/**
 * NetworkClient 이용해서 데이터 전송함.
 * NetworkClient 사용하기위한 연결,전송,연결 종료의 복잡한 흐름을 제어 담당
 * connect() 실패 한 경우, send() 호출 x
 * 오류 로그 남기기
 */
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("https://example.com");
        client.innitError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect();
    }

    private boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
