package com.algorithm.problems.leetcode.no238_product_array_except_itself;

import junit.framework.TestCase;
import org.junit.Test;

public class ProductExceptSelfTest extends TestCase {

    @Test
    public void testProduct() {
        int[] input = {1, 2, 3, 4};
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] output = productExceptSelf.product(input);
        assertEquals(24, output[0]);
        assertEquals(12, output[1]);
        assertEquals(8, output[2]);
        assertEquals(6, output[3]);
    }
}