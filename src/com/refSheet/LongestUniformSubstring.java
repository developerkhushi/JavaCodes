package com.refSheet;

import java.util.Arrays;

public class LongestUniformSubstring {
    public static int[] longestUniformSubstring(String input) {
        int longestStart = -1;
        int longestLength = 0;

        if (input.length() == 0)
            return new int[]{longestStart, longestLength};

        char prev = input.charAt(0);
        int startIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != prev) {
                int currLength = i - startIndex;

                if (currLength > longestLength) {
                    longestStart = startIndex;
                    longestLength = currLength;
                }

                prev = ch;
                startIndex = i;
            }
        }

        // Check last substring
        int currLength = input.length() - startIndex;
        if (currLength > longestLength) {
            longestStart = startIndex;
            longestLength = currLength;
        }

        return new int[]{longestStart, longestLength};
    }


    public static void main(String[] args) {
        String s = "acbbbbAcd";
        int[] res = longestUniformSubstring(s);
        System.out.println(Arrays.toString(res));
    }
}
