package exception1.ex3.exception;

/**
 * 연결 실패시 발생하는 예외
 */
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnectExceptionV3(String address, String errorMessage) {
        super(errorMessage);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
