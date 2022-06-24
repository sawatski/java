package lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[] {"Lorem",
                "ipsum",
                "dolor",
                "sit",
                "amet",
                "consectetur",
                "adipiscing",
                "elit"
        };

        ArrayList<String> resultList = new ArrayList<>();

        for (String word: words) {
            if (!WordAnalyzer.hasCharacterDuplication(word)) {
                resultList.add(word);
            }
        }
        String[] result = resultList.toArray(new String[0]);

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(result));
    }


}
