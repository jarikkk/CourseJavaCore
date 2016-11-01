package task10_5;

public class ClassException {

    public void g() throws FirstException, SecondException, ThirdException {

    }

    public static void main(String[] args) {

        ClassException classException = new ClassException();
        try {
            classException.g();
        } catch (FirstException | SecondException | ThirdException exceptions) {
            System.out.println("There are three exceptions in one catch clause");
        }

    }
}
