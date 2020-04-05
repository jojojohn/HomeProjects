package com.algorithm.problems.leetcode.no136_single_number;

import junit.framework.TestCase;

public class SingleNumberTest extends TestCase {


    public void testFindSingleNumber() {
        int[] nums = {1, 2, 3, 4, 2, 3, 1, 4, 5};
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(5, singleNumber.findSingleNumber(nums));

        int[] nums_1 = {1, 2, 3, 4, 2, 3, 1, 4};
        assertEquals(0, singleNumber.findSingleNumber(nums_1));
    }
}