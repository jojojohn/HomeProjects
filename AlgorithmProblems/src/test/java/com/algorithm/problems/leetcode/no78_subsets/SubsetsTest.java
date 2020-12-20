package com.algorithm.problems.leetcode.no78_subsets;

import junit.framework.TestCase;

public class SubsetsTest extends TestCase {

    public void testSubsets() {
        Subsets subsets = new Subsets();
        int[] nums = {1, 2, 3};
        assertTrue(subsets.subsets(nums).size() == 8);
    }
}