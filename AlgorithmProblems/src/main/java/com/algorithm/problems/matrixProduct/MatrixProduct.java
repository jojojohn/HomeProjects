package com.algorithm.problems.matrixProduct;

public class MatrixProduct {

    public int matrixProductFn(int[][] matrix) {
        int[][] maxCache = new int[matrix.length][matrix[0].length];
        int[][] minCache = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    maxCache[i][j] = matrix[i][j];
                    minCache[i][j] = matrix[i][j];
                }
                else if (i == 0 && j > 0) {
                    maxCache[i][j] = maxCache[i][j - 1] * matrix[i][j];
                    minCache[i][j] = minCache[i][j - 1] * matrix[i][j];
                }
                else if (j == 0 && i > 0) {
                    maxCache[i][j] = maxCache[i - 1][j] * matrix[i][j];
                    minCache[i][j] = minCache[i - 1][j] * matrix[i][j];
                } else {
                    int currentMax = Math.max(maxCache[i - 1][j] * matrix[i][j] , maxCache[i][j - 1] * matrix[i][j]);
                    maxCache[i][j] = Math.max(currentMax, Math.max(minCache[i - 1][j] * matrix[i][j] , minCache[i][j - 1] * matrix[i][j]));

                    int currentMin = Math.min(minCache[i - 1][j] * matrix[i][j] , minCache[i][j - 1] * matrix[i][j]);
                    minCache[i][j] = Math.min(currentMin, Math.min(maxCache[i - 1][j] * matrix[i][j] , maxCache[i][j - 1] * matrix[i][j]));
                }
            }
        }
        return maxCache[maxCache.length - 1][maxCache[0].length - 1];
    }
}
