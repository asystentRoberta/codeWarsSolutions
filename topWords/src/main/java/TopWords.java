import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class TopWords {

    public static List<String> top3(String stringToTest) {

        List<String> stringToAnalize = prepareString(stringToTest);

        return stringToAnalize.stream()
                .filter(e -> !e.isEmpty() && !e.isBlank() && !e.matches("[.,]+"))
                .collect(groupingBy(String::toLowerCase, counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    private static List<String> prepareString(String stringToTest) {

        if (stringToTest.matches("\\W+")) {
            return Collections.emptyList();
        }
        stringToTest = stringToTest.toLowerCase();
        return Arrays.asList(stringToTest.split("[^a-zA-Z0-9']+"));
    }
}
