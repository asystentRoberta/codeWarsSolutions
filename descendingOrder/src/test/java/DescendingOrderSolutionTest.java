import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescendingOrderSolutionTest {

    @Test
    public void test_01() {

        assertEquals(987654321, DescendingOrderSolution.sortDescShortOne(123456789));
    }

    @Test
    public void test_02() {

        assertEquals(987654321, DescendingOrderSolution.sortDescWithStream(123456789));
    }

    @Test
    public void test_03() {

        assertEquals(987654321, DescendingOrderSolution.sortDescWithStreamAnotherOne(123456789));
    }

    @Test
    public void test_04_fromWeb() {

        assertEquals(987654321, DescendingOrderSolution.sortDesc(123456789));
    }
}