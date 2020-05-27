import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String stringToTest) {

        List<String> wordToReturn = new ArrayList<>();
        if (stringToTest.isEmpty()) {
            return wordToReturn;
        }
        String cleanedString = stringToTest.replaceAll("[^\\x00-\\x7F]", "");
        List<String> listOfWords = Arrays.asList(cleanedString.split(" "));
        final List<String> collectedWords =
                listOfWords.stream().filter(word -> !word.isEmpty()).collect(Collectors.toList());
        int frequency = 0;
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : collectedWords) {
            frequency = Collections.frequency(listOfWords, word);
            wordMap.put(word, frequency);
        }

        final Map<String, Integer> sortedWords = wordMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        sortedWords.entrySet().stream().forEach(System.out::println);

        int i = 0;
        for (Map.Entry<String, Integer> words : sortedWords.entrySet()) {

            if (i < 3) {
                wordToReturn.add(words.getKey());
                i++;
            }
        }

        return wordToReturn;
    }
}
