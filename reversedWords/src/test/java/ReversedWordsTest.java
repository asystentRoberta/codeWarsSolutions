import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedWordsTest {

    @Test
    public void testSomething() {

        assertEquals("eating like I", ReversedWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReversedWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReversedWords.reverseWords("The world is nice"));
    }
}