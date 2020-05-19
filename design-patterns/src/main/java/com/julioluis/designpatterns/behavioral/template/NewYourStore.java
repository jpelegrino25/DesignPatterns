package com.julioluis.designpatterns.behavioral.template;

public class NewYourStore extends PizzaStore {
    @Override
    public void bakePizza() {
        System.out.println("New Your pizza baking style");
    }
}
