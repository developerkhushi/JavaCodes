package com.refSheet;

public class JosephusProblem {
    public static int joseph(int n, int k) {
        if (n == 1) return 0;
        return (joseph(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
        int numberOfPerson = 6, k = 2;
        System.out.println(joseph(numberOfPerson, k) + 1);
    }
}
