package lab5.p4;

import java.io.*;
import java.net.URL;

public class URLReader {
    public static String readHtml(URL url) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder html = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            html.append(line).append("\n");
        }
        reader.close();
        return html.toString();
    };
}
