package com.julioluis.designpatterns.structural.decorator.solution2.enums;

public enum CoffeeEnum {
    CAPUCHINO("Capuchino"),
    AMERICANO("Americano"),
    DOPPIO("Doppio");

    CoffeeEnum(String coffee) {
        this.coffee=coffee;
    }

    private  String coffee;

    public String getCoffee() {
        return coffee;
    }
}
