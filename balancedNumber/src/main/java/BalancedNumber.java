import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class BalancedNumber {

    public static String balancedNum(long number) {

        List<String> listOfDigits = Arrays.asList(String.valueOf(number).split(""));
        if (listOfDigits.size() == 1 || listOfDigits.size() == 2) {
            return "Balanced";
        }
        int middleOfNumber = (int) (Math.ceil(listOfDigits.size() / 2.0)) - 1;

        final int sumOfLeftDigits = listOfDigits.subList(0, middleOfNumber).stream()
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

    //Some long solution

    private final String str;

    private BalancedNumber(final long number) {

        this.str = String.valueOf(number);
    }

    public static String balancedNumWithQuota(final long number) {

        return new BalancedNumber(number).compute();
    }

    private String compute() {

        return (isSmall() || leftSum() == rightSum()) ? "Balanced" : "Not Balanced";
    }

    private int rightSum() {

        return str.chars().skip(str.length() / 2 + 1).map(toDigit).sum();
    }

    private int leftSum() {

        return str.chars().limit((str.length() - 1) / 2).map(toDigit).sum();
    }

    private boolean isSmall() {

        return str.length() < 3;
    }

    private static final IntUnaryOperator toDigit = c -> Character.digit(c, 10);

    //End of long solution

    public static String balancedNumCleverOne(long number){
        String  str = String.valueOf(number);
        int l = str.substring(0, str.length()/2 - str.length()%2 == 0 ? 1:0).chars().sum();
        int r = str.substring(str.length()/2+1).chars().sum();
        return (l==r ? "" : "Not ") + "Balanced";
    }
}

