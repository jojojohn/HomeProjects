package com.algorithm.problems.leetcode.no228_summary_ranges;

import junit.framework.TestCase;

import javax.print.DocFlavor;
import java.util.List;

public class SummaryRangesProblemTest extends TestCase {

    public void testSummaryRange() {
        int[] input = {0, 1, 2, 4, 5, 7};
        String actual = "";
        List<String> results = new SummaryRangesProblem().summaryRanges(input);
        assertEquals(results.get(0), "0->2");
        assertEquals(results.get(1), "4->5");
        assertEquals(results.get(2), "7");
    }

    public void testSummaryRange_1() {
        int[] input = {0, 1, 2, 4, 5, 7, 9, 11, 12};
        String actual = "";
        List<String> results = new SummaryRangesProblem().summaryRanges_1(input);
        assertEquals(results.get(0), "0->2");
        assertEquals(results.get(1), "4->5");
        assertEquals(results.get(2), "7");
        assertEquals(results.get(3), "9");
        assertEquals(results.get(4), "11->12");
    }
}