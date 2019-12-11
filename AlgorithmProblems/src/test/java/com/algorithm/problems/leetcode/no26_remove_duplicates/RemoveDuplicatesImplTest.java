package com.algorithm.problems.leetcode.no26_remove_duplicates;

import junit.framework.TestCase;
import org.junit.Test;

public class RemoveDuplicatesImplTest extends TestCase {

    @Test
    public void testRemoveDuplicates() {
        int[] input  = {1, 1, 2};
        assertEquals(2, new RemoveDuplicatesImpl().removeDuplicates(input));
        int[] input1  = {1, 2};
        assertEquals(2, new RemoveDuplicatesImpl().removeDuplicates(input1));
        int[] input2  = {1, 1, 1, 1, 1, 1};
        assertEquals(1, new RemoveDuplicatesImpl().removeDuplicates(input2));
    }

    @Test
    public void testRemoveDuplicatesWithEmpty() {
        int[] input  = {};
        assertEquals(0, new RemoveDuplicatesImpl().removeDuplicates(input));
    }
}
