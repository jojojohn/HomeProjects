package com.algorithm.problems.knapsack;

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

    public int knapSackDP(int weight, int[] weights, int[] values) {
        int[][] cache = new int[weights.length + 1][weight + 1];
        for (int i = 1; i < cache.length; i++) {
            for (int j  = 1; j < cache[0].length; j++) {
                if (weights[i - 1] > j) {
                    cache[i][j] = cache[i - 1][j];
                } else {
                    cache[i][j] = Math.max(cache[i - 1][j], cache[i - 1][j - weights[i - 1]] + values[i  - 1]);
                }
            }
        }
        return cache[weights.length][weight];
    }
}
