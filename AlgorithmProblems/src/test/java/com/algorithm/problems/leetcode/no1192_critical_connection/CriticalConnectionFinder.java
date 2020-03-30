package com.algorithm.problems.leetcode.no1192_critical_connection;

import java.util.LinkedList;
import java.util.List;

public class CriticalConnectionFinder {
    private List<List<Integer>> criticalEdges = new LinkedList<>();
    private int orderCount = 0;

    public List<List<Integer>> criticalConnections(final int n, List<List<Integer>> connections) {
        LinkedList<Integer> adjacencyList[] = new LinkedList[n];

        // Finding out bridges with DFS
        boolean[] visited = new boolean[n];
        int[] discoveryOrder = new int[n];
        int[] lowReachableOrder = new int[n];
        int[] parent = new int[n];
        for (int i = 0; i< n; i++) {
            visited[i] = false;
            if (adjacencyList[i] == null) {
                adjacencyList[i] = new LinkedList<>();
            }
            parent[i] = -1;
        }
        // generating adjacency list
        for (List<Integer> edge : connections) {
            if(!adjacencyList[edge.get(0)].contains(edge.get(1))) {
                adjacencyList[edge.get(0)].add(edge.get(1));
            }
            if(!adjacencyList[edge.get(1)].contains(edge.get(0))) {
                adjacencyList[edge.get(1)].add(edge.get(0));
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                this.findBridge(i, visited, discoveryOrder, lowReachableOrder, parent, adjacencyList);
            }
        }
        return criticalEdges;
    }

    private void findBridge(final int vertex, final boolean[] visited, final int[] discoveryOrder,
                            final int[] lowReachableOrder, final int[] parent,
                            final LinkedList<Integer>[] adjacencyList) {
        visited[vertex] = true;
        discoveryOrder[vertex] = lowReachableOrder[vertex] = ++orderCount;
        for (int child : adjacencyList[vertex]) {
            if (!visited[child]) {
                parent[child] = vertex;
                findBridge(child, visited, discoveryOrder, lowReachableOrder, parent, adjacencyList);
                lowReachableOrder[vertex] = Math.min(lowReachableOrder[vertex], lowReachableOrder[child]);
                if(discoveryOrder[vertex] < lowReachableOrder[child]) {
                    List<Integer> vertices = new LinkedList<>();
                    vertices.add(child);
                    vertices.add(vertex);
                    this.criticalEdges.add(vertices);
                }
            } else if (child != parent[vertex]) {
                lowReachableOrder[vertex] = Math.min(lowReachableOrder[vertex], discoveryOrder[child]);
            }
        }
    }
}
