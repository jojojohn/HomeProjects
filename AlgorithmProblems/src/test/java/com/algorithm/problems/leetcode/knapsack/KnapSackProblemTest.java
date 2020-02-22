package com.algorithm.problems.leetcode.knapsack;

import junit.framework.TestCase;
import org.junit.Test;

public class KnapSackProblemTest extends TestCase {

    @Test
    public void testKnapSack() {
        int[] weights = {1, 3, 2, 5, 4};
        int[] values = {25, 60, 40, 120, 80};

        KnapSackProblem  knapSackProblem = new KnapSackProblem();
        assertEquals(225, knapSackProblem.knapSack(10, weights, values));
    }
}