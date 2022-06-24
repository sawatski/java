package lab5.p3;

import java.io.*;

public class Decoder {
    private final char key;

    public Decoder(char key) {
        this.key = key;
    }

    public String read(String filePath) throws IOException {
        Reader file = new FileReader(filePath);
        DecryptingReader reader = new DecryptingReader(file, key);
        int nextSymbol;
        StringBuilder result = new StringBuilder();
        while ((nextSymbol = reader.read()) != -1) {
            result.append((char) nextSymbol);
        }
        reader.close();
        return result.toString();
    }

    public void write(String filePath, String data) throws IOException {
        Writer file = new FileWriter(filePath);
        EncryptingWriter writer = new EncryptingWriter(file, key);
        char[] chars = data.toCharArray();
        for (char c:
            chars) {
            writer.write(c);
        }
        writer.close();
    }
}
