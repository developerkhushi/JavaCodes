package com.refSheet;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) return intervals;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current);

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= current[1]) {
                // Overlapping → merge
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap
                current = intervals[i];
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
