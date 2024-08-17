package exception1.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendData;

    public SendExceptionV4(String sendData, String errorMessage) {
        super(errorMessage);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
