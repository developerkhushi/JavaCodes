package com.refSheet;

public class StringTransformation {
    public static void main(String[] args) {
        String s = "abbca";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = s.charAt(i);
                count = 1;
            }
        }
        sb.append(prev).append(count);
        System.out.print(sb);
    }
}
