package com.algorithm.problems.leetcode.no1035_uncrossed_lines;

public class UncrossedLines {

    public int maxUncrossedLines(final int[] A, final int[] B) {
        int r = B.length;
        int c = A.length;
        int[][] matrix = new int[r + 1][c + 1];

        for (int i = 0 ; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(B[i] == A[j]) {
                    matrix[i + 1][j + 1] = matrix[i][j] + 1;
                } else {
                    matrix[i + 1][j + 1] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
                }
            }
        }
        return matrix[r][c];
    }
}
