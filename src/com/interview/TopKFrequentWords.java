package com.interview;

import java.util.*;

public class TopKFrequentWords {

//    public static List<Map.Entry<String, Integer>> topNFrequentWords(List<String> sentences, int N) {
//        List<Map.Entry<String, Integer>> ans = new ArrayList();
//
//        if (sentences.isEmpty()) return ans;
//        if (sentences.size() < N) N = sentences.size();
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String sentence : sentences) {
//            String[] words = sentence
//                    .toLowerCase()
//                    .replaceAll("[^a-zA-z] ", "")
//                    .split("\\s+");
//            for (String word : words) {
//                map.put(word, map.getOrDefault(word, 0) + 1);
//            }
//        }
//
//        return map.entrySet()
//                        .stream()
//                        .sorted(
//                                Comparator
//                                        .comparingInt(Map.Entry<String, Integer>::getValue)
//                                        .reversed()
//                                        .thenComparing(Map.Entry::getKey)
//                        )
//                        .limit(N)
//                        .toList();
//
//
//    }

    public static List<Map.Entry<String, Integer>> topNFrequentWords(List<String> sentences, int n) {

        List<Map.Entry<String, Integer>> ans = new ArrayList<>();
        if (sentences.size() == 0) return ans;

        if (sentences.size() < n) {
            n = sentences.size();
        }

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < sentences.size(); i++) {
            String[] words = sentences.get(i).split("\\s+");
            for (String word : words) {
                String search = word.toLowerCase();

                map.put(search, map.getOrDefault(search, 0) + 1);

            }
        }

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        for (int i = 0; i < n; i++) {
            ans.add(pq.poll());
        }

        return ans; // Replace with your implementation
    }


    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Hello world",
                "hello Java world",
                "Java collections are great",
                "Collections in Java are great great"
        );

        int N = 3;

        List<Map.Entry<String, Integer>> result = topNFrequentWords(sentences, N);

        System.out.println(result);
    }
}
