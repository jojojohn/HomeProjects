package com.algorithm.problems.leetcode.no163_missing_ranges;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public List<String> findMissingRanges(final int[] nums, int lower, int upper) {
        int start = lower;
        List<String> result = new ArrayList<>();
        if(start == Integer.MAX_VALUE){
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            if(start == nums[i]) {
                start++;
            } else {
                result.add(generateResult(start, nums[i] - 1));
                if(nums[i] == Integer.MAX_VALUE){
                    return result;
                }
                start = nums[i] + 1;
            }
        }
        if(start <= upper) {
            result.add(this.generateResult(start, upper));
        }
        return result;
    }

    private String generateResult(final int start, final int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }
}
