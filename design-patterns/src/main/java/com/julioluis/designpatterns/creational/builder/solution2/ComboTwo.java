package com.julioluis.designpatterns.creational.builder.solution2;

import com.julioluis.designpatterns.creational.builder.solution2.enums.DessertEnum;
import com.julioluis.designpatterns.creational.builder.solution2.enums.DrinkEnum;
import com.julioluis.designpatterns.creational.builder.solution2.enums.MealsEnum;
import com.julioluis.designpatterns.creational.builder.solution2.enums.ToysEnum;
import com.julioluis.designpatterns.creational.singleton.FastFoodSingle;

public class ComboTwo implements FastFoodBuilder {

    private FastFood fastFood= FastFoodSingle.getInstance();

    @Override
    public void buildMeals() {
        fastFood.setMeals(MealsEnum.SMALL_CHILL.getMeals());
    }

    @Override
    public void buildDrink() {
        fastFood.setDrink(DrinkEnum.COUNTRY.getDrink());
    }

    @Override
    public void buildDessert() {
        fastFood.setDessert(DessertEnum.SWEET_CHERRY.getDessert());
    }

    @Override
    public void buildToys() {
        fastFood.setToys(ToysEnum.getToy().getToys());
    }

    @Override
    public FastFood getFastFood() {
        return fastFood;
    }
}
