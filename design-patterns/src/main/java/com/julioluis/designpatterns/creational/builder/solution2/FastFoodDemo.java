package com.julioluis.designpatterns.creational.builder.solution2;

public class FastFoodDemo {

    public static void main(String[] args) {
        ComboOne comboOne=new ComboOne();

        FastFoodBuilderConsumer client=new FastFoodBuilderConsumer(comboOne);

        System.out.println("Delivery Package");
        client.build();
        client.display();

        System.out.println("------------------------------------------\n");
        ComboTwo comboTwo=new ComboTwo();
        FastFoodBuilderConsumer client2=new FastFoodBuilderConsumer(comboTwo);
        client2.build();
        client2.display();
    }
}
