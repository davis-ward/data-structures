package implementations;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringBuilderTest {

    @Test
    public void append() {
        StringBuilder test = new StringBuilder();
        test.append("hello");
        assertEquals("hello", test.toString());
    }

    @Test
    public void addChar() {
        StringBuilder test = new StringBuilder();
        test.addChar('c');
        assertEquals("c", test.toString());
    }

    @Test
    public void reachedCap() {
        StringBuilder test = new StringBuilder();
        test.reachedCap();
        assertEquals(20, test.getCap());
    }

    @Test
    public void testToString() {
        StringBuilder test = new StringBuilder();
        String[] s = {"this", "is", "my", "sentence"};
        assertEquals("thisismysentence",test.joinWords(s));
    }
}