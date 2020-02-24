package com.algorithm.problems.consecutivearrayproblem;

import java.util.*;

public class ConsecutiveArray {

    public int findMaxLengthConsecutiveArray(final int[] input) {
        int max = 1;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i] - 1)) {
                max = Math.max(map.getOrDefault(input[i] - 1, 1) + 1, max);
                map.put(input[i], map.getOrDefault(input[i] - 1, 1) + 1);
            } else {
                map.put(input[i], 1);
            }
        }

        return max;
    }

    public int findMaxLengthConsecutiveArrayI(final int[] input) {
        int max = 1;
        Set<Integer> numberSet = new HashSet<>();
        Arrays.stream(input).forEach(element -> numberSet.add(element));

        for (int i = 0; i < input.length; i++) {
            int length = 0;
            int num = input[i];
            while(numberSet.contains(num++)) {
                length++;
            }
            max = Math.max(max, length);
        }

        return max;
    }

}
