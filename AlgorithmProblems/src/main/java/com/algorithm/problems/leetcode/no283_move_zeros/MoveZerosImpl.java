package com.algorithm.problems.leetcode.no283_move_zeros;

public class MoveZerosImpl {

    public MoveZerosImpl() {
    }

    public void moveZeroes(int[] inputs) {
        int newIndex = 0;
        for(int i = 0; i < inputs.length; i++) {
            if (inputs[i] != 0) {
                inputs[newIndex++] = inputs[i];
            }
        }
        while (newIndex < inputs.length) {
            inputs[newIndex] = 0;
            newIndex++;
        }
    }


}
