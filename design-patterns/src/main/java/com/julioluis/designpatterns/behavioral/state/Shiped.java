package com.julioluis.designpatterns.behavioral.state;

public class Shiped implements PackageState {

    private static Shiped shiped=new Shiped();

    private Shiped() {
    }

    public static Shiped getInstance() {
        return shiped;
    }

    @Override
    public void updateState(PackageContext context,Transaction transaction) {
        if (transaction.getStatus().equals(Status.SHIPPED)) {
            System.out.println(transaction);
        }else  {
            context.setCurrentState(InTransition.getInstance());
            context.update(transaction);
        }


    }
}
