import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        StringBuilder binaryAsString = new StringBuilder();

        for (Integer integer : binary) {
            binaryAsString.append(integer);
        }

        return Integer.parseInt(binaryAsString.toString(), 2);
    }
}
