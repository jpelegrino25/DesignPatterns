package com.julioluis.designpatterns.behavioral.template;

public class BostonStore extends PizzaStore {

    @Override
    public void bakePizza() {
        System.out.println("Boston pizza baking style");
    }
}
