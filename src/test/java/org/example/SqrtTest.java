package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void testAverage1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.average(2, 4), 3);
    }

    @Test
    void testAverage2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.average(1, 4), 2.5);
    }

    @Test
    void testGood1() {
        var sqrt = new Sqrt(1);
        assertFalse(sqrt.good(1, 0));
    }

    @Test
    void testGood2() {
        var sqrt = new Sqrt(1);
        assertTrue(sqrt.good(0, 0));
    }

    @Test
    void testGood3() {
        var sqrt = new Sqrt(1);
        assertTrue(sqrt.good(4, 16));
    }

    @Test
    void testImprove1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.improve(1, 2), 1.5);
    }

    @Test
    void testImprove2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.improve(2, 4), 2);
    }

    @Test
    void iter1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.iter(1, 1), 1);
    }

    @Test
    void iter2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.iter(1, 9), 3, sqrt.delta);
    }

    @Test
    void calc1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.calc(), 1, sqrt.delta);
    }
    @Test
    void calc2() {
        var sqrt = new Sqrt(9);
        assertEquals(sqrt.calc(), 3, sqrt.delta);
    }
    @Test
    void calc3() {
        var sqrt = new Sqrt(16);
        assertEquals(sqrt.calc(), 4, sqrt.delta);
    }
    @Test
    void calc4() {
        var sqrt = new Sqrt(2);
        assertEquals(sqrt.calc(), Math.sqrt(2), sqrt.delta);
    }
}