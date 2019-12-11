package com.algorithm.problems.leetcode.no27_remove_element;

import junit.framework.TestCase;
import org.junit.Test;

public class RemoveElementTest extends TestCase {
    @Test
    public void testRemoveElement() {
        int[] input  = {1, 1, 1, 2, 2, 3};
        RemoveElement rm = new RemoveElement();
        assertEquals(3, rm.removeElement(input, 1));
    }

    public void testRemoveElementWithEmpyt() {
        int[] input  = {};
        RemoveElement rm = new RemoveElement();
        assertEquals(0, rm.removeElement(input, 1));
    }
}