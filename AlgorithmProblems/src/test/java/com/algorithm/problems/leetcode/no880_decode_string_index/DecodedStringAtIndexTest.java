package com.algorithm.problems.leetcode.no880_decode_string_index;

import junit.framework.TestCase;

public class DecodedStringAtIndexTest extends TestCase {

    public void testDecodeAtIndex() {
        DecodedStringAtIndex decodedStringAtIndex = new DecodedStringAtIndex();
        assertEquals("o", decodedStringAtIndex.decodeAtIndex("leet2code3", 10));
        assertEquals("h", decodedStringAtIndex.decodeAtIndex("ha22", 5));
        //assertEquals("a", decodedStringAtIndex.decodeAtIndex("a2345678999999999999999", 1));
    }
}