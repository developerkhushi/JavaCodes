package com.refSheet;

public class CountWays {

    public static int countWaysToNthStairs(int N) {
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= N; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWaysToNthStairs(n));
    }
}
