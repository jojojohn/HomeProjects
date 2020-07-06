package com.algorithm.problems.leetcode.no567_permutation_in_string;

import junit.framework.TestCase;

public class PermutationInStringTest extends TestCase {

    public void testCheckInclusion() {
        PermutationInString permutationInString = new PermutationInString();
        assertTrue(permutationInString.checkInclusion("ab", "elbaoo"));
    }
}