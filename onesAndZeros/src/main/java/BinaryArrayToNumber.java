import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String binaryAsString = "";

        for (Integer integer : binary) {
            binaryAsString += String.valueOf(integer);
        }

        return Integer.parseInt(binaryAsString, 2);
    }
}
