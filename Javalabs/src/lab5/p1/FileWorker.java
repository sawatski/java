package lab5.p1;

import java.io.*;
import java.util.ArrayList;

public class FileWorker {
    public static String[] readFile(String path) throws IOException {
        BufferedReader reader = null;
        ArrayList<String> lines = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(path));
            String newLine;
            while ((newLine = reader.readLine()) != null) {
                lines.add(newLine);
            }
        } finally {
            if (reader != null) reader.close();
        }

        return lines.toArray(new String[0]);
    }
}
