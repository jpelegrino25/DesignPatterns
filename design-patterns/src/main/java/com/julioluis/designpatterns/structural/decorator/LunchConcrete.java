package com.julioluis.designpatterns.structural.decorator;

public class LunchConcrete extends LunchDecorator {


    private LunchModel model;
    public LunchConcrete(Food food,LunchModel model) {
        super(food);
        this.model=model;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", "+ model.getDescription();
    }

    @Override
    public Double getCost() {
        return food.getCost() + model.getCost();
    }
}
