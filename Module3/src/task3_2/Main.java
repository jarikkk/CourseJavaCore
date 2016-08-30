package task3_2;

public class Main {
    public static void main(String[] args) {

Integer a = 5;
        Integer b = 7;

   Adder adder = new Adder();
        adder.add(a,b);
        adder.check(a,b);


        System.out.println(adder.add(a,b));
        System.out.println(adder.check(a,b));

    }
}
