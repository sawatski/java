package lab5.p1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            String[] lines = FileWorker.readFile("src/lab5/p1/text.txt");
            for (String line: lines) {
                System.out.println(line);
            }
            System.out.println(TextAnalyzer.getLongestLineByWords(lines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
