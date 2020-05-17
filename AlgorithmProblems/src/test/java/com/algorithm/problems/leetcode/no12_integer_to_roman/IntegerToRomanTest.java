package com.algorithm.problems.leetcode.no12_integer_to_roman;

import junit.framework.TestCase;

public class IntegerToRomanTest extends TestCase {

    public void testInToRoman() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        assertEquals("III", integerToRoman.inToRoman(3));
        assertEquals("IV", integerToRoman.inToRoman(4));
        assertEquals("V", integerToRoman.inToRoman(5));
        assertEquals("IX", integerToRoman.inToRoman(9));
        assertEquals("LVIII", integerToRoman.inToRoman(58));
        assertEquals("MCMXCIV", integerToRoman.inToRoman(1994));
        assertEquals("MMMMLXXII", integerToRoman.inToRoman(4072));
    }
}