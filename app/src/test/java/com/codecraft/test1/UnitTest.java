package com.codecraft.test1;

import org.junit.Test;

import static org.junit.Assert.*;


public class UnitTest {
    @Test
    public void testOccurrenceMethodWithLowerCaseString() {
        assertFalse(MainActivity.checkOccurrence("awerty"));

    }
    @Test
    public void testOccurrenceMethodWithUpperCaseString() {
        assertTrue(MainActivity.checkOccurrence("Awerty"));

    }
    @Test
    public void testOccurrenceMethodWithSpecialCharacterString() {
        assertFalse(MainActivity.checkOccurrence("@werty"));

    }
    @Test
    public void testOccurrenceMethodWithNumber() {
        assertFalse(MainActivity.checkOccurrence("1werty"));

    }

    @Test
    public void testOccurrenceMethodWithSpace() {
        assertFalse(MainActivity.checkOccurrence(" werty"));

    }
    @Test
    public void testOccurrenceMethodWithNull() {
        assertFalse(MainActivity.checkOccurrence(""));

    }

}