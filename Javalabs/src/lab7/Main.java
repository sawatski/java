package lab7;

import java.util.Arrays;
import java.util.function.Predicate;

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

        Predicate<String> hasCharacterDuplication = x -> {
            char[] chars = x.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        return true;
                    }
                }
            }
            return false;
        };

        String[] result = Arrays.stream(words).filter(hasCharacterDuplication.negate()).toArray(String[]::new);
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(result));
    }
}
