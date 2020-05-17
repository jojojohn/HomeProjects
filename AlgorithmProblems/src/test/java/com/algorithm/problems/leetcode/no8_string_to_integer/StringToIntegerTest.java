package com.algorithm.problems.leetcode.no8_string_to_integer;

import junit.framework.TestCase;

public class StringToIntegerTest extends TestCase {

    public void testMyAtoi() {
        StringToInteger stringToInteger = new StringToInteger();
        String s = "15";
        assertEquals(15, stringToInteger.myAtoi(s));
        s = "-1234";
        assertEquals(-1234, stringToInteger.myAtoi(s));
        s = "-123443096323257325726570923";
        assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
        s = "123443096323257325726570923";
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
        s ="abc";
        assertEquals(0, stringToInteger.myAtoi(s));
        s ="abc";
        assertEquals(0, stringToInteger.myAtoi(s));

    }
}