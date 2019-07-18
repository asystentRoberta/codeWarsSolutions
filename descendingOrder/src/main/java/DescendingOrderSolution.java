import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderSolution {

    public static int sortDesc(final int num) {

        String numInStringFormat = Integer.valueOf(num).toString();
        int numberOfDigits = numInStringFormat.length();

        List<Integer> listOfDigits = new ArrayList<>();

        for (int i = 0; i < numberOfDigits; i++) {
            int maxFromNumAsInt = numInStringFormat.chars()
                    .max()
                    .getAsInt();

            listOfDigits.add(Integer.valueOf(Character.toString((char) maxFromNumAsInt)));
            numInStringFormat = numInStringFormat
                    .replaceFirst(Integer.valueOf(Character.toString((char) maxFromNumAsInt)).toString(), "");
        }

        String joinedListOfDigits = listOfDigits.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(joinedListOfDigits);

        return Integer.valueOf(joinedListOfDigits);
    }
}
