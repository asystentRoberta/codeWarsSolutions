package sumOfDigitsDigitsRoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootTest {

    private DigitRoot digitRoot = new DRoot();

    @Test
    public void Tests() {

        assertEquals("Nope!", 7, digitRoot.digital_root(16));
        assertEquals("Nope!", 6, digitRoot.digital_root(456));
    }
}