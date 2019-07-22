import java.util.Arrays;
import java.util.List;

public class BalancedNumber {

    public static String balancedNum(long number) {

        List<String> listOfDigits = Arrays.asList(String.valueOf(number).split(""));
        if (listOfDigits.size() == 1 || listOfDigits.size() == 2) {
            return "Balanced";
        }

        if (listOfDigits.size() % 2 != 0) {
            final int sumOfLeftDigits = listOfDigits.subList(0, listOfDigits.size() / 2).stream()
                    .mapToInt(Integer::valueOf)
                    .sum();
            final int sumOfRightDigits =
                    listOfDigits.subList((listOfDigits.size() / 2) + 1, listOfDigits.size()).stream()
                            .mapToInt(Integer::valueOf)
                            .sum();
            if (sumOfLeftDigits == sumOfRightDigits) {
                return "Balanced";
            } else {
                return "Not Balanced";
            }
        }
        final int sumOfLeftDigits = listOfDigits.subList(0, (listOfDigits.size() / 2) - 1).stream()
                .mapToInt(Integer::valueOf)
                .sum();

        final int sumOfRightDigits = listOfDigits.subList((listOfDigits.size() / 2) + 1, listOfDigits.size()).stream()
                .mapToInt(Integer::valueOf)
                .sum();

        if (sumOfLeftDigits == sumOfRightDigits) {
            return "Balanced";
        }

        return "Not Balanced";
    }
}
