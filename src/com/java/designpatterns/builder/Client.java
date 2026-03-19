package com.java.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Khushboo")
                .setAge(27)
                .setPsp(99)
                .setGradYear(2022)
                .build();

        System.out.println("Builder Pattern coded successfully!!");
    }
}
