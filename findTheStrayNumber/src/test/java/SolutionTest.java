import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void simpleArray1() {
        assertEquals(3, getActualFor(3, 17, 17, 17, 17, 17, 17, 17));
    }

    private int getActualFor(int... numbers) {
        return Solution.stray(numbers);
    }

}