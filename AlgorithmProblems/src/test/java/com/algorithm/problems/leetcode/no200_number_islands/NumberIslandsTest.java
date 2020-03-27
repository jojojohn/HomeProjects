package com.algorithm.problems.leetcode.no200_number_islands;

import junit.framework.TestCase;

public class NumberIslandsTest extends TestCase {

    public void testNumIslands() {
        char[][] map = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        assertEquals(new NumberIslands().numIslands(map), 1);
        char[][] map1 = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '1', '0'}, {'0', '0', '1', '0', '1'}};
        assertEquals(new NumberIslands().numIslands(map1), 3);
    }
}