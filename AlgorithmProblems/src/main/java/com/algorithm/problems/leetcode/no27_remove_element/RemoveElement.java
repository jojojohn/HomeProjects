package com.algorithm.problems.leetcode.no27_remove_element;

public class RemoveElement {
    public RemoveElement() {
    }

    public int removeElement(final int[] numbers, int val) {
        int i = 0, index = 0;
        while (i < numbers.length) {
            if(numbers[i] == val) {
                numbers[index++] = numbers[i];
            }
            i++;
         }
        return index;
    }
}
