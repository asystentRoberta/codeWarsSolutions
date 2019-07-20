import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        StringBuilder binaryAsString = new StringBuilder();

        for (Integer integer : binary) {
            binaryAsString.append(integer);
        }

        return Integer.parseInt(binaryAsString.toString(), 2);
    }

    public static int ConvertBinaryArrayToIntUsingStream(List<Integer> binary) {

        return binary.stream()
                .reduce((x, y) -> x * 2 + y)
                .get();
    }

    public static int ConvertBinaryArrayToIntUsingStreamOneMore(List<Integer> binary) {

        String string = Arrays.toString(binary.toArray()).replaceAll("\\D", "");
        return Integer.parseInt(string, 2);
    }
}
