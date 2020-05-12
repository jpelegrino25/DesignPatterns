package com.julioluis.designpatterns.structural.decorator;

public abstract class LunchDecorator implements Food {

    protected Food food;

    public LunchDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    @Override
    public Double getCost() {
        return food.getCost();
    }
}
