package com.algorithm.problems.leetcode.no122_best_time_to_buy_stock_ii;

import junit.framework.TestCase;

public class BuySellStockIITest extends TestCase {

    public void testMaxProfit() {
        BuySellStockII buySellStockII = new BuySellStockII();
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(4, buySellStockII.maxProfit(input));
        int[] input_1 = {4,3,2,1};
        assertEquals(0, buySellStockII.maxProfit(input_1));
    }
}