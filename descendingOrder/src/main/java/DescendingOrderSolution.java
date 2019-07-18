import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderSolution {

    public static int sortDesc(final int num) {

        String numInStringFormat = Integer.valueOf(num).toString();
        final int numberOfDigits = numInStringFormat.length();
        List<Integer> listOfDigits = new ArrayList<>();

        for (int i = 0; i < numberOfDigits; i++) {
            Integer maxFromNumAsInt = Integer.valueOf(Character.toString((char)
                    numInStringFormat.chars()
                            .max()
                            .orElse((Integer.MAX_VALUE))));

            listOfDigits.add(maxFromNumAsInt);
            numInStringFormat = numInStringFormat.replaceFirst(maxFromNumAsInt.toString(), "");
        }

        return Integer.valueOf(
                listOfDigits.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining()));
    }

    public static int sortDescWithStream(final int num) {

        return Integer.parseInt(
                String.valueOf(num)
                        .chars()
                        .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining()));
    }

    public static int sortDescShortOne(final int num) {

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static int sortDescWithStreamAnotherOne(final int num) {

        return Integer.parseInt(
                Integer.toString(num).codePoints()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .reverse()
                        .toString());
    }
}
