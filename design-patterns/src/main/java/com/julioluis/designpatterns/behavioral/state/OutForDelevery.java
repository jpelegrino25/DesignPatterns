package com.julioluis.designpatterns.behavioral.state;

public class OutForDelevery implements PackageState {

    private static OutForDelevery outForDelevery=new OutForDelevery();

    private OutForDelevery() {
    }

    public static OutForDelevery getInstance() {
        return outForDelevery;
    }

    @Override
    public void updateState(PackageContext context,Transaction transaction) {
        if (transaction.getStatus().equals(Status.OUT_FOR_DELIVERY)) {
            System.out.println(transaction);
        }else {
            context.setCurrentState(Delivered.getInstance());
            context.update(transaction);
        }
    }
}
