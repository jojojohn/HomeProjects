package com.algorithm.problems.leetcode.no3_longest_substring_norepeat;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubString {

    public int lengthOfLongestSubstring(final String s) {
        int maxLength = 0;
        Queue<Character> queue = new LinkedList<>();
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (queue.contains(s.charAt(i))) {
                while(s.charAt(i) != queue.peek()) {
                    queue.poll();
                }
                queue.poll();
            }
            queue.add(s.charAt(i));
            maxLength = Math.max(maxLength, queue.size());
        }
        return maxLength;
    }
}
