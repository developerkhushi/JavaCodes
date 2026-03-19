package com.refSheet;

public class Bulbswitcher {

    public static int bulbsOn(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        int n = 100;
        int res = bulbsOn(n);
        System.out.println(res);
    }
}
