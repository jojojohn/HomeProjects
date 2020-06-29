package com.algorithm.problems.leetcode.no986_interval_intersections;

import junit.framework.TestCase;

public class IntervalListIntersectionsTest extends TestCase {

    public void testIntervalInterSection() {
        int[][] A = {{0, 2},{5, 10},{13, 23},{24, 25}};
        int[][] B = {{1, 5},{8, 12},{15, 24},{25, 26}};
        int[][] result = {{1, 2},{5, 5}, {8, 10},{15, 23},{24, 24}, {25, 25}};
        IntervalListIntersections intervalListIntersections = new IntervalListIntersections();
        int[][] actual = intervalListIntersections.intervalInterSection(A, B);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i][0], actual[i][0]);
            assertEquals(result[i][1], actual[i][1]);
        }
    }
}