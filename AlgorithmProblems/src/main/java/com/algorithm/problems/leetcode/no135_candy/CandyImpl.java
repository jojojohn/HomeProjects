package com.algorithm.problems.leetcode.no135_candy;

public class CandyImpl {
    public void CandyImpl() {
    }

    public int candy(int[] ratings) {
        if (ratings.length == 0) {
            return 0;
        }
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies [i- 1] + 1;
            } else {
                candies[i] = 1;
            }
        }

        int candies_count = 0;
        candies[ratings.length - 1] = Math.max(candies[ratings.length - 1], 1);
        candies_count += candies[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies [i + 1] + 1);
                candies_count += candies[i];
            } else {
                candies_count += candies[i];
            }
        }
        return candies_count;
    }
}
