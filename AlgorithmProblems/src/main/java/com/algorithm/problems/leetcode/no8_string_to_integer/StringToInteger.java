package com.algorithm.problems.leetcode.no8_string_to_integer;

public class StringToInteger {

    public int myAtoi(String str) {

        double convertedNumber = 0;
        boolean isNegative = false;
        str = str.strip();
        int startIndex = 0;
        if (str.startsWith("-")) {
            startIndex = 1;
            isNegative = true;
        }

        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9') {
                break;
            }
            convertedNumber = convertedNumber * 10 + (int) (c - '0');
        }

        if (isNegative) {
            return (int) -convertedNumber;
        }

        if (convertedNumber > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (convertedNumber < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }


        return (int) convertedNumber;
    }
}
