package com.algorithm.problems.averagecontiguoussubarray;

public class AverageOfSubArray {

    public double[] findSubArrayAverage(int[] elements, int k) {
        double[] result = new double[elements.length - k + 1];
        int start = 0;
        double sum = 0;
        int j = 0;
        for (int end = 0; end < elements.length; end++) {
            sum += elements[end];
            if (end  - start + 1 == k) {
                result[j++] = sum/k;
                sum -= elements[start];
                start++;
            }
        }
        return result;
    }
}
