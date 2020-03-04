package com.algorithm.problems.submatrix;

import junit.framework.TestCase;
import org.junit.Test;

public class SquareSubMatrixProblemTest extends TestCase {

    @Test
    public void testMaxLengthSubArray() {
        int[][] matrix = {{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0}};
        SquareSubMatrixProblem squareSubMatrixProblem = new SquareSubMatrixProblem();
        assertEquals(5, squareSubMatrixProblem.maxLengthSubArray(matrix));
    }

    @Test
    public void testMaxLengthSubArray1() {
        int[][] matrix = {{1, 1, 1, 1, 0, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 0}};
        SquareSubMatrixProblem squareSubMatrixProblem = new SquareSubMatrixProblem();
        assertEquals(4, squareSubMatrixProblem.maxLengthSubArray(matrix));
    }
}