import java.util.ArrayList;
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
}
