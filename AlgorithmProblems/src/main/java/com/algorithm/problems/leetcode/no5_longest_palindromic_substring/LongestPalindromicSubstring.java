package com.algorithm.problems.leetcode.no5_longest_palindromic_substring;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return  "";
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = findPalindromeLength(s, i, i);
            int len2 = findPalindromeLength(s, i, i + 1);
            int maxLen = Math.max(len1, len2);
            if (maxLen > (end - start + 1)) {
                start = i - (maxLen - 1) / 2;
                end = i + (maxLen)/2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int findPalindromeLength(final String s, int left, int right) {
        if (s == null || s.isEmpty() || left > right) {
            return 0;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return right - left + 1;
    }
}
