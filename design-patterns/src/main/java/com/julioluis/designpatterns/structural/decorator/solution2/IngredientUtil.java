package com.julioluis.designpatterns.structural.decorator.solution2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IngredientUtil {

    private  List<Ingredient> ingredients=new ArrayList<>();

    public IngredientUtil() {
        ingredients.add(new Ingredient(BigDecimal.valueOf(.55),"Espresso"));
        ingredients.add(new Ingredient(BigDecimal.valueOf(.25),"Steamed Milk"));
        ingredients.add(new Ingredient(BigDecimal.valueOf(.9),"Foam"));
        ingredients.add(new Ingredient(BigDecimal.valueOf(.3),"Hot Water"));
        ingredients.add(new Ingredient(BigDecimal.valueOf(.6),"20z Espresso"));
    }

    public  Ingredient find(String ingredient) {
        for (Ingredient ing : ingredients) {
            if (ing.getDescription().equalsIgnoreCase(ingredient))return ing;
        }
        return null;
    }
}
