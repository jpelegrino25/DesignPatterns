package com.julioluis.designpatterns.creational.prototype;

public class Demo {

    public static void main(String[] args) {
        try {


            Trainer trainer=(Trainer)  PrototypeFactory.getInstance(ModelType.TRAINER);
            System.out.println(trainer);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
