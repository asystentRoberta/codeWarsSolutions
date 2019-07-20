import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static int VALUE_LETTER_RANGE = 96;

    public static String high(String s) {

        Map<String, Integer> mapOfResults = new HashMap<>();

        String[] allWords = s.split(" ");
        for (String word : allWords) {

            final String[] letters = word.split("");
            int result = 0;
            for (String letter : letters) {
                final char c = letter.charAt(0);
                result += (c - VALUE_LETTER_RANGE);
            }
            mapOfResults.put(word, result);
        }

        return Collections.max(mapOfResults.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
