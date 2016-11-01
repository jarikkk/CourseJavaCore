package task10_5;

public class FirstException extends Throwable {
    public FirstException() {
    }

    public FirstException(String message) {
        super(message);
    }

    public FirstException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstException(Throwable cause) {
        super(cause);
    }

    public FirstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
