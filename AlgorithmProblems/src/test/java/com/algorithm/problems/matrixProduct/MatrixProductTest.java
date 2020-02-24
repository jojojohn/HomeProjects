package com.algorithm.problems.matrixProduct;

import junit.framework.TestCase;
import org.junit.Test;

public class MatrixProductTest extends TestCase {

    @Test
    public void testMatrixProductFn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixProduct matrixProduct = new MatrixProduct();
        assertEquals(2016, matrixProduct.matrixProductFn(matrix));
    }

    @Test
    public void testMatrixProductFnNegative() {
        int[][] matrix = {{-1, 2, 3}, {4, 5, -6}, {7, 8, 9}};
        MatrixProduct matrixProduct = new MatrixProduct();
        assertEquals(1080, matrixProduct.matrixProductFn(matrix));
    }
}