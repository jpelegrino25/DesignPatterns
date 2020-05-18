package com.julioluis.designpatterns.behavioral.template;

public class Demo {

    public static void main(String[] args) {

        PizzaStore nyStore=new NewYourStore();
        nyStore.build();

        System.out.println("------------------------------------------");
        System.out.println();

        PizzaStore bostonStore=new BostonStore();
        bostonStore.build();
    }
}
