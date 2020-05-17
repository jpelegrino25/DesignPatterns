package com.julioluis.designpatterns.behavioral.state;

public class Ackowledge implements PackageState {

    private static Ackowledge ackowledge=new Ackowledge();

    private Ackowledge(){}

    public static  Ackowledge getInstance() {
        return ackowledge;
    }


    @Override
    public void updateState(PackageContext context,Transaction transaction) {
        if(transaction.getStatus().equals(Status.ACKNOWLEDGE)) {
            System.out.println(transaction);
        }else {
            context.setCurrentState(Shiped.getInstance());
            context.update(transaction);
        }

    }
}
