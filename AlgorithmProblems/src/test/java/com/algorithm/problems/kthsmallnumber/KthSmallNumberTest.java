package com.algorithm.problems.kthsmallnumber;

import junit.framework.TestCase;

public class KthSmallNumberTest extends TestCase {

    public void testFindKthSmallestNumber() {
        KthSmallNumber kthSmallNumber =  new KthSmallNumber();
        int[] nums = {1, 5, 12, 2, 11, 5};
        int[] nums_1 = {5, 12, 11, -1, 12};
        assertEquals(5, kthSmallNumber.findKthSmallestNumber(nums, 3));
        assertEquals(5, kthSmallNumber.findKthSmallestNumber(nums, 4));
        assertEquals(11, kthSmallNumber.findKthSmallestNumber(nums_1, 3));
    }
}