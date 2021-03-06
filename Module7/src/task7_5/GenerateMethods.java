package task7_5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class GenerateMethods {

    public static ArrayList<Integer> generateMethodForInteger(int lenght) {
        ArrayList<Integer> arrayListresult = new ArrayList<>();
        for (int i = 0; i < lenght; i++) arrayListresult.add(i + 1);
        return arrayListresult;
    }

    public static ArrayList<String> generateMethodString(int number){

        char[] chars = "0123456789!@#$%^&*()abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<String> arrayListresult = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
for (int j = 0; j < number; j++) {
    for (int i = 0; i < 5; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
    }

    sb.append(" | ");
}

    String nonce = sb.toString();
    arrayListresult.add(nonce);

        return arrayListresult;
    }

public static LinkedList<Integer> generateMethodLinkedListInteger (int lenght) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    for (int i = 0; i < lenght; i++) list.add(i + 1);
    return list;
}

    public static LinkedList<String> generateMethodStringLinkedList(int number){

        char[] chars = "0123456789!@#$%^&*()abcdefghijklmnopqrstuvwxyz".toCharArray();
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int j = 0; j < number; j++) {
            for (int i = 0; i < 5; i++) {
                char c = chars[random.nextInt(chars.length)];
                sb.append(c);
            }

            sb.append(" | ");
        }

        String nonce = sb.toString();
        list.add(nonce);

        return list;
    }
}
