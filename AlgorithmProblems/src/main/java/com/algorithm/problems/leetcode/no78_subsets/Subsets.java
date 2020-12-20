package com.algorithm.problems.leetcode.no78_subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Subsets {

    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<Integer>());
        this.generateSubset(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private void generateSubset(int[] nums, List<Integer> currentArray, int index) {
        System.out.println("result" + result);
        for (int i = index; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>(currentArray);
            temp.add(nums[i]);
            this.result.add(temp);
            this.generateSubset(nums, temp, i + 1);
        }
    }
}
