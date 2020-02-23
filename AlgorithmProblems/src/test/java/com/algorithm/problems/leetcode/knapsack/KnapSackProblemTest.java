package com.algorithm.problems.leetcode.knapsack;

import com.algorithm.problems.knapsack.KnapSackProblem;
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

    @Test
    public void testKanpSackDP () {
        int[] weights = {1, 3, 2, 5, 4};
        int[] values = {25, 60, 40, 120, 80};

        KnapSackProblem  knapSackProblem = new KnapSackProblem();
        assertEquals(225, knapSackProblem.knapSackDP(10, weights, values));
    }

    @Test
    public void testKanpSackDP_1 () {
        int[] weights = {3, 4, 6, 5};
        int[] values = {2, 3, 1, 4};

        KnapSackProblem  knapSackProblem = new KnapSackProblem();
        assertEquals(6, knapSackProblem.knapSackDP(8, weights, values));
    }
}