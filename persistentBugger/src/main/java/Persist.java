public class Persist {

    public static int persistence(long n) {

        if (n < 9) {
            return 0;
        }

        int resultToReturn = 0;
        String digitsOfNumber = String.valueOf(n);
        while (digitsOfNumber.length() != 1) {

            final long newNumber = digitsOfNumber.chars()
                    .map(Character::getNumericValue)
                    .reduce(1, (a, b) -> a * b);
            resultToReturn++;
            digitsOfNumber = String.valueOf(newNumber);
        }
        return resultToReturn;
    }
}
