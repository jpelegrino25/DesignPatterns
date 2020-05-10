package com.julioluis.designpatterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.accountDetail();
        System.out.println(target.getCreditCard());
    }
}
