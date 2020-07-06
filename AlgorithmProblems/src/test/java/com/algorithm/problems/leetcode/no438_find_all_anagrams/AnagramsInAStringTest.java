package com.algorithm.problems.leetcode.no438_find_all_anagrams;

import com.algorithm.problems.leetcode.AnagramsInAString;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class AnagramsInAStringTest extends TestCase {

    public void testFindAnagrams() {
        AnagramsInAString anagramsInAString = new AnagramsInAString();
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(6);
        assertEquals(anagramsInAString.findAnagrams("cbaebabacd", "abc"), result);
    }
}