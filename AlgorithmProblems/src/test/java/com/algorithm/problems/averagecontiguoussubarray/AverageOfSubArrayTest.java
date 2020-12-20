package com.algorithm.problems.averagecontiguoussubarray;

import junit.framework.TestCase;

public class AverageOfSubArrayTest extends TestCase {

    public void testFindSubArrayAverage() {
        int[] elements = {1, -1, 3, 4, 5, -2, 6, 8, 9, 12};
        AverageOfSubArray averageOfSubArray = new AverageOfSubArray();
        double[] result = {2.4, 1.8, 3.2,4.2,5.2,6.6};
        assertEquals(result[0], averageOfSubArray.findSubArrayAverage(elements, 5)[0]);
        assertEquals(result[3], averageOfSubArray.findSubArrayAverage(elements, 5)[3]);
        assertEquals(result[4], averageOfSubArray.findSubArrayAverage(elements, 5)[4]);
        assertEquals(result[1], averageOfSubArray.findSubArrayAverage(elements, 5)[1]);
        assertEquals(result[2], averageOfSubArray.findSubArrayAverage(elements, 5)[2]);
    }
}