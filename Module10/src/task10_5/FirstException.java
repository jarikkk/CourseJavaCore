package task10_5;

public class FirstException extends Exception {

    private String exceptionMessege = "You have the FirstException";

    public FirstException() {
    }

    public FirstException(String exceptionMessege) {
        this.exceptionMessege = exceptionMessege;
    }

    public String getExceptionMessege() {
        return this.exceptionMessege;
    }
}
