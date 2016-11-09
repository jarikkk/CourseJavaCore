package task10_4;

public class FirstException extends Exception {

    private String exceptionMessege = "You have the FirstException";

    public FirstException() {
    }

    public FirstException(String message, String exceptionMessege) {

        this.exceptionMessege = exceptionMessege;
    }

    public String getExceptionMessege() {
        return this.exceptionMessege;
    }

}
