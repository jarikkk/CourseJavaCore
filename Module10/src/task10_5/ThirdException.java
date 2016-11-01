package task10_5;


public class ThirdException extends Throwable {
    public ThirdException() {
    }

    public ThirdException(String message) {
        super(message);
    }

    public ThirdException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThirdException(Throwable cause) {
        super(cause);
    }

    public ThirdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
