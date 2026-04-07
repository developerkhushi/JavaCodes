package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        int vertex = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        }

        // 1 - 2
        graph.get(1).add(2);
        graph.get(2).add(1);

        // 1 - 3
        graph.get(1).add(3);
        graph.get(3).add(1);

        // 2 - 4
        graph.get(2).add(4);
        graph.get(4).add(2);

        // 3 - 4
        graph.get(3).add(4);
        graph.get(4).add(3);

        // 3 - 5
        graph.get(3).add(5);
        graph.get(5).add(3);

        // 4 - 5
        graph.get(4).add(5);
        graph.get(5).add(4);

        for (int i = 1; i <= vertex; i++) {
            System.out.print(i + " -> ");
//            for (int j = 0; j < graph.get(i).size(); j++) {
//                System.out.print(graph.get(i).get(j) + " ");
//            }
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
