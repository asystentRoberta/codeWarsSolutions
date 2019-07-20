import java.util.Arrays;
import java.util.Collections;

public class ReversedWords {

    public static String reverseWords(String str) {

        final String[] allWords = str.split(" ");
        Collections.reverse(Arrays.asList(allWords));

        return String.join(" ", Arrays.asList(allWords));
    }
}
