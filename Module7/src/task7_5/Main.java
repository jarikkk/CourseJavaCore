package task7_5;

import static task7_5.GenerateMethods.*;

public class Main {
    public static void main(String[] args) {

        int a = (int) System.currentTimeMillis();
        System.out.println(generateMethodForInteger(1000));
        int b = (int) System.currentTimeMillis();
        System.out.println(generateMethodForInteger(10000));
        int c = (int) System.currentTimeMillis();
        System.out.println(generateMethodString(1000));
        int d = (int) System.currentTimeMillis();
        System.out.println(generateMethodString(10000));
        int e = (int) System.currentTimeMillis();
        System.out.println(generateMethodLinkedListInteger(1000));
        int f = (int) System.currentTimeMillis();
        System.out.println(generateMethodLinkedListInteger(10000));
        int g = (int) System.currentTimeMillis();
        System.out.println(generateMethodStringLinkedList(1000));
        int h = (int) System.currentTimeMillis();
        System.out.println(generateMethodStringLinkedList(10000));
        int i = (int) System.currentTimeMillis();


        System.out.println("Arraylist for Integer 1000 el: " + (b - a) + "ms");
        System.out.println("Arraylist for Integer 10000 el: " + (c - b) + "ms");

        System.out.println("Arraylist for String 1000 el: " + (d - c) + "ms");
        System.out.println("Arraylist for String 10000 el: " + (e - d) + "ms");

        System.out.println("LinkedList for Integer 1000 el: " + (f - e) + "ms");
        System.out.println("LinkedList for Integer 10000 el: " + (g - f) + "ms");

        System.out.println("LinkedList for String 1000 el: " + (h - g) + "ms");
        System.out.println("LinkedList for String 10000 el: " + (i - h) + "ms");

    }

}
