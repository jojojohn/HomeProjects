package com.algorithm.problems.leetcode.no200_number_islands;

public class NumberIslands {

    public int numIslands(final char[][] grid) {
        int count  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    visitLands(i, j, grid.length, grid[0].length, grid);
                }
            }
        }
        return count;
    }

    private void visitLands(final int i, final int j, final int r, final int c, final char[][] grid) {
        if (i < 0 || j < 0 || i > r - 1 || j > c - 1 || grid[i][j] != '1') {
            return;
        } else {
            grid[i][j] = '2';
            visitLands(i - 1, j, r, c, grid);
            visitLands(i, j - 1, r, c, grid);
            visitLands(i, j + 1, r, c, grid);
            visitLands(i + 1, j, r, c, grid);
        }
    }
}
