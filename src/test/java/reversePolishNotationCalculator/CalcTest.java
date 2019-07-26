package reversePolishNotationCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void shouldWorkWithEmptyString() {

        assertEquals("Should work with empty string", 0, calc.evaluate(""), 0);
    }

    @Test
    public void shouldParseNumbers() {

        assertEquals("Should parse numbers", 3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloatNumbers() {

        assertEquals("Should parse float numbers", 3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {

        assertEquals("Should support addition", 4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {

        assertEquals("Should support multiplication", 3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubstraction() {

        assertEquals("Should support substraction", -2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {

        assertEquals("Should support division", 2, calc.evaluate("4 2 /"), 0);
    }
}