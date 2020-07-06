package com.algorithm.problems.permutation;

import com.sun.tools.javac.util.StringUtils;
import junit.framework.TestCase;

import java.util.Arrays;

public class PermutationTest extends TestCase {

    public void testPermute() {
        Permutation permutation = new Permutation();
        assertEquals(permutation.permute("abc").size(), 6);
        assertEquals(permutation.permute("abcd").size(), 24);
        permutation.permute("adcb").forEach(str -> {
            char[] st = str.toCharArray();
            Arrays.sort(st);
            String str_copy = new String(st);
            assertEquals(str_copy, "abcd");
        });
    }
}