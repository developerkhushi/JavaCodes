package com.dsa.array;

import java.util.Arrays;

public class MovesZeroes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 4, 5};

        // Zeroes at End

//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[k++] = arr[i]; // [1,3]
//            }
//        }
//
//        for (int i = k; i < arr.length; i++) {
//            arr[i] = 0;
//        }

        // Zeroes at Start
        int k = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[k--] = arr[i]; // [1,3]
            }
        }

        for (int i = 0; i < k; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
