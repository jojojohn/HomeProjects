package com.algorithm.problems.leetcode.no485_max_consecutive_one;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while(i < nums.length && nums[i] == 1) {
                count++;
                i++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
