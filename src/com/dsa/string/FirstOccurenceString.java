package com.dsa.string;

public class FirstOccurenceString {
    public static void main(String[] args) {
        String s = "hamsemster";
        String sub = "mst";
        int ans = -1;

        for (int i = 0; i <= s.length() - sub.length(); i++) {
            char firstCharOfSub = sub.charAt(0);
            if (firstCharOfSub == s.charAt(i)) {
                int k;
                for (k = 1; k < sub.length(); k++) {
                    if (sub.charAt(k) != s.charAt(i + k)) {
                        break;
                    }
                }
                if (k == sub.length()) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
