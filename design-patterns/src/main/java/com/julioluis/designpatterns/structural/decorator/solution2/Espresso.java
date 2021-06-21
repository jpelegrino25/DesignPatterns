package com.julioluis.designpatterns.structural.decorator.solution2;

import com.julioluis.designpatterns.structural.decorator.solution2.enums.IngredientEnum;

import java.math.BigDecimal;

public class Espresso extends CapuchinoDecorator {

    private Coffee espressoIngredient;

    public Espresso(CoffeeService coffee) {
        super(coffee);
        IngredientUtil ingredientUtil=new IngredientUtil();
        espressoIngredient=ingredientUtil.find(IngredientEnum.ESPRESSO.getIngredient());

    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +","+espressoIngredient.getDescription();
    }

    public BigDecimal getCost() {
        return coffee.getCost().add(espressoIngredient.getCost());
    }
}
