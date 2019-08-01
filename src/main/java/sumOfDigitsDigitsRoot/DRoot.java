package sumOfDigitsDigitsRoot;

public class DRoot implements DigitRoot {

    public int digital_root(int n) {

        int sumOfNumbers = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        if(sumOfNumbers>9) sumOfNumbers = digital_root(sumOfNumbers);
        return sumOfNumbers;
    }
}
