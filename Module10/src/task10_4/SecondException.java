package task10_4;


public class SecondException extends Throwable {

    private String exceptionMessege = "You have the SecondException";

    public SecondException() {
    }

    public SecondException(String message) {
        super(message);

    }

    public String getExceptionMessege() {
        return this.exceptionMessege;
    }

}
