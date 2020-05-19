package com.julioluis.designpatterns.structural.decorator;

public class LunchBase implements Food {

    private LunchModel model;

    public LunchBase(LunchModel model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return model.getDescription();
    }

    @Override
    public Double getCost() {
        return model.getCost();
    }
}
