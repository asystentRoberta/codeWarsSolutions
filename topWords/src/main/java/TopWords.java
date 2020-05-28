import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String stringToTest) {

        List<String> stringToAnalize = prepareString(stringToTest);

        Map<String, Integer> wordsMap = new HashMap<>();
        Map<Integer, String> wordsMapSorted = new TreeMap<>(Collections.reverseOrder());
        int frequencyCounter;

        for (String word : stringToAnalize) {
            frequencyCounter = Collections.frequency(stringToAnalize, word);
            wordsMap.put(word, frequencyCounter);
        }

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            wordsMapSorted.put(entry.getValue(), entry.getKey());
        }

        return wordsMapSorted
                .values()
                .stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    private static List<String> prepareString(String stringToTest) {

        String basicTranspose = stringToTest
                .toLowerCase()
                .replaceAll("[^a-zA-Z' ]", "");

        List<String> listOfWords = Arrays.asList(basicTranspose.split(" "));

        return listOfWords.stream()
                .filter(word -> word.matches("'?\\w+([-']\\w+)*'?"))
                .collect(Collectors.toList());
    }
}
