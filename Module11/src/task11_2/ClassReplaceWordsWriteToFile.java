package task11_2;



import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ClassReplaceWordsWriteToFile {
    public static void main(String[] args)  {

        ClassReplaceWordsWriteToFile classReplaceWords = new ClassReplaceWordsWriteToFile();
        BufferedReader br = classReplaceWords.readFromFile();
        Map<String, String> replace = classReplaceWords.replaceWords("pop", "!!!", br);
        classReplaceWords.filecontantReplacer(replace);


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

    public void filecontantReplacer(Map<String,String> writeReplace){
try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/TEST.txt"));
        bw.write(String.valueOf(writeReplace.get("pop")));
        bw.close();
    } catch (IOException e) {
        System.out.println("read failed");
    }
    }
}
