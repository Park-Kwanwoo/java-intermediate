package exception.ex5;

public class NetworkServiceV5 {

    public void sendMessage(String data) {

        try (NetworkClientV5 client = new NetworkClientV5("https://example.com")){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
