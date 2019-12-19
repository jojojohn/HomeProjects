package com.algorithm.problems.leetcode.no283_move_zeros;

import junit.framework.TestCase;

public class MoveZerosImplTest extends TestCase {

    public void testMoveZeroes() {
        int[] input  = {1, 1, 1, 2, 2, 3, 0, 2, 1, 0, 2, 0, 0, 0, 0, 2, 3, 4};

        MoveZerosImpl moveZeros = new MoveZerosImpl();
        moveZeros.moveZeroes(input);
        int i = 0;
        for(i = 0; i < input.length; i++) {
           if (input[i] == 0) {
               break;
           }
       }
       assertEquals(12, i);
    }
}