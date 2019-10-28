package com.algorithm.problems.reversestring;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest extends TestCase {

    @Test
    public void testReverseString() {
        String input = "string";
        String output = "gnirts";

        Assert.assertEquals(output, new ReverseString().reverseString(input));
    }

    @Test
    public void testReverseStringFail() {
        String input = "string";
        String output = "gnirs";

        Assert.assertNotEquals(output, new ReverseString().reverseString(input));
    }
}
