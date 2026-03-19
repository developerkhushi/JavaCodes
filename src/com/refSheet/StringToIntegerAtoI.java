package com.refSheet;

public class StringToIntegerAtoI {

    public static int stringToInteger(String s) {
        // Remove whitespaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        int n = s.length();
        int i = 0;
        int sign  = 1;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // check overflow before multiplying
            if (num > (Integer.MAX_VALUE - digit) / 10)  {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = (num * 10) + digit;
            i++;
        }
        return (int) sign * num;
    }

    public static void main(String[] args) {
        String s = " -042";
        String s2 = "1337c0d3";
        String s3 = "0-1";
        String s4 = "words and 987";
        System.out.println(stringToInteger(s4));
    }
}
