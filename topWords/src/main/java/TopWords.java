import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class TopWords {

    public static List<String> top3(String stringToSolve) {

        List<String> stringToAnalise = prepareString(stringToSolve);

        return stringToAnalise.stream()
                .filter(e -> !e.isEmpty() && !e.isBlank() && !e.matches("[.,]+"))
                .collect(groupingBy(String::toLowerCase, counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    private static List<String> prepareString(String stringToSolve) {

        if (stringToSolve.matches("\\W+")) {
            return Collections.emptyList();
        }
        stringToSolve = stringToSolve.toLowerCase();
        return Arrays.asList(stringToSolve.split("[^a-zA-Z0-9']+"));
    }
}
