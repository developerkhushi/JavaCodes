package com.java.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection obj = DatabaseConnection.getInstance();
        DatabaseConnection obj1 = DatabaseConnection.getInstance();
        if (obj == obj1) System.out.println(true);
        else System.out.println(false);
    }
}
