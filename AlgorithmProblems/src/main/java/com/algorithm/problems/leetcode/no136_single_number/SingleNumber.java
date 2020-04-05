package com.algorithm.problems.leetcode.no136_single_number;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SingleNumber {

    public int findSingleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0;i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Optional<Integer> result = map.keySet().stream().filter(key -> map.get(key) == 1).findFirst();

        return  result.isEmpty() ? 0 : result.get();
    }
}
