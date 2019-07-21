import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Kata {

    private static int VALUE_LETTER_RANGE = 96;

    public static String high(String s) {

        if (s.isEmpty()) {
            return "";
        }

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

    public static String highWithStream(String s) {

        return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(Kata::calculateWordScore).reversed())
                .findFirst()
                .get();
    }

    private static int calculateWordScore(String word) {

        return word.chars().map(c -> c - (int) 'a' + 1).sum();
    }

    public static String highCleverOne(String s){
        return Pattern.compile(" ")
                .splitAsStream(s)
                .max(Comparator.comparingInt((i->i.chars().map(c->c-'a'+1).sum())))
                .orElse("");
    }
}
