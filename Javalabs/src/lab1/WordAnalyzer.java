package lab1;

public class WordAnalyzer {

    public static boolean hasCharacterDuplication(String word) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return true;
                }
            }
        }
        return false;
    };
}
