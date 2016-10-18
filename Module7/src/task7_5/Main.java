package task7_5;

import java.util.ArrayList;
import java.util.Random;

import static task7_5.GenerateMethods.generateMethodForInteger;
import static task7_5.GenerateMethods.generateMethodString;

public class Main {
    public static void main(String[] args) {
        int a = (int) System.currentTimeMillis();
        System.out.println(a);
        System.out.println(generateMethodForInteger(1000));
        int b = (int) System.currentTimeMillis();
        System.out.println(b);
        System.out.println(generateMethodForInteger(10000));
        int c = (int) System.currentTimeMillis();
        System.out.println(c);
        System.out.println(generateMethodString(1000));
        int d = (int) System.currentTimeMillis();
        System.out.println(d);
        System.out.println(generateMethodString(10000));
        int e = (int) System.currentTimeMillis();
        System.out.println(e);


    }

}
