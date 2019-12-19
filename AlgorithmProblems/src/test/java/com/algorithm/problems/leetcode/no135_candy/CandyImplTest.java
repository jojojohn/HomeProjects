package com.algorithm.problems.leetcode.no135_candy;

import junit.framework.TestCase;

public class CandyImplTest extends TestCase {

    public void testCandy() {
        int[] input = {1, 2, 2};
        CandyImpl candy = new CandyImpl();
        assertEquals(4, candy.candy(input));
    }
}