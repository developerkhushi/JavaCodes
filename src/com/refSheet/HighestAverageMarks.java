package com.refSheet;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
    public static void main(String[] args) {
        String[][] data = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        // key : studentName, value : [totalMarks, count]
        Map<String, int[]> map = new HashMap<>();

        for (String[] student : data) {
            String name = student[0];
            int marks = Integer.parseInt(student[1]);

            map.putIfAbsent(name, new int[2]);
            map.get(name)[0] += marks;
            map.get(name)[1] += 1;
        }

        double maxAvg = Double.NEGATIVE_INFINITY;
        String topStudent = "";

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            double avg = (double) entry.getValue()[0] / entry.getValue()[1];

            if (avg > maxAvg) {
                maxAvg = avg;
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top student: " + topStudent);
        System.out.println("Highest average: " + maxAvg);
    }
}
