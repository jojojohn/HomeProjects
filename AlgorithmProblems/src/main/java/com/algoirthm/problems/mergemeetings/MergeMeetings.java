package com.algoirthm.problems.mergemeetings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge all overlapping intervals from a collection of intervals.
 * Example [[1,3], [5,6], [2,8], [9,10] ]
 * Output : [[1,8],[9,10]]
 */
public class MergeMeetings {

    /**
     * This method will merge the overlapped intervals and returns the merged intervals
     * @param intervals
     * @return
     */
    public List<List<Integer>> mergeIntervals(int[][] intervals) {
        // Sort the input array with respect to starting interval.
        // Define a comparator with a specific rule to sort the given intervals.
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        // Iterate through each intervals and find out the lapped intervals.
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            List<Integer> newInterval = new ArrayList<>();
            if (result.size() > 0 && result.get(result.size() - 1).get(1) >= interval[0]) {
                newInterval.add(Math.min(result.get(result.size() - 1).get(0), interval[0]));
                newInterval.add(Math.max(result.get(result.size() - 1).get(1), interval[1]));
                result.remove(result.size() - 1);
                result.add(newInterval);
            } else {
                newInterval.add(interval[0]);
                newInterval.add(interval[1]);
                result.add(newInterval);
            }
        }

        return result;
    }
}
