package com.algorithm.problems.medianofarrays;

import junit.framework.TestCase;
import org.junit.Test;

public class MedianArraysTest extends TestCase {

    @Test
    public void testMedian() {
        MedianArrays medianArrays = new MedianArrays();
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};
        assertEquals(medianArrays.Median(array1, array2), 3.5);
    }

    @Test
    public void testMedianAgain() {
        MedianArrays medianArrays = new MedianArrays();
        int[] array1 = {1,3,4,5,6};
        int[] array2 = {2,4,6,7,8};
        assertEquals(medianArrays.Median(array1, array2), 4.5);
    }

    @Test
    public void testMedian2() {
        MedianArrays medianArrays = new MedianArrays();
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};
        assertEquals(medianArrays.Median2(array1, array2), 3.5);
    }

    @Test
    public void testMedian2Again() {
        MedianArrays medianArrays = new MedianArrays();
        int[] array1 = {1,3,4,5,6};
        int[] array2 = {2,4,6,7,8};
        assertEquals(medianArrays.Median2(array1, array2), 4.5);
    }
}