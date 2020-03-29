package com.algorithm.problems.graph.bridge;

import java.util.LinkedList;
import java.util.List;

public class Graph {

    private int number_of_vertices;
    private List<Integer> adjacencyList[];


    public List<Integer>[] getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Integer>[] adjacencyList) {
        this.adjacencyList = adjacencyList;
    }



    public int getNumber_of_vertices() {
        return number_of_vertices;
    }

    public void setNumber_of_vertices(int number_of_vertices) {
        this.number_of_vertices = number_of_vertices;
    }

    Graph(int number_of_vertices) {
        this.number_of_vertices = number_of_vertices;
        adjacencyList = new LinkedList[number_of_vertices];
        for (int i = 0; i < number_of_vertices; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        this.adjacencyList[vertex1].add(vertex2);
        this.adjacencyList[vertex2].add(vertex1);
    }
}
