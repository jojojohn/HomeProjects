package com.algorithm.problems.leetcode.no122_best_time_to_buy_stock_ii;

public class BuySellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }

}
