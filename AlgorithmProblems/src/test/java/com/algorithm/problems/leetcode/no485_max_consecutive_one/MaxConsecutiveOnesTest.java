package com.algorithm.problems.leetcode.no485_max_consecutive_one;

import junit.framework.TestCase;

public class MaxConsecutiveOnesTest extends TestCase {

    public void testFindMaxConsecutiveOnes() {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnes(input));
    }
}