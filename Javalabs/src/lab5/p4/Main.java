package lab5.p4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");
            String html = URLReader.readHtml(url);
            HashMap<String, Integer> tags = HtmlAnalyzer.getTags(html);

            TreeMap<String, Integer> sortedTags = new TreeMap<>(tags);
            System.out.println(sortedTags);

            TreeSet<Map.Entry<String, Integer>> sortedByValue = new TreeSet<>(
                    new Comparator<Map.Entry<String, Integer>>() {
                        @Override
                        public int compare(Map.Entry<String, Integer> e1,
                                           Map.Entry<String, Integer> e2) {
                            return (e1.getValue() - e2.getValue()) == 0 ?
                                    e1.getKey().compareTo(e2.getKey()) :
                                    e1.getValue() - e2.getValue();
                        }
                    });
            sortedByValue.addAll(tags.entrySet());
            System.out.println(sortedByValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
