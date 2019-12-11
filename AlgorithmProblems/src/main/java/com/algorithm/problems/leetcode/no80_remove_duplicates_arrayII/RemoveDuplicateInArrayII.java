package com.algorithm.problems.leetcode.no80_remove_duplicates_arrayII;

import com.algorithm.problems.leetcode.no26_remove_duplicates.RemoveDuplicatesImpl;

public class RemoveDuplicateInArrayII {

    public RemoveDuplicateInArrayII() {
    }

    public int removeDuplicates(int[] input) {
        if (input.length == 0 || input.length < 3) {
            return input.length;
        }
        int index = 1;
        for (int i = 2; i < input.length; i++) {
            if(input[index] == input[i] && input[index-1] == input[i]) {
            } else {
                input[++index] = input[i];
            }
        }
        return index + 1;
    }
}
