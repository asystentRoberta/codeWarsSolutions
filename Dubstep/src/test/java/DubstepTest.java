import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DubstepTest {

    @Test
    public void Test1() {

        assertEquals("ABC", Dubstep.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {

        assertEquals("R L", Dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }
}