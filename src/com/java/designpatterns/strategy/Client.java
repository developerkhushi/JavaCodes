package com.java.designpatterns.strategy;

public class Client {
    public static void main(String[] args) {

        PaymentStrategy strategy = new DebitCard();
        PaymentService context = new PaymentService(strategy);
        context.processPayment(1000);
    }
}
