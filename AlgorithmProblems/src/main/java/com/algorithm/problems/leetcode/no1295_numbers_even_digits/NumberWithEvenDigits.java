package com.algorithm.problems.leetcode.no1295_numbers_even_digits;

public class NumberWithEvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String current = String.valueOf(nums[i]);
            if(current.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
