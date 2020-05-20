package com.algorithm.problems.leetcode.no152_maximum_product_subarray;

import junit.framework.TestCase;

public class MaximumProductSubArrayTest extends TestCase {

    public void testMaxProduct() {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        int[] nums = {2,3,-2,4};
        assertEquals(6, maximumProductSubArray.maxProduct(nums));
    }
}