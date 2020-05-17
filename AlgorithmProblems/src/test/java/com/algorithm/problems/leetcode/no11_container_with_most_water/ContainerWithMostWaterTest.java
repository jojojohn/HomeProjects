package com.algorithm.problems.leetcode.no11_container_with_most_water;

import junit.framework.TestCase;

public class ContainerWithMostWaterTest extends TestCase {

    public void testMaxArea() {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(49, containerWithMostWater.maxArea(heights));
    }
}