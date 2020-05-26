package com.algorithm.problems.leetcode.no1295_numbers_even_digits;

import junit.framework.TestCase;

public class NumberWithEvenDigitsTest extends TestCase {

    public void testFindNumbers() {
        int[] num = {12,345,2,6,7896};
        NumberWithEvenDigits numberWithEvenDigits = new NumberWithEvenDigits();
        assertEquals(2, numberWithEvenDigits.findNumbers(num));
    }
}