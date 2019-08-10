package getTheMiddleCharacter;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", MiddleCharacter.getMiddle("test"));
        assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
        assertEquals("A", MiddleCharacter.getMiddle("A"));
    }

}