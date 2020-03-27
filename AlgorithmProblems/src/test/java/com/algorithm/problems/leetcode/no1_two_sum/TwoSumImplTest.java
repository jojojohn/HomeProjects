package com.algorithm.problems.leetcode.no1_two_sum;

import junit.framework.TestCase;

public class TwoSumImplTest extends TestCase {

    int[] nums = {1, 4, 6, 13, 8, 3};
    public void testTwoSum() {
        TwoSumImpl twoSumImpl = new TwoSumImpl();
        assertEquals(twoSumImpl.twoSum(nums, 11)[0], 4);
        assertEquals(twoSumImpl.twoSum(nums, 11)[1], 5);
    }
}