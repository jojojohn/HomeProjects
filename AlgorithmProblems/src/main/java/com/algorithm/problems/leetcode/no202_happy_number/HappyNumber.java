package com.algorithm.problems.leetcode.no202_happy_number;

public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = n;
        if(n == 1) {
            return true;
        }
        while (sum != 1 && sum != 4) {
            int c = sum;
            sum = 0;
            while (c != 0) {
                int rem = c % 10;
                sum += rem * rem;
                c /= 10;
            }
            if (sum == 1) {
                return true;
            }
        }
        return false;
    }
}
