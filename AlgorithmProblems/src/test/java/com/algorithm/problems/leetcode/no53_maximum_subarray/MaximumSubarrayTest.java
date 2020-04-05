package com.algorithm.problems.leetcode.no53_maximum_subarray;

import junit.framework.TestCase;

public class MaximumSubarrayTest extends TestCase {

    public void testMaxSubArray() {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(6, maximumSubarray.maxSubArray(input));
    }
}