package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {

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
        List<Integer> ans = new ArrayList<>();
        dfs(1, visited, adj, ans);
        System.out.println("DFS Traversal: " + ans);
    }

    public static void dfs(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> ans) {
        visited[node] = true;
        ans.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj, ans);
            }
        }
    }
}
