package com.julioluis.designpatterns.behavioral.state;

public class Delivered implements PackageState {

    private static Delivered delivered=new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return delivered;
    }

    @Override
    public void updateState(PackageContext context,Transaction transaction) {
        System.out.println(transaction);
    }
}
