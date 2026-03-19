package com.refSheet;

public class MaximumPathSum {

    public static int maxPathSum(int mat[][]) {
//        int m = mat.length, n = mat[0].length;
//        int[][] dp = new int[m][n];
//
//        // First row as original matrix
//        for (int j = 0; j < n; j++) {
//            dp[0][j] = mat[0][j];
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j == 0) {
//                    dp[i][j] = mat[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j + 1]);
//                } else if (j == n -1) {
//                    dp[i][j] = mat[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
//                } else {
//                    dp[i][j] = mat[i][j] + Math.max(
//                                                    Math.max(dp[i - 1][j - 1], dp[i - 1][j]),
//                                                    dp[i - 1][j + 1]);
//                }
//            }
//        }
//        for (int j = 0; j < n; j++) {
//            if (dp[m - 1][j] > max) {
//                max = dp[m - 1][j];
//            }
//        }
//        return max;


        int m = mat.length, n = mat[0].length;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    mat[i][j] = mat[i][j] + Math.max(mat[i - 1][j], mat[i - 1][j + 1]);
                } else if (j == n -1) {
                    mat[i][j] = mat[i][j] + Math.max(mat[i - 1][j - 1], mat[i - 1][j]);
                } else {
                    mat[i][j] = mat[i][j] + Math.max(
                            Math.max(mat[i - 1][j - 1], mat[i - 1][j]),
                            mat[i - 1][j + 1]);
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (mat[m - 1][j] > max) {
                max = mat[m - 1][j];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int mat[][] = {
                        {10, 10, 2, 0, 20, 4},
                        {1, 0, 0, 30, 2, 5},
                        {0, 10, 4, 0, 2, 0},
                        {1, 0, 2, 20, 0,4}
                      };
        int maxSum = maxPathSum(mat);
        System.out.println(maxSum);
    }
}
