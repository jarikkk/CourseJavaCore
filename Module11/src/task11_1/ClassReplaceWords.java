package task11_1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class ClassReplaceWords {
    public static void main(String[] args)  {

        ClassReplaceWords classReplaceWords = new ClassReplaceWords();
        BufferedReader br = classReplaceWords.readFromFile();
        Map<String, String> replace = classReplaceWords.replaceWords("pop", "!!!", br);
        System.out.println("Strings are replaced: " + replace);

    }

    public BufferedReader readFromFile() {
        BufferedReader br;
        try {
            return br = new BufferedReader(new FileReader("C:/TEST.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File is not found");

        }

        return null;
    }

    public Map<String, String> replaceWords(String oldString, String newString, BufferedReader bufferedReader) {
        Map<String, String> replacer = new HashMap<>();
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                if (!line.equals(oldString)) {
                    sb.append(line.replace(oldString, newString));
                    sb.append(System.lineSeparator());
                }
                line = bufferedReader.readLine();
            }
            String result = sb.toString();
            replacer.put(oldString, result);
            return replacer;


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");

        }


        return null;
    }
}


