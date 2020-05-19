package com.julioluis.designpatterns.behavioral.state;

public class InTransition implements PackageState {

    private static InTransition inTransition=new InTransition();

    private InTransition() {
    }

    public static InTransition getInstance() {
        return inTransition;
    }

    @Override
    public void updateState(PackageContext context,Transaction transaction) {
        if (transaction.getStatus().equals(Status.IN_TRANSITION)) {
            System.out.println(transaction);
        }else {
            context.setCurrentState(OutForDelevery.getInstance());
            context.update(transaction);
        }
    }
}
