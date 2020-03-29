package com.algorithm.problems.graph.bridge;

import junit.framework.TestCase;

import java.util.List;

public class BridgeAlgorithmTest extends TestCase {

    public void testFindBridges() {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 0);
        graph.addEdge(1, 3);
        graph.addEdge(2, 0);
        graph.addEdge(2, 4);
        graph.addEdge(2, 6);
        graph.addEdge(3, 0);
        graph.addEdge(3, 1);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(5, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 2);
        graph.addEdge(6, 5);
        BridgeAlgorithm bridgeAlgorithm = new BridgeAlgorithm(graph);
        List<List<Integer>> result = bridgeAlgorithm.findBridges();
        for (List<Integer> edges : result) {
            assertTrue((edges.get(0) == 0 || edges.get(0) == 2));
            assertTrue((edges.get(1) == 0 || edges.get(1) == 2));
        }
    }
}