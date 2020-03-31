package com.algorithm.problems.leetcode.no5_longest_palindromic_substring;

import junit.framework.TestCase;

public class LongestPalindromicSubstringTest extends TestCase {

    public void testLongestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        assertEquals(longestPalindromicSubstring.longestPalindrome("abebc"), "abebc");
    }
}