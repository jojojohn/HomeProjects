package com.algorithm.problems.medianofarrays;

public class MedianArrays {

    public double Median(final int array1[], final int array2[]) {
        int[] result = new int[array1.length + array2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        for (i =0, j= 0; i < array1.length && j < array2.length;) {
            if(array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            result[k++] = array1[i++];
        }
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        int n  = result.length/2;
        if (result.length % 2 == 0) {
            return (double)(result[n - 1] + result[n])/2;
        } else {
            return result[n];
        }
    }

    public double Median2(final int array1[], final int array2[]) {
        int array1_length = array1.length;
        int array2_length = array2.length;
        int total  = array1_length + array2_length;
        int middle = (total + 1)/2;
        int start = 0;
        int end = array1_length;

        while (start < end) {
            int partition_array1 = (start + end)/2;
            int partition_array2 = middle - partition_array1;

            int maxLeftArray1 = partition_array1 == 0 ? Integer.MIN_VALUE : array1[partition_array1 - 1];
            int minRightArray1 = partition_array1 == array1_length ? Integer.MAX_VALUE : array1[partition_array1];
            int maxLeftArray2 = partition_array2 == 0 ? Integer.MIN_VALUE : array2[partition_array2 - 1];
            int minRightArray2 = partition_array2 == array2_length ? Integer.MAX_VALUE : array2[partition_array2];

            if (maxLeftArray1 <= minRightArray2 && maxLeftArray2 <= minRightArray1) {
                if (total % 2 == 0) {
                    return (double)((Math.max(maxLeftArray1, maxLeftArray2)) + (Math.min(minRightArray1, minRightArray2)))/2;
                } else {
                    return (double) Math.max(maxLeftArray1, maxLeftArray2);
                }
            }

            if (maxLeftArray1 > minRightArray1) {
                end = partition_array1 - 1;
            } else {
                start = partition_array1 + 1;
            }
        }
        return 0.0;
    }

}
