package com.dsa.array;

public class MaximumSubarraySumWithK {
    public static int[] maxSubarraySum(int arr[] , int k) {

        if (arr == null || arr.length < k) return new int[0];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        int left = 0;
        int startIndex = 0;
        for (int right = k; right < arr.length; right++) {
            sum += arr[right];
            sum -= arr[left++];
            if (sum > max) {
                max = sum;
                startIndex = left;
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i + startIndex];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,15,3,5,2};
        int k = 3;
        int res[] = maxSubarraySum(arr, k);
        for (int num : res)
            System.out.print(num + " ");
    }
}
