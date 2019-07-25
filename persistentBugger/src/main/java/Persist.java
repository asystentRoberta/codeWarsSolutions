public class Persist {

    public static int persistence(long n) {

        int resultToReturn = 0;
        String digitsOfNumber = String.valueOf(n);

        while (Long.valueOf(digitsOfNumber) > 9) {

            digitsOfNumber = String.valueOf(
                    digitsOfNumber.chars()
                            .map(Character::getNumericValue)
                            .reduce(1, (a, b) -> a * b));
            resultToReturn++;
        }
        return resultToReturn;
    }
}
