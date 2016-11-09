package task10_5;


public class ThirdException extends Exception {

    private String exceptionMessege = "You have the SecondException";

    public ThirdException() {
    }

    public ThirdException(String exceptionMessege) {
        this.exceptionMessege = exceptionMessege;
    }


}
