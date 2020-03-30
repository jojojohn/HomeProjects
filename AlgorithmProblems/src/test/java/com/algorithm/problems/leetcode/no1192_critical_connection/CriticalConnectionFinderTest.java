package com.algorithm.problems.leetcode.no1192_critical_connection;

import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

public class CriticalConnectionFinderTest extends TestCase {

    public void testCriticalConnections() {
        CriticalConnectionFinder criticalConnectionFinder = new CriticalConnectionFinder();
        List<List<Integer>> connections = new LinkedList<>();
        List<Integer> connection = new LinkedList<>();
        connection.add(0);
        connection.add(1);
        connections.add(connection);
        connection = new LinkedList<>();
        connection.add(1);
        connection.add(2);
        connections.add(connection);
        connection = new LinkedList<>();
        connection.add(2);
        connection.add(0);
        connections.add(connection);
        connection = new LinkedList<>();
        connection.add(1);
        connection.add(3);
        connections.add(connection);
        List<List<Integer>> result = criticalConnectionFinder.criticalConnections(4, connections);
        for (List<Integer> edges : result) {
            assertTrue((edges.get(0) == 1 || edges.get(0) == 3));
            assertTrue((edges.get(1) == 1 || edges.get(1) == 3));
        }
    }
}