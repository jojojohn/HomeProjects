package com.algorithm.problems.leetcode.no844_backspace_string_compare;

import junit.framework.TestCase;

public class BackspaceStringCompareTest extends TestCase {

    public void testBackspaceCompare() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        backspaceStringCompare.backspaceCompare("c#vnvr", "c##vn#nvr");
    }
}