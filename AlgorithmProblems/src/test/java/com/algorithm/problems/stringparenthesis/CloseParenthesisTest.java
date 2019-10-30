package com.algorithm.problems.stringparenthesis;

import junit.framework.TestCase;
import org.junit.Assert;

public class CloseParenthesisTest extends TestCase {

    public void testFindCloseParenthesis() {
        String sample  = "find(the closing(parenthesis)(in this(string)))";
        Assert.assertEquals(new CloseParenthesis().findCloseParenthesis(sample, 30), 46);
    }
}
