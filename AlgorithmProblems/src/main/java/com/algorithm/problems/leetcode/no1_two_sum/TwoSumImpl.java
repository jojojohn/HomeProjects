package com.algorithm.problems.leetcode.no1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumImpl {

    public int[] twoSum(final int[] nums, final int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
