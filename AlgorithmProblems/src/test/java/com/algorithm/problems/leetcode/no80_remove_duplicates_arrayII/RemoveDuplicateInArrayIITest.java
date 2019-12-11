package com.algorithm.problems.leetcode.no80_remove_duplicates_arrayII;

import com.algorithm.problems.leetcode.no26_remove_duplicates.RemoveDuplicatesImpl;
import junit.framework.TestCase;
import org.junit.Test;

public class RemoveDuplicateInArrayIITest extends TestCase {

    @Test
    public void testRemoveDuplicates() {
        int[] input  = {1, 1, 1, 2, 2, 3};
        assertEquals(5, new RemoveDuplicateInArrayII().removeDuplicates(input));
        int[] input1  = {1, 2};
        assertEquals(2, new RemoveDuplicateInArrayII().removeDuplicates(input1));
        int[] input2  = {1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3};
        assertEquals(6, new RemoveDuplicateInArrayII().removeDuplicates(input2));
    }

    @Test
    public void testRemoveDuplicatesWithEmpty() {
        int[] input  = {1,1};
        assertEquals(2, new RemoveDuplicateInArrayII().removeDuplicates(input));
        int[] input1  = {};
        assertEquals(0, new RemoveDuplicateInArrayII().removeDuplicates(input1));
    }
}
