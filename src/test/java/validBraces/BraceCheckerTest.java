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

    @Test
    public void squareBrackets() {

        assertFalse(checker.isValid("(({)[]"));
    }

    @Test
    public void curlyBrackets() {

        assertFalse(checker.isValid("[(]())"));
    }

    @Test
    public void parentheses() {

        assertFalse(checker.isValid("[(]{})"));
    }

    @Test
    public void moreTestsFromCodeWars(){
        assertTrue(checker.isValid("(){}[]"));
        assertTrue(checker.isValid("([{}])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("[({})](]"));

    }


}