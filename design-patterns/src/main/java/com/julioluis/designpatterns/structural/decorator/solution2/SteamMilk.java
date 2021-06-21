package com.julioluis.designpatterns.structural.decorator.solution2;

import com.julioluis.designpatterns.structural.decorator.solution2.enums.IngredientEnum;

import java.math.BigDecimal;

public class SteamMilk extends CapuchinoDecorator {

    private Coffee ingredientCoffee;

    public SteamMilk(CoffeeService coffee) {
        super(coffee);
        IngredientUtil ingredientUtil=new IngredientUtil();
        ingredientCoffee=ingredientUtil.find(IngredientEnum.STEAMED_MILK.getIngredient());
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +","+ingredientCoffee.getDescription();
    }

    public BigDecimal getCost() {
        return coffee.getCost().add(ingredientCoffee.getCost());
    }
}
