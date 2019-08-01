package ArrayLeaders;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLeadersTest {

    @Test
    public void Check_Positive_Values()
    {
        assertEquals(Arrays.asList(4), ArrayLeaders.arrayLeaders(new int[]{1,2,3,4,0}));
        assertEquals(Arrays.asList(17,5,2), ArrayLeaders.arrayLeaders(new int[]{16,17,4,3,5,2}));
    }
    @Test
    public void Check_Negativee_Values()
    {
        assertEquals(Arrays.asList(-1), ArrayLeaders.arrayLeaders(new int[]{-1,-29,-26,-2}));
        assertEquals(Arrays.asList(-36,-12), ArrayLeaders.arrayLeaders(new int[]{-36,-12,-27}));
    }
    @Test
    public void Mixed_Values()
    {
        assertEquals(Arrays.asList(5,2), ArrayLeaders.arrayLeaders(new int[]{5,2}));
        assertEquals(Arrays.asList(0,-1,3,2), ArrayLeaders.arrayLeaders(new int[]{0,-1,-29,3,2}));
    }

}