import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalancedNumberTest {

    @Test
    public void checkBalancedNumber() {

        assertEquals("Balanced", BalancedNumber.balancedNum(7));
        assertEquals("Balanced", BalancedNumber.balancedNum(959));
        assertEquals("Balanced", BalancedNumber.balancedNum(13));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(432));
        assertEquals("Balanced", BalancedNumber.balancedNum(424));
    }

    @Test
    public void checkLargerBalancedNumbers() {

        assertEquals("Not Balanced", BalancedNumber.balancedNum(1024));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(66545));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(295591));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(1230987));
        assertEquals("Balanced", BalancedNumber.balancedNum(56239814));
    }
}