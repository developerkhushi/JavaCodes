package com.refSheet;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2, -5, -9, -9};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.print("Second smallest not found");
        } else {
            System.out.print(secondSmallest);
        }
    }
}
