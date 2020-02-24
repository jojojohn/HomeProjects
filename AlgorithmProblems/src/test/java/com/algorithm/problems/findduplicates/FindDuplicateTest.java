package com.algorithm.problems.findduplicates;

import junit.framework.TestCase;
import org.junit.Test;

public class FindDuplicateTest extends TestCase {

    @Test
    public void testGetDuplicates() {
        FindDuplicate findDuplicate = new FindDuplicate();
        int[] input = {1, 2, 3, 2, 4, 2, 3};
        assertEquals(findDuplicate.getDuplicates(input).size(), 2);
    }
}