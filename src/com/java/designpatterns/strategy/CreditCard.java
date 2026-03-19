package com.java.designpatterns.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid through Credit Card!!");
    }
}
