package com.julioluis.designpatterns.structural.decorator.solution2.enums;



public enum  IngredientEnum {

    STEAMED_MILK("Steamed Milk"),
    ESPRESSO("Espresso"),
    FOAM("Foam"),
    HOT_WATER("Hot Water"),
    TWENTYZ_ESPRESSO("20z Espresso");

    IngredientEnum(String ingredient) {
        this.ingredient=ingredient;
    }

    private String ingredient;

    public String getIngredient() {
        return ingredient;
    }
}
