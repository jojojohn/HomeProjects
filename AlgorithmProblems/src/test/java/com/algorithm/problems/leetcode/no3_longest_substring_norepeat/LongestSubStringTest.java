package com.algorithm.problems.leetcode.no3_longest_substring_norepeat;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestSubStringTest extends TestCase {

    @Test
    public void testLengthOfLongestSubstring() {
        String input = "abcdecfghade";
        LongestSubString longestSubString = new LongestSubString();
        assertEquals(7, longestSubString.lengthOfLongestSubstring(input));
    }
}
