package sumOfDigitsDigitsRoot;

public class DRoot implements DigitRoot {

    public int digital_root(int n) {

        int sumOfNumbers = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        return sumOfNumbers<10 ? sumOfNumbers : digital_root(sumOfNumbers);
    }
}
