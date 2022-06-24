package lab5.p3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Decoder decoder = new Decoder('a');
        try {
            String s = decoder.read("src/lab5/p3/text.txt");

            System.out.println(s);
            decoder.write("src/lab5/p3/text2.txt", s);
            String s1 = decoder.read("src/lab5/p3/text2.txt");
            System.out.println(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
