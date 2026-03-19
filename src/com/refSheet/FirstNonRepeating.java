package com.refSheet;


import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeating {

    public static char firstDistinct(String s) {
//        if (s == null || s.isEmpty()) return '0';
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        for (char ch : s.toCharArray()) {
//           map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) return entry.getKey();
//        }

        // For Constant space using frequency array

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) return c;
        }
        return '0';
    }

    public static void main(String[] args) {
        String s = "abbacd"; // "abbacd"
        System.out.print(firstDistinct(s));
    }
}
