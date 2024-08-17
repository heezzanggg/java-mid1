package exception1.ex3.exception;

/**
 * 전송 실패시 발새아는 예외
 */
public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SendExceptionV3(String sendData, String errorMessage) {
        super(errorMessage);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }

}
