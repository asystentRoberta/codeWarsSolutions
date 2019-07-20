import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void sampleTests() {

        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }
}