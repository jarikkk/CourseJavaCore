package task7_5;

import static task7_5.GenerateMethods.*;

public class Main {
    public static void main(String[] args) {

        int a1 = (int) System.currentTimeMillis();
        generateMethodForInteger(1000);
        int a2 = (int) System.currentTimeMillis();
        generateMethodForInteger(1000).set(0, 1000000);
        int a3 = (int) System.currentTimeMillis();
        generateMethodForInteger(1000).get(0);
        int a4 = (int) System.currentTimeMillis();
        generateMethodForInteger(1000).remove(0);
        int a5 = (int) System.currentTimeMillis();

        int b1 = (int) System.currentTimeMillis();
        generateMethodForInteger(10000);
        int b2 = (int) System.currentTimeMillis();
        generateMethodForInteger(10000).set(0, 1000000);
        int b3 = (int) System.currentTimeMillis();
        generateMethodForInteger(10000).get(0);
        int b4 = (int) System.currentTimeMillis();
        generateMethodForInteger(10000).remove(0);
        int b5 = (int) System.currentTimeMillis();

        int c1 = (int) System.currentTimeMillis();
        generateMethodString(1000);
        int c2 = (int) System.currentTimeMillis();
        generateMethodString(1000).set(0, "qwert");
        int c3 = (int) System.currentTimeMillis();
        generateMethodString(1000).get(0);
        int c4 = (int) System.currentTimeMillis();
        generateMethodString(1000).remove(0);
        int c5 = (int) System.currentTimeMillis();

        int d1 = (int) System.currentTimeMillis();
        generateMethodString(10000);
        int d2 = (int) System.currentTimeMillis();
        generateMethodString(10000).set(0, "qwert");
        int d3 = (int) System.currentTimeMillis();
        generateMethodString(10000).get(0);
        int d4 = (int) System.currentTimeMillis();
        generateMethodString(10000).remove(0);
        int d5 = (int) System.currentTimeMillis();

        int e1 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(1000);
        int e2 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(1000).set(0, 1000000);
        int e3 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(1000).get(0);
        int e4 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(1000).remove(0);
        int e5 = (int) System.currentTimeMillis();

        int f1 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(10000);
        int f2 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(10000).set(0, 1000000);
        int f3 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(10000).get(0);
        int f4 = (int) System.currentTimeMillis();
        generateMethodLinkedListInteger(10000).remove(0);
        int f5 = (int) System.currentTimeMillis();


        int g1 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(1000);
        int g2 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(1000).set(0, "qwert");
        int g3 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(1000).get(0);
        int g4 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(1000).remove(0);
        int g5 = (int) System.currentTimeMillis();

        int h1 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(10000);
        int h2 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(10000).set(0, "qwert");
        int h3 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(10000).get(0);
        int h4 = (int) System.currentTimeMillis();
        generateMethodStringLinkedList(10000).remove(0);
        int h5 = (int) System.currentTimeMillis();


        System.out.println("Arraylist for .add Integer 1000 el: " + (a2 - a1) + "ms");
        System.out.println("Arraylist for .set Integer 1000 el: " + (a3 - a2) + "ms");
        System.out.println("Arraylist for .get Integer 1000 el: " + (a4 - a3) + "ms");
        System.out.println("Arraylist for .remove Integer 1000 el: " + (a5 - a4) + "ms");

        System.out.println("Arraylist for .add Integer 10000 el: " + (b2 - b1) + "ms");
        System.out.println("Arraylist for .set Integer 10000 el: " + (b3 - b2) + "ms");
        System.out.println("Arraylist for .get Integer 10000 el: " + (b4 - b3) + "ms");
        System.out.println("Arraylist for .remove Integer 10000 el: " + (b5 - b4) + "ms");

        System.out.println("Arraylist for .add String 1000 el: " + (c2 - c1) + "ms");
        System.out.println("Arraylist for .set String 1000 el: " + (c3 - c2) + "ms");
        System.out.println("Arraylist for .get String 1000 el: " + (c4 - c3) + "ms");
        System.out.println("Arraylist for .remove String 1000 el: " + (c5 - c4) + "ms");

        System.out.println("Arraylist for .add String 10000 el: " + (d2 - d1) + "ms");
        System.out.println("Arraylist for .set String 10000 el: " + (d3 - d2) + "ms");
        System.out.println("Arraylist for .get String 10000 el: " + (d4 - d3) + "ms");
        System.out.println("Arraylist for .remove String 10000 el: " + (d5 - d4) + "ms");

        System.out.println("Linkedlist for .add Integer 1000 el: " + (e2 - e1) + "ms");
        System.out.println("Linkedlist for .set Integer 1000 el: " + (e3 - e2) + "ms");
        System.out.println("Linkedlist for .get Integer 1000 el: " + (e4 - e3) + "ms");
        System.out.println("Linkedlist for .remove Integer 1000 el: " + (e5 - e4) + "ms");

        System.out.println("Linkedlist for .add Integer 10000 el: " + (f2 - f1) + "ms");
        System.out.println("Linkedlist for .set Integer 10000 el: " + (f3 - f2) + "ms");
        System.out.println("Linkedlist for .get Integer 10000 el: " + (f4 - f3) + "ms");
        System.out.println("Linkedlist for .remove Integer 10000 el: " + (f5 - f4) + "ms");

        System.out.println("Linkedlist for .add String 1000 el: " + (g2 - g1) + "ms");
        System.out.println("Linkedlist for .set String 1000 el: " + (g3 - g2) + "ms");
        System.out.println("Linkedlist for .get String 1000 el: " + (g4 - g3) + "ms");
        System.out.println("Linkedlist for .remove String 1000 el: " + (g5 - g4) + "ms");

        System.out.println("Linkedlist for .add String 10000 el: " + (h2 - h1) + "ms");
        System.out.println("Linkedlist for .set String 10000 el: " + (h3 - h2) + "ms");
        System.out.println("Linkedlist for .get String 10000 el: " + (h4 - h3) + "ms");
        System.out.println("Linkedlist for .remove String 10000 el: " + (h5 - h4) + "ms");


    }

}
