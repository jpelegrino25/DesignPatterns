package com.julioluis.designpatterns.creational.singleton;

import com.julioluis.designpatterns.creational.builder.solution2.FastFood;

public class FastFoodSingle {

    private static FastFood fastFood=new FastFood();

    private FastFoodSingle(){}

    public static FastFood getInstance() {
        return fastFood;
    }
}
