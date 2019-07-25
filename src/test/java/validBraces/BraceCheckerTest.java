package validBraces;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {

        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testInvalid() {

        assertFalse(checker.isValid("[(])"));
    }
}