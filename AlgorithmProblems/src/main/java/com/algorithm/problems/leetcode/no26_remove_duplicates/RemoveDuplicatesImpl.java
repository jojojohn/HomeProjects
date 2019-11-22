package com.algorithm.problems.leetcode.no26_remove_duplicates;

public class RemoveDuplicatesImpl {

    public RemoveDuplicatesImpl() {
    }

    public int removeDuplicates(int[] nums) {
        int newIndex = 0;
        if (nums.length == 0) {
            return newIndex;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                newIndex++;
            }
        }
        return newIndex + 1;
    }
}
