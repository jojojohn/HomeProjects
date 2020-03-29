package com.algorithm.problems.graph.bridge;

import java.util.LinkedList;
import java.util.List;

public class BridgeAlgorithm {

    private Graph graph;
    private int time;
    List<List<Integer>> bridges;

    public BridgeAlgorithm(final Graph graph) {
        this.graph = graph;
        this.time = 0;
        bridges = new LinkedList<>();
    }

    public List<List<Integer>> findBridges() {
        int number_of_vertices = this.graph.getNumber_of_vertices();
        int[] lowerTime = new int[number_of_vertices];
        int[] discoveryTime = new int[number_of_vertices];
        boolean[] visited = new boolean[number_of_vertices];
        int[] parent = new int[number_of_vertices];
        for (int i = 0; i < number_of_vertices; i++) {
            visited[i] = false;
            parent[i] = -1;
        }
        for (int i = 0; i < number_of_vertices; i++) {
            if (!visited[i]) {
                dfsToFindBridge(i, visited, lowerTime, discoveryTime, parent);
            }
        }
        return bridges;
    }

    private void dfsToFindBridge(final int vertex, final boolean[] visited, final int[] lowerTime, final int[] discoveryTime, final int[] parent) {
        visited[vertex] = true;
        lowerTime[vertex] = discoveryTime[vertex] = ++time;

        for(int child : this.graph.getAdjacencyList()[vertex]) {
            if (!visited[child]) {
                parent[child] = vertex;
                dfsToFindBridge(child, visited, lowerTime, discoveryTime, parent);
                lowerTime[vertex] = Math.min(lowerTime[child], lowerTime[vertex]);
                if (lowerTime[child] > discoveryTime[vertex]) {
                    List<Integer> vertices = new LinkedList<>();
                    vertices.add(child);
                    vertices.add(vertex);
                    this.bridges.add(vertices);
                }
            }
            else if (child != parent[vertex]) {
                lowerTime[vertex] = Math.min(lowerTime[vertex], discoveryTime[child]);
            }
        }
    }
}
