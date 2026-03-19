package com.java.designpatterns.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid through UPI Applications!");
    }
}
