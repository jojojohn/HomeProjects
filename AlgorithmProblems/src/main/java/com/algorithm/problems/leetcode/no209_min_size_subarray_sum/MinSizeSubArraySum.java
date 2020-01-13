package com.algorithm.problems.leetcode.no209_min_size_subarray_sum;

public class MinSizeSubArraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;

        while (end <= nums.length) {
            if (sum < s) {
                if (end == nums.length) {
                    break;
                }
                sum += nums[end];
                end++;
            } else {
                if (start == end - 1) {
                    return 1;
                }
                result = Math.min(result, end - start);
                sum -= nums[start];
                start++;
            }
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}
