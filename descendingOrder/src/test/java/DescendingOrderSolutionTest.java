import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderSolutionTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrderSolution.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrderSolution.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrderSolution.sortDesc(123456789));
    }

    @Test
    public void test_04_fromWeb(){
        assertEquals(54421, DescendingOrderSolution.sortDesc(21445));
    }

}