import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionFromWebTest {
    @Test
    public void simpleArray1() {
        assertEquals(3, getActualFor(17, 17, 3, 17,17));
    }

    private int getActualFor(int... numbers) {
        return SolutionFromWeb.secondStray(numbers);
    }
}