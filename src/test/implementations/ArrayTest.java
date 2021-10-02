package implementations;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void size() {
        Array test = new Array();
        test.add(1);
        assertEquals(1, test.size());
    }

    @Test
    public void isEmpty() {
        Array test = new Array();
        assertEquals(true, test.isEmpty());
    }

    @Test
    public void clear() {
        Array test = new Array();
        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(false, test.isEmpty());
        test.clear();
        assertEquals(true, test.isEmpty());
    }

    @Test
    public void add() {
        Array test = new Array();
        test.add(1);
        assertEquals(false, test.isEmpty());
        assertEquals(1, test.get(0));
    }

    @Test
    public void get() {
        Array test = new Array();
        test.add(1);
        assertEquals(1, test.get(0));
    }

    @Test
    public void set() {
        Array test = new Array();
        test.add(1);
        test.add(2);
        test.add(3);
        assertEquals(2, test.get(1));
        test.set(1, 3);
        assertEquals(3, test.get(1));
    }

    @Test
    public void remove() {
        Array test = new Array();
        test.add(1);
        assertEquals(false, test.isEmpty());
        test.remove(0);
        assertEquals(true, test.isEmpty());
    }

    @Test
    public void dynamicSizing() {
        Array test = new Array(2);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        assertEquals(false, test.isEmpty());
        assertEquals(2, test.get(1));
        assertEquals(4, test.get(3));
    }
}