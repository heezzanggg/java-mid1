package exception1.ex4.exception;

public class ConnectExceptionV4 extends NetworkClientExceptionV4{

    private final String address;

    public ConnectExceptionV4(String address, String errorMessage) {
        super(errorMessage);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
