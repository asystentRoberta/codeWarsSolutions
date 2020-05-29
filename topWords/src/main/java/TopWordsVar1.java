import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class TopWordsVar1 {

    final static private Pattern PATTERN = Pattern.compile("[a-z][a-z']*");

    public static List<String> top3(String s) {

        Map<String, Integer> cnt = new HashMap<>();
        Matcher matcher = PATTERN.matcher(s.toLowerCase());
        while (matcher.find()) {
            cnt.put(matcher.group(), cnt.getOrDefault(matcher.group(), 0) + 1);
        }
        return cnt.entrySet()
                .stream()
                .sorted(TopWordsVar1::compare)
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    private static int compare(Map.Entry<String, Integer> stringIntegerEntry,
            Map.Entry<String, Integer> stringIntegerEntry1) {

        int u = stringIntegerEntry.getValue(), v = stringIntegerEntry1.getValue();
        return Integer.compare(u, v);
    }
}
