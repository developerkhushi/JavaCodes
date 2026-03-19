package com.java.designpatterns.strategy;

public class DebitCard implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid through Debit Card!!");
    }
}
