package com.algorithm.problems.leetcode.no163_missing_ranges;

import com.sun.source.tree.AssertTree;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingRangesTest extends TestCase {

    private MissingRanges missingRanges = new MissingRanges();

    public void testFindMissingRanges() {
        int[] input = {1, 2, 3, 4, 5};
        int low = 0;
        int high = 10;
        List<String> expected = new ArrayList<>();
        expected.add("0");
        expected.add("6->10");
        assertTrue(this.isTwoListsAreEqual(expected, missingRanges.findMissingRanges(input, low, high)));
        input = new int[]{0, 1, 3, 50, 75};
        low = 0;
        high = 99;
        expected.clear();
        expected.add("2");
        expected.add("4->49");
        expected.add("51->74");
        expected.add("76->99");
        assertTrue(this.isTwoListsAreEqual(expected, missingRanges.findMissingRanges(input, low, high)));

        input = new int[]{0, 1, 3, 3, 3, 50, 50, 60, 75};
        low = 0;
        high = 99;
        expected.clear();
        expected.add("2");
        expected.add("4->49");
        expected.add("51->59");
        expected.add("61->74");
        expected.add("76->99");
        assertTrue(this.isTwoListsAreEqual(expected, missingRanges.findMissingRanges(input, low, high)));

        input = new int[]{-2147483648, -2147483648, 0, 2147483647, 2147483647};
        low = -2147483648;
        high = 2147483647;
        expected.clear();
        expected.add("-2147483647->-1");
        expected.add("1->2147483646");
        assertTrue(this.isTwoListsAreEqual(expected, missingRanges.findMissingRanges(input, low, high)));

    }

    public boolean isTwoListsAreEqual(final List<String> list1, final List<String> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
