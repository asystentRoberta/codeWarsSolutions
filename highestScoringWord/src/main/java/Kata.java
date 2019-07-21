import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Kata {

    public static String high(String s) {

        Map<String, Integer> mapOfResults = new HashMap<>();

        String[] allWords = s.split(" ");
        for (String word : allWords) {
            final int resultOfWord = word.chars().map(c -> c - 'a').sum();
            mapOfResults.put(word, resultOfWord);
        }
        return Collections.max(mapOfResults.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
