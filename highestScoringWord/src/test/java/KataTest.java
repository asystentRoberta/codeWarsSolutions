import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void sampleTests() {

        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.highWithStream("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.highCleverOne("take me to semynak"));
        assertEquals("xam", Kata.highWithStream("xam mam"));
        assertEquals("xam", Kata.highCleverOne("xam mam"));
    }

    @Test
    public void testWithEmptyString() {

        assertEquals("", Kata.high(""));
    }

    public void testHighWithStreamForEmptyString() {

        assertEquals("", Kata.highWithStream(""));
    }

    public void testCleverOneForEmptyString() {

        assertEquals("", Kata.highCleverOne(""));
    }
}