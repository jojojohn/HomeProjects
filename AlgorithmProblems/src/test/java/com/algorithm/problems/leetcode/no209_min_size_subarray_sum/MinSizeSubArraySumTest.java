package com.algorithm.problems.leetcode.no209_min_size_subarray_sum;

import junit.framework.TestCase;
import org.junit.Test;

public class MinSizeSubArraySumTest extends TestCase {

    @Test
    public void testMinSubArrayLen() {
        int[] input = {2, 3, 1, 2, 4, 3};
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        assertEquals(minSizeSubArraySum.minSubArrayLen(7, input), 2);
    }
}