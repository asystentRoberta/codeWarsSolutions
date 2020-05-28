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
        int frequency = 0;

        for (String word : stringToAnalize) {
            frequency = Collections.frequency(stringToAnalize, word);
            wordsMap.put(word, frequency);
        }

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            wordsMapSorted.put(entry.getValue(), entry.getKey());
        }
        final List<String> listOfWordsToReturn = wordsMapSorted.values().stream().limit(3).collect(Collectors.toList());

        return listOfWordsToReturn;
    }

    private static List<String> prepareString(String stringToTest) {

        String removeSpecialCharacters = stringToTest.replaceAll("[^\\x00-\\x7F]", "");
        String allCharactersToLowCase = removeSpecialCharacters.toLowerCase();
        String removeDotsAndComas = allCharactersToLowCase.replaceAll("\\.", "").replaceAll(",", "");
        String removeNewLines = removeDotsAndComas.replaceAll("\n", "");
        String removeBackslash = removeNewLines.replaceAll("//", "");

        List<String> listOfWords = Arrays.asList(removeBackslash.split(" "));
        final List<String> cleanedList = listOfWords.stream()
                .filter(word -> !word.isBlank())
                .filter(word -> word.matches("'?\\w+([-']\\w+)*'?"))
                .collect(Collectors.toList());
        return cleanedList;
    }
}