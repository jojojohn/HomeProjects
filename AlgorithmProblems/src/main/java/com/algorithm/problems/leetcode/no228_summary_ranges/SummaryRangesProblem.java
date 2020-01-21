package com.algorithm.problems.leetcode.no228_summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesProblem {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length != 0) {
            if (nums.length == 1) {
                result.add(String.valueOf(nums[0]));
            } else {
                int first = 0;
                int prev = nums[first];
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] == prev + 1) {
                        if (i == nums.length - 1) {
                            result.add(nums[first] + "->" + nums[i]);
                        }
                    } else {
                        if (i == nums.length - 1) {
                            if (nums[first] == prev) {
                                result.add(String.valueOf(nums[first]));
                            } else {
                                result.add(nums[first] + "->" + prev);
                            }
                            result.add(String.valueOf(nums[i]));
                        } else {
                            if (nums[first] == prev) {
                                result.add(String.valueOf(nums[first]));
                            } else {
                                result.add(nums[first] + "->" + prev);
                            }
                        }
                        first = i;
                    }
                    prev = nums[i];
                }
            }
        }
        return result;
    }

    public List<String> summaryRanges_1(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length != 0) {
            if (nums.length == 1) {
                result.add(String.valueOf(nums[0]));
            } else {
                for (int i = 0; i < nums.length; i++) {
                    int start  = i;
                    while ((i + 1) < nums.length && (nums[i] + 1) == nums[i+1]) {
                        i++;
                    }
                    if (start == i) {
                        result.add(String.valueOf(nums[start]));
                    } else {
                        result.add(nums[start] + "->" + nums[i]);
                    }
                }
                }
            }
        return result;
    }

}
