package lab5.p1;

public class TextAnalyzer {
    public static String getLongestLineByWords(String[] lines) {
        String longestLine = "";
        int length = 0;
        for (String line : lines) {
            String replacedLine = line.replaceAll("[^A-Za-zА-Яа-я ]", "");
            String[] words = replacedLine.split(" ");
            if (length < words.length) {
                length = words.length;
                longestLine = line;
            }
        }
        return longestLine;
    }
}
