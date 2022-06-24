package lab6;

import java.util.HashMap;

public class Translator {
    private final HashMap<String, String> translation = new HashMap<>();

    public Translator() {}

    public void addTranslation(String word, String translation) {
        this.translation.put(word, translation);
    }

    public String translate(String sentence) throws Exception {
        String replacedLine = sentence.replaceAll("[^A-Za-zА-Я0-9 ]", "");
        String[] words = replacedLine.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word :
                words) {
            String wordTranslation = translation.get(word);
            if (wordTranslation != null) {
                result.append(wordTranslation).append(" ");
            } else {
                throw new Exception("No translation for word \"" + word + "\"");
            }

        }
        return result.toString();
    }
}
