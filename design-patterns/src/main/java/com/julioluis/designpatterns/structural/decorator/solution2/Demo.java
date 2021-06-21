package com.julioluis.designpatterns.structural.decorator.solution2;

public class Demo {

    public static void main(String[] args) {

        CoffeeService capuchino=new SteamMilk(new Espresso(new Capuchino()));

        System.out.println("Coffee:: "+ capuchino.getDescription() +" "+ capuchino.getCost());

    }
}
