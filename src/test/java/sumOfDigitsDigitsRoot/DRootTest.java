package sumOfDigitsDigitsRoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootTest {

    private DigitRoot digitRoot = new DrootOneLine();

    @Test
    public void Tests() {

        assertEquals("Nope!", 7, digitRoot.digital_root(16));
        assertEquals("Nope!", 6, digitRoot.digital_root(456));
    }

    @Test
    public void testForZero(){
        assertEquals("Nop", 0, digitRoot.digital_root(0));
    }

    @Test
    public void testForOne(){
        assertEquals("Nop", 1, digitRoot.digital_root(1));
    }

    @Test
    public void testForTen(){
        assertEquals("Nop", 1, digitRoot.digital_root(10));
    }
}