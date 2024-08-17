package exception1.ex0;

public class NetworkClientV0 {
//외부서버와 연결, 데이터 전송, 연결 종료
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address+" 서버 연결 해제");
    }
}
