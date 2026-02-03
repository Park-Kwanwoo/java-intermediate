package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {

        private final String content;

        NetworkMessage(String content) {
            this.content = content;
        }

        void print() {
            System.out.println(this.content);
        }
    }
}
