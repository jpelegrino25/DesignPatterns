package com.julioluis.designpatterns.creational.builder.solution2;

public interface FastFoodBuilder {

    void buildMeals();
    void buildDrink();
    void buildDessert();
    void buildToys();
    FastFood getFastFood();
}
