package task11_3;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWordsWriteToFileWithExContent {
    public static void main(String[] args) {

        ReplaceWordsWriteToFileWithExContent ReplaceWordsWriteToFileWithExContent = new ReplaceWordsWriteToFileWithExContent();
        BufferedReader br = ReplaceWordsWriteToFileWithExContent.readFromFile();
        Map<String, String> replace = ReplaceWordsWriteToFileWithExContent.replaceWords("pop", "!!!", br);
        ReplaceWordsWriteToFileWithExContent.filecontantReplacer(replace);


    }

    public BufferedReader readFromFile() {
        BufferedReader br;
        try {
            return br = new BufferedReader(new FileReader("C:\\TEST.txt"));
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
            bufferedReader.close();
            return replacer;


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");

        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    public void filecontantReplacer(Map<String, String> writeReplace) {
        BufferedWriter  bw;
        try {
            bw = new BufferedWriter(new FileWriter("C:\\TEST.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try {

            bw.write("\n" + String.valueOf(writeReplace.get("pop")));
            bw.close();

        } catch (IOException e) {
            System.out.println("write failed");
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("You have IO exception");
                e.printStackTrace();
            }
        }
    }
}
