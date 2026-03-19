package com.refSheet;

public class AddTwoFraction {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int[] addFractions(int n1, int d1, int n2, int d2) {
        int num = (n1 * d2) + (n2 * d1);
        int den = d1 * d2;

        int gcd = gcd(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;

        if (den < 0) {
            num *= -1;
            den *= -1;
        }
        return new int[]{num, den};
    }

    public static void main(String[] args) {

        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println(result1[0] + "/" + result1[1]);

        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println(result2[0] + "/" + result2[1]);
    }
}
