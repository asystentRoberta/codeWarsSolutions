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
    
    @Test
    public void testBalancedNumWithQoutaForShortNumber(){
        assertEquals("Balanced", BalancedNumber.balancedNumWithQuota(7));
        assertEquals("Balanced", BalancedNumber.balancedNumWithQuota(959));
        assertEquals("Balanced", BalancedNumber.balancedNumWithQuota(13));
        assertEquals("Not Balanced", BalancedNumber.balancedNumWithQuota(432));
        assertEquals("Balanced", BalancedNumber.balancedNumWithQuota(424)); 
    }
    
    @Test
    public void testBalanedNumWithQuotaForLargerNumber(){

        assertEquals("Not Balanced", BalancedNumber.balancedNumWithQuota(1024));
        assertEquals("Not Balanced", BalancedNumber.balancedNumWithQuota(66545));
        assertEquals("Not Balanced", BalancedNumber.balancedNumWithQuota(295591));
        assertEquals("Not Balanced", BalancedNumber.balancedNumWithQuota(1230987));
        assertEquals("Balanced", BalancedNumber.balancedNumWithQuota(56239814));
        
    }

    @Test
    public void testBalancedNumCleverOneForShortNumber(){
        assertEquals("Balanced", BalancedNumber.balancedNumCleverOne(7));
        assertEquals("Balanced", BalancedNumber.balancedNumCleverOne(959));
        assertEquals("Balanced", BalancedNumber.balancedNumCleverOne(13));
        assertEquals("Not Balanced", BalancedNumber.balancedNumCleverOne(432));
        assertEquals("Balanced", BalancedNumber.balancedNumCleverOne(424));
    }

    @Test
    public void testBalanedNumCleverOneForLargerNumber(){

        assertEquals("Not Balanced", BalancedNumber.balancedNumCleverOne(1024));
        assertEquals("Not Balanced", BalancedNumber.balancedNumCleverOne(66545));
        assertEquals("Not Balanced", BalancedNumber.balancedNumCleverOne(295591));
        assertEquals("Not Balanced", BalancedNumber.balancedNumCleverOne(1230987));
        assertEquals("Balanced", BalancedNumber.balancedNumCleverOne(56239814));

    }
}