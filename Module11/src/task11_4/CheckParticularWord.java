package task11_4;

import java.io.*;


public class CheckParticularWord {
    public static void main(String[] args) {

        CheckParticularWord CheckParticularWord = new CheckParticularWord();
        BufferedReader br = CheckParticularWord.readFromFile();
        String var = CheckParticularWord.calculateWords(br);
        int checkWords = CheckParticularWord.checkWord(var);
        System.out.println(checkWords);

    }

    public BufferedReader readFromFile() {
        BufferedReader br;
        try {
            return br = new BufferedReader(new FileReader("C:\\TEST.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is not found");

        }

        return null;
    }

    public BufferedReader readFromFileWithResources() throws FileNotFoundException, IOException{
try (BufferedReader br = new BufferedReader(new FileReader("C:\\TEST.txt"))) {
    return br;
}
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

        int count = 0;
        String array[];
        array = var.split("[ \t,\r\n]");
        for (String s : array) {
            if (s.contains("pop")) {
                count++;
            } else {
                System.out.println("0");
            }
        }

        return count;
    }
}
