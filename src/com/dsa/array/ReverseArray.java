package com.dsa.array;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = new int[]{-1,4,7,6,2};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low++] = arr[high];
            arr[high--] = temp;
        }
    }
}
