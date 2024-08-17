package exception1.ex4;

import exception1.ex4.exception.ConnectExceptionV4;
import exception1.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);

    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void innitError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    /**
     * AutoCloseable 인터페이스가 제공하는 메서드
     * try가 끝나면 자동으로 호출됨
     * 종료 시점에 자원을 반납하는 방법을 정의하면 됨
     */
    @Override
    public void close() throws Exception {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
