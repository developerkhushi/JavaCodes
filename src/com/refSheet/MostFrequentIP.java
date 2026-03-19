package com.refSheet;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentIP {

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;

        for (String part : parts) {
            if (part.isEmpty()) return false;
            try {
                int num = Integer.parseInt(part);

                if (num < 0 || num > 255) return false;

                if (part.length() > 1 && part.startsWith("0")) 
                    return false;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    public static String mostFrequentIP(String[] logs) {
        int maxCount = 0;
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        for (String log : logs) {
            String ip = log.split(" ")[0];

            if (!isValidIP(ip)) continue;

            int count = map.getOrDefault(ip, 0) + 1;
            map.put(ip, count);

            if (count > maxCount) {
                maxCount = count;
                res = ip;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        System.out.println(mostFrequentIP(str));
    }
}
