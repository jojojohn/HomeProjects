package com.algorithm.problems.leetcode.no202_happy_number;

import junit.framework.TestCase;

public class HappyNumberTest extends TestCase {

    public void testIsHappy() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(2));
    }
}