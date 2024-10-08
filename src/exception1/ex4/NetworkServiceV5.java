package exception1.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) throws Exception {
        String address = "https://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.innitError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }

    }
}
