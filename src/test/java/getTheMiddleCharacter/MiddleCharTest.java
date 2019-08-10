package getTheMiddleCharacter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleCharTest {

    @Test
    public void evenTests() {
        assertEquals("es", MiddleChar.getMiddle("test"));
        assertEquals("dd", MiddleChar.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleChar.getMiddle("testing"));
        assertEquals("A", MiddleChar.getMiddle("A"));
    }


}