package com.algorithm.problems.leetcode.no282_expressions_add_operators;

import junit.framework.TestCase;

import java.util.List;

public class ExpressionAddOperatorsTest extends TestCase {

    public void testAddOperators() {
        ExpressionAddOperators expressionAddOperators = new ExpressionAddOperators();
        List<String> result = expressionAddOperators.addOperators("123", 6);
        assertTrue(result.contains("1+2+3"));
        assertTrue(result.contains("1*2*3"));
        result = expressionAddOperators.addOperators("232", 6);
        assertTrue(result.contains("2+3*2"));
        assertTrue(result.contains("2*3+2"));
    }
}