package com.algorithm.problems.consecutivearrayproblem;

import junit.framework.TestCase;
import org.junit.Test;

public class ConsecutiveArrayTest extends TestCase {

    @Test
    public void testFindMaxLengthConsecutiveArray() {
        ConsecutiveArray consecutiveArray = new ConsecutiveArray();
        int input[] = {1, 2, 4, 8, 3, 9, 5,};
        assertEquals(5, consecutiveArray.findMaxLengthConsecutiveArray(input));
    }

    @Test
    public void testFindMaxLengthConsecutiveArrayI() {
        ConsecutiveArray consecutiveArray = new ConsecutiveArray();
        int input[] = {1, 2, 4, 8, 3, 9, 5,};
        assertEquals(5, consecutiveArray.findMaxLengthConsecutiveArrayI(input));
    }
}