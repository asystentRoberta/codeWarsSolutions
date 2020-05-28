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

        stringToTest =
                stringToTest.trim().toLowerCase().replaceAll("((?<=\\w)\\W+(?!\\w)|(?<!\\w)\\W+(?=\\w)|(?<!\\w)\\W+"
                        + "(?!\\w))", " ")
                        .replaceAll("^\\s+", "")
                        .replaceAll("/\\s+/g", "")
                        .replaceAll("[\n\t]", " ");

        final List<String> listToReturn = Arrays.asList(stringToTest.split(" +"));

        return listToReturn.stream()
                .filter(word -> word.length() > 0)
                .collect(Collectors.toList());
    }
}
