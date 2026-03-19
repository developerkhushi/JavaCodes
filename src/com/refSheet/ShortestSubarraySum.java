package com.refSheet;

import java.util.HashMap;

public class ShortestSubarraySum {

    // For Negative integer => Prefix Sum and HashMap
    public static int shortestSubarrayNeg(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int prefixSum = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum - k)) {
                int prevIndex = map.get(prefixSum -k);
                minLength = Math.min(minLength, i - prevIndex);
            }

            map.put(prefixSum, i);
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    // For Positive integer => Sliding Window Technique
    public static int shortestSubarrayPos(int arr[], int k) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                minLength = Math.min(minLength, right - left + 1);
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,10,2,1};
        int k = 12;
        System.out.println(shortestSubarrayPos(arr, k));

        int[] arr2 = {2, -1, 2, 3, -2, 4};
        int K = 5;
        System.out.println(shortestSubarrayNeg(arr2, K));
    }
}
