package com.julioluis.designpatterns.creational.builder.solution2;

import com.julioluis.designpatterns.creational.builder.solution2.FastFoodBuilder;

import java.util.Objects;

public class FastFoodBuilderConsumer {

    private FastFoodBuilder fastFoodBuilder;

    public FastFoodBuilderConsumer(FastFoodBuilder fastFoodBuilder) {
        this.fastFoodBuilder = fastFoodBuilder;
    }

    public void build() {
        fastFoodBuilder.buildMeals();
        fastFoodBuilder.buildDrink();
        fastFoodBuilder.buildToys();
        fastFoodBuilder.buildDessert();
    }

    public void display() {
        if(Objects.nonNull(fastFoodBuilder.getFastFood())) {
            FastFood fastFood=fastFoodBuilder.getFastFood();
            System.out.println(fastFood.getMeals().getDescription());
            System.out.println(fastFood.getDrink().getDescription());
            System.out.println(fastFood.getDessert().getDescription());
            System.out.println(fastFood.getToys().getDescription());
        }else {
            System.out.println("No food has been entered");
        }
    }
}
