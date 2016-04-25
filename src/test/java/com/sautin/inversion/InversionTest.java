package com.sautin.inversion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * InversionTest Class
 * Provides tests for inverting array of any types
 */
public class InversionTest {

    private Inversion inversionTest;

    @Before
    public void setUp() {
        this.inversionTest = new Inversion();
    }

    @Test
    public void testIntInvert() {
        Integer[] original = {1, 2, 3};
        this.inversionTest.invert(original);
        assertArrayEquals(new Integer[] {3, 2, 1}, original);
    }

    @Test
    public void testStringInvert() {
        String[] original = {"AAA", "BBB", "CCC"};
        this.inversionTest.invert(original);
        assertArrayEquals(new String[] {"CCC", "BBB", "AAA"}, original);
    }

    @Test
    public void testDoubleInvert() {
        Double[] original = {1.2, 2.2, 3.456};
        this.inversionTest.invert(original);
        assertArrayEquals(new Double[] {3.456, 2.2, 1.2}, original);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInvert() {
        this.inversionTest.invert(null);
        fail();
    }

    @Test
    public void testOneInvert() {
        Double[] original = {1.2};
        this.inversionTest.invert(original);
        assertArrayEquals(new Double[] {1.2}, original);
    }

}
