package com.algorithm.problems.leetcode.no152_maximum_product_subarray;

public class MaximumProductSubArray {

    public int maxProduct(int[] nums) {
        int result = 0;
        if (nums.length > 0) {
            int prevMinProduct = nums[0];
            int prevMaxProduct = nums[0];
            result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int currentMaxProduct = prevMaxProduct * nums[i];
                int currentMinProduct = prevMinProduct * nums[i];

                prevMinProduct = Math.min(Math.min(currentMinProduct, currentMaxProduct), nums[i]);
                prevMaxProduct = Math.max(Math.max(currentMinProduct, currentMaxProduct), nums[i]);
                result = Math.max(prevMaxProduct, result);
            }

        }
        return result;
    }
}
