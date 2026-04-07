package com.dsa.graph;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int vertex = 5;
        int[][] graph = new int[vertex + 1][vertex + 1];

        // 1 - 2
        graph[1][2] = 1;
        graph[2][1] = 1;

        // 1 - 3
        graph[1][3] = 1;
        graph[3][1] = 1;

        // 2 - 4
        graph[2][4] = 1;
        graph[4][2] = 1;

        // 3 - 4
        graph[3][4] = 1;
        graph[4][3] = 1;

        // 3 - 5
        graph[3][5] = 1;
        graph[5][3] = 1;

        // 4 - 5
        graph[4][5] = 1;
        graph[5][4] = 1;

        for (int i = 1; i <= vertex; i++) {
            for (int j = 1; j <= vertex; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
