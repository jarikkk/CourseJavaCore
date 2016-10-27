package task10_1;

public class Task1 {

    public Task1(String s) {
    }

    public static void main(String[] args) {


        try {
            Integer i = null;
            Task1 m = new Task1(i.toString());
        } catch (Exception t) {
            System.out.println("Got the exception");
        } finally {
            System.out.println("finally here");
        }
    }
}
