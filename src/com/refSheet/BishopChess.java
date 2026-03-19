package com.refSheet;

import java.util.Scanner;

public class BishopChess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input bishop position
        System.out.println("Enter bishop row and column:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // Input target position
        System.out.println("Enter target row and column:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if ((r1 + c1) % 2 != (r2 + c2) % 2) {
            System.out.println("No");
        } else if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) {
            System.out.println("Yes and 1 move");
        } else {
            System.out.println("Yes and 2 moves");
        }
    }
}
