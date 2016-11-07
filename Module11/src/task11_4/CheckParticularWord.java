package task11_4;

import java.io.*;


public class CheckParticularWord {
    public static void main(String[] args) {

        CheckParticularWord CheckParticularWord = new CheckParticularWord();
        BufferedReader br = CheckParticularWord.readFromFile();
        String var = CheckParticularWord.calculateWords(br);



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

    public String calculateWords(BufferedReader bufferedReader) {
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                if (!line.equals(null)) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                line = bufferedReader.readLine();
            }
            String result = sb.toString();
            bufferedReader.close();
            return result;
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

    public int checkWord(String var) {

        return 0;
}
