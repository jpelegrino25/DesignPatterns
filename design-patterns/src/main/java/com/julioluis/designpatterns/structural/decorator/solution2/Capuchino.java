package com.julioluis.designpatterns.structural.decorator.solution2;

import com.julioluis.designpatterns.structural.decorator.solution2.enums.CoffeeEnum;

import java.math.BigDecimal;

public class Capuchino implements CoffeeService{

    protected Coffee coffee;

    public Capuchino() {
        CoffeeUtil coffeeUtil=new CoffeeUtil();
        coffee=coffeeUtil.findCoffee(CoffeeEnum.CAPUCHINO.getCoffee());
        System.out.println("Capuchino Coffee");
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
