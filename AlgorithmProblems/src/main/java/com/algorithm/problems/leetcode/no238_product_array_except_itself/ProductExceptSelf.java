package com.algorithm.problems.leetcode.no238_product_array_except_itself;

public class ProductExceptSelf {

    int[] product(final int[] input) {
        int[] result = new int[input.length];
        result[0] = 1;
        for(int i = 1; i < input.length; i++) {
            result[i] = result[i - 1] * input[i - 1];
        }
        int value = 1;
        for (int i = input.length - 2; i >= 0; i--) {
            result[i] *= input[i + 1] * value;
            value *= input[i + 1];
        }
        return result;
    }
}
