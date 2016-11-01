package task10_4;


public class SecondException extends Throwable {

    public SecondException() {
    }

    public SecondException(String message) {
        super(message);
    }

    public SecondException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondException(Throwable cause) {
        super(cause);
    }

    public SecondException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
