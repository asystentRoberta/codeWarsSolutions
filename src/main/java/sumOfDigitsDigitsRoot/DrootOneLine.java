package sumOfDigitsDigitsRoot;

public class DrootOneLine implements DigitRoot {

    @Override public int digital_root(int n) {

        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}
