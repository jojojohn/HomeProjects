package com.algorithm.problems.leetcode.knapsack;

public class KnapSackProblem {

    public int knapSack(final int maxWeight, final int[] weights, final int[] values) {
        if (weights.length != values.length) {
            return -1;
        }
        return kanpSack(maxWeight, weights, values, 0);
    }

    private int kanpSack(final int maxWeight, final int[] weights, final int[] values, final int index) {
        if (index == weights.length) {
            return 0;
        }
        if (maxWeight - weights[index] < 0) {
            return kanpSack(maxWeight, weights, values, index + 1);
        }

        return Math.max(kanpSack(maxWeight - weights[index], weights, values, index + 1) + values[index],
                kanpSack(maxWeight, weights, values, index + 1));
    }
}
