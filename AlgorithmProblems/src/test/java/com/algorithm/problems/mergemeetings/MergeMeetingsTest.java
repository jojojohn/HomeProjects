package com.algorithm.problems.mergemeetings;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MergeMeetingsTest extends TestCase {

    @Test
    public void testMergeIntervals() {
        int[][] input = {{1, 3}, {5, 6}, {2, 8}, {9, 10}};
        int[][] res = {{1, 8}, {9, 10}};
        List<Integer> interval = new ArrayList<>();
        List<List<Integer>> intervals = new ArrayList<>();
        interval.add(1);
        interval.add(8);
        intervals.add(interval);
        interval = new ArrayList<>();
        interval.add(9);
        interval.add(10);
        intervals.add(interval);
        Assert.assertEquals(intervals, new MergeMeetings().mergeIntervals(input));
    }
}
