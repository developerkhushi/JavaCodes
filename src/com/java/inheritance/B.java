package com.java.inheritance;

public class B extends A{
    public void m2() {
        System.out.println("Class B");
    }

//    public B() {
//        super();
//    }

    @Override
    public String m4(String s) {
        super.m4(s);
        System.out.println("Overridden method in class B");
        return s;
    }
}
