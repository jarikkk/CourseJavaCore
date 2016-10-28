package task10_3;

public class Task10_3 {

    public static void main(String[] args) {

        Integer a = null;

        try {

            System.out.println(a.floatValue());

        } catch (NullPointerException n) {
            System.out.println("Got exception with null");
        } finally {
            System.out.println("no exceptions");
        }


    }
}
