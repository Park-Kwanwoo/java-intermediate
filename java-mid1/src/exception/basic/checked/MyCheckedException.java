package exception.basic.checked;

/**
 * RuntimeException을 제외한
 * Exception을 상속 받은 모든 클래스는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message);
    }
}
