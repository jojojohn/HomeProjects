package com.algorithm.problems.findduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

    List<Integer> getDuplicates(final int[] input) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            if(numberSet.contains(input[i])) {
                if (! result.contains(input[i])) {
                    result.add(input[i]);
                }
            }
            numberSet.add(input[i]);
        }
        return result;
    }
}
