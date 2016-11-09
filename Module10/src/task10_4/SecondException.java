package task10_4;


public class SecondException extends Exception{

    private String exceptionMessege = "You have the SecondException";

    public SecondException() {
    }

    public SecondException(String exceptionMessege) {
       this.exceptionMessege = exceptionMessege;

    }

    public String getExceptionMessege() {
        return this.exceptionMessege;
    }

}
