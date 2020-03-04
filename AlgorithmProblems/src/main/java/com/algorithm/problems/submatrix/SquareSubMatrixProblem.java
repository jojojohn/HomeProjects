package com.algorithm.problems.submatrix;

public class SquareSubMatrixProblem {
    public int maxLengthSubArray(int[][] matrix) {
        int max = 0;
        if (matrix.length > 0 && matrix[0].length > 0) {
            int[][] tempMatrix = new int[matrix.length][matrix[0].length];
            for(int i = 0; i < tempMatrix.length; i++) {
                for(int j = 0; j < tempMatrix[0].length; j++) {
                    if (i == 0 || j == 0) {
                        tempMatrix[i][j] = matrix[i][j];
                    } else if (matrix[i][j] == 1) {
                        tempMatrix[i][j] = Math.min(Math.min(tempMatrix[i - 1][j], tempMatrix[i - 1][j - 1]), tempMatrix[i][j - 1]) + 1;
                    }
                    max = Math.max(max, tempMatrix[i][j]);
                }
            }
        }
        return max;
    }
}
