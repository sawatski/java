package lab6;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.addTranslation("I", "Я");
        translator.addTranslation("like", "люблю");
        translator.addTranslation("drinking", "пити");
        translator.addTranslation("coffee", "каву");
        translator.addTranslation("coffee", "чайa");

        String inputStr = "I like drinking coffee.";
        try {
            String translation = translator.translate(inputStr);
            System.out.println(inputStr);
            System.out.println(translation);

            System.out.println("Enter words translation in the format \"word\"=\"translation\". " +
                    "Write the following translations with a space.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.println(input);
            String[] inputTranslations = input.split(" ");
            for (String s :
                    inputTranslations) {
                String[] wordAndTranslation = s.split("=");
                if (wordAndTranslation.length == 2) {
                    translator.addTranslation(wordAndTranslation[0], wordAndTranslation[1]);
                }
            }

            System.out.println("Enter the sentence you want to translate.");
            String sentence = reader.readLine();
            String sentenceTranslation = translator.translate(sentence);
            System.out.println(sentenceTranslation);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
