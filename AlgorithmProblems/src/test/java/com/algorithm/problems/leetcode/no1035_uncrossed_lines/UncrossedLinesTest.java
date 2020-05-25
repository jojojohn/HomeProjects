package com.algorithm.problems.leetcode.no1035_uncrossed_lines;

import junit.framework.TestCase;

public class UncrossedLinesTest extends TestCase {

    public void testMaxUncrossedLines() {
        UncrossedLines uncrossedLines = new UncrossedLines();
        int[] A = {1, 2, 3, 4, 6};
        int[] B = {3, 5, 1, 2, 4};

        assertEquals(3, uncrossedLines.maxUncrossedLines(A, B));
    }
}
