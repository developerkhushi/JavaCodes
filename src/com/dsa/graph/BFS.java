package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adj = new ArrayList<>();

        // create adjacency list
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(5);
        adj.get(3).add(4);
        adj.get(4).add(2);

        boolean[] visited = new boolean[n + 1];
        List<Integer> ans = bfs(1, visited, adj);
        System.out.println("BFS Traversal: " + ans);
    }

    public static List<Integer> bfs(int start, boolean[] visited, List<List<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            ans.add(curr);

            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return ans;
    }
}
