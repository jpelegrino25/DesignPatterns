package com.julioluis.designpatterns.structural.decorator.solution2;

import java.math.BigDecimal;

public class CapuchinoDecorator implements CoffeeService {

    protected CoffeeService coffee;

    public CapuchinoDecorator(CoffeeService coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return coffee.getCost();
    }


}
