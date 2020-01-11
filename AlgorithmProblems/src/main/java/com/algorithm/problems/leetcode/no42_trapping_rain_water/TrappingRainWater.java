package com.algorithm.problems.leetcode.no42_trapping_rain_water;

public class TrappingRainWater {

    /**
     * Solution 1
     * @param height
     * @return
     */
    public int trap_1(int[] height) {
        int trappedWater = 0;
        if (height.length > 2) {
            int[] temp = new int[height.length];
            int i = 0;
            int leftBoundary = 0;
            while (i < height.length) {
                leftBoundary = height[i];
                i++;
                while (i < height.length && height[i] < leftBoundary) {
                    temp[i] = leftBoundary - height[i];
                    i++;
                }
            }
            i = height.length - 1;
            int rightBoundary = 0;
            while(i >= 0) {
                rightBoundary =  height[i];
                i--;
                while(i >= 0 && height[i] < rightBoundary) {
                    trappedWater += Math.min(temp[i], rightBoundary - height[i]);
                    i--;
                }
            }
        }
        return trappedWater;
    }

    public int trap_2(int[] height) {
        int trappedWater = 0;
        if (height.length  >2) {
            int[] temp = new int[height.length];
            int max = height[0];
            temp[0] = max;
            for(int i = 1; i < height.length; i++) {
                if(height[i] > max) {
                    temp[i] = height[i];
                    max = height[i];
                } else {
                    temp[i] = max;
                }
            }

            max = height[height.length - 1];
            for (int i = height.length - 1; i >=0 ; i--) {
                if (height[i] > max) {
                    trappedWater += Math.min(height[i], temp[i]) - height[i];
                    max = height[i];
                } else {
                    trappedWater += Math.min(max, temp[i]) - height[i];
                }
            }
        }
        return trappedWater;
    }
}
