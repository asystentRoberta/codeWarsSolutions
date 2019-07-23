import java.util.Arrays;

public class Persist {

    public static int persistence(long n) {

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

    public static int persistenceWeirdAndHard(long n) {

        long m = 1, r = n;

        if (r / 10 == 0) {
            return 0;
        }

        for (r = n; r != 0; r /= 10) {
            m *= r % 10;
        }

        return persistenceWeirdAndHard(m) + 1;
    }

    public static int persistenceWeirdAndHardSimmilaOne(long n) {

        //accumulator pattern; pass to a helper that can perform tail recursion
        return persistenceWeirdAndHardSimmilaOne(n, 0);
    }

    private static int persistenceWeirdAndHardSimmilaOne(long n, int times) {

        if (n < 10) {
            return times; //base case
        }
        times++;

        //get each digit; multiply with product
        long product = 1;
        while (n > 0) {
            int digit = (int) n % 10;
            product *= digit;
            n /= 10;
        }
        //recourse on product
        return persistenceWeirdAndHardSimmilaOne(product, times);
    }

    public static int persistenceRecursiveAgain(long n) {

        if (n < 10) {
            return 0;
        }

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);
        return persistenceRecursiveAgain(newN) + 1;
    }

    public static int persisyenceClasicalModel(long n) {

        int count = 1;
        if (n < 9) {
            return 0;
        }
        while (needsMorePersistence(n) > 9) {
            n = needsMorePersistence(n);
            count++;
        }
        return count;
    }

    private static long needsMorePersistence(long n) {

        String p = Long.toString(n);
        long value = 1;
        for (int i = 0; i < p.length(); i++) {
            value = value * Long.parseLong(p.substring(i, i + 1));
        }
        return value;
    }
}
