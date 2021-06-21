package com.julioluis.designpatterns.creational.builder.solution2.enums;

import com.julioluis.designpatterns.creational.builder.solution2.Item;

public enum MealsEnum {
    JBC_CHEESBURGER(new Item(2200,"JBC Cheesburger")),
    SPICY_CHICKEN(new Item(2201,"Spicy Checken")),
    CRISPY_CHICKEN(new Item(2202,"Crispy Chicken")),
    SMALL_CHILL(new Item(2203,"Small Chill"));

    MealsEnum(Item meals) {
        this.meals=meals;
    }

    private Item meals;

    public Item getMeals() {
        return meals;
    }
}
