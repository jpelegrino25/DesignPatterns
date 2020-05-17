package com.julioluis.designpatterns.behavioral.state;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        PackageContext context=new PackageContext(Ackowledge.getInstance());

        Transaction transaction=new Transaction(Status.ACKNOWLEDGE,LocalDate.now(),LocalTime.now(),"Your item has been place in order");
        context.update(transaction);

        transaction=new Transaction(Status.SHIPPED,LocalDate.now(),LocalTime.now(),"Your item was shipped");
        context.update(transaction);

        transaction=new Transaction(Status.IN_TRANSITION,LocalDate.now(),LocalTime.now(),"Your item is in transit");
        context.update(transaction);

        transaction=new Transaction(Status.IN_TRANSITION,LocalDate.now(),LocalTime.now(),"Require invoice attach");
        context.update(transaction);

        transaction=new Transaction(Status.OUT_FOR_DELIVERY,LocalDate.now(),LocalTime.now(),"Your item is out for delivery");
        context.update(transaction);

        transaction=new Transaction(Status.OUT_FOR_DELIVERY,LocalDate.now(),LocalTime.now(),"Need to pay tax required");
        context.update(transaction);

        transaction=new Transaction(Status.DELIVERED,LocalDate.now(),LocalTime.now(),"Your item is delivered");
        context.update(transaction);


    }
}
