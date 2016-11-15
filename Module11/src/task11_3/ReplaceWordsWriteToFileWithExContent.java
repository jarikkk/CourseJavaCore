package task11_3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWordsWriteToFileWithExContent {
    public static void main(String[] args) {

        String oldString = "pop";
        String newString = "!!!";
        Map<String, String> stringsToReplace = new HashMap<>();
        stringsToReplace.put(oldString, newString);

        ReplaceWordsWriteToFileWithExContent classReplaceWords = new ReplaceWordsWriteToFileWithExContent();
        BufferedReader br = classReplaceWords.readFromFile();
        Map<String, String> replace = classReplaceWords.replaceWords(stringsToReplace, br);
        classReplaceWords.filecontentMerger(replace);


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

    public Map<String, String> replaceWords(Map<String, String> stringsToReplace, BufferedReader bufferedReader) {
        Map<String, String> replacer = new HashMap<>();
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {

                    if (stringsToReplace.containsKey(s[i])) {
                        sb.append(stringsToReplace.get(s[i]) + " ");
                    } else {
                        sb.append(s[i] + " ");
                    }
                }
                line = bufferedReader.readLine();
            }
            String result = sb.toString();

            replacer.put(stringsToReplace.values().toArray()[0].toString(), result);
            return replacer;


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");

        }


        return null;
    }

    public void filecontentMerger(Map<String, String> writeReplace) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("C:\\TEST.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("read failed");
            return;
        }
        try {
            for (String key :
                    writeReplace.keySet()) {
                bw.write(String.valueOf(writeReplace.get(key)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
