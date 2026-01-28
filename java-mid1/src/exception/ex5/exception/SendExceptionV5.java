package exception.ex5.exception;

public class SendExceptionV5 extends NetworkExceptionV5 {

    private final String sendData;

    public SendExceptionV5(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
