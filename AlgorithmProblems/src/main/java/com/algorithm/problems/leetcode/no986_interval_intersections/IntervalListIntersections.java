package com.algorithm.problems.leetcode.no986_interval_intersections;

import java.util.LinkedList;
import java.util.List;

public class IntervalListIntersections {

    public int[][] intervalInterSection(int[][] A, int[][] B) {
        List<List<Integer>> result = new LinkedList<>();
        int indexA = 0;
        int indexB = 0;

        while (indexA < A.length && indexB < B.length ) {
            List<Integer> newInterval = new LinkedList<>();
            int newX = Math.max(A[indexA][0], B[indexB][0]);
            int newY = Math.min(A[indexA][1], B[indexB][1]);
            if (newX <= newY) {
                newInterval.add(newX);
                newInterval.add(newY);
                result.add(newInterval);
            }

            if(A[indexA][1] <= B[indexB][1]) {
                indexA++;
            } else {
                indexB++;
            }
        }
        int[][] result_1 = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            result_1[i][0] = result.get(i).get(0);
            result_1[i][1] = result.get(i).get(1);
        }
        return result_1;
    }
}
