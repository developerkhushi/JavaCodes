package com.refSheet;

import java.util.HashMap;
import java.util.Map;

public class CycleLength {

    public static int lengthOfCycle(int[] arr, int start) {
        int n = arr.length;
        Map<Integer, Integer> visited = new HashMap<>();
        int currIndex = start;
        int step = 0;

        while (currIndex >= 0 && currIndex < n) {
            if (visited.containsKey(currIndex)) {
                return step - visited.get(currIndex);
            }

            visited.put(currIndex, step);

            currIndex = ((currIndex + arr[currIndex]) % n + n) % n;
            step++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int start = 0;

        System.out.println(lengthOfCycle(arr, start));
    }
}
