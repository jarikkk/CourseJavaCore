package task10_4;

public class FirstException extends Throwable {

    private String exceptionMessege = "You have the FirstException";

    public FirstException() {
    }

    public FirstException(String message, String exceptionMessege) {
        super(message);
        this.exceptionMessege = exceptionMessege;
    }

    public String getExceptionMessege() {
        return this.exceptionMessege;
    }

}
