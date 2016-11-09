package task10_5;

public class ClassException {

    public void g() throws FirstException, SecondException, ThirdException {
        int count = 0;
        if (count == 0) {
            throw new FirstException();
        }
        if (count != 1) {
            throw new SecondException();
        }
        if (count != 3) {
            throw new ThirdException();
        }
    }

    public static void main(String[] args) {

        ClassException classException = new ClassException();
        try {
            classException.g();
        } catch (FirstException | SecondException | ThirdException e) {
            e.printStackTrace();

        }
    }
}