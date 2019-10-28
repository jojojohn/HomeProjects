package com.algorithm.problems.reversestring;

/**
 * Method to reverse a string
 * Example : input : string - output : gnirts
 */
public class ReverseString {

    public String reverseString(final String input) {
        char[] input_array = input.toCharArray();
        int start = 0;
        int end = input_array.length - 1;
        while (start < end) {
            char temp = input_array[start];
            input_array[start] = input_array[end];
            input_array[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(input_array);
    }
}
