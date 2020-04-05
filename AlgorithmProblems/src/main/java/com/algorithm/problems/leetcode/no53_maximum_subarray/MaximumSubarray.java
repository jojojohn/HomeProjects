package com.algorithm.problems.leetcode.no53_maximum_subarray;

public class MaximumSubarray {

    public int maxSubArray(int[] input) {
        int result = 0;

        int sum = result = input[0];
        for (int i = 1; i < input.length; i++) {
            sum = Math.max(input[i], sum + input[i]);
            result = Math.max(sum, result);
        }
        return result;
    }
}
