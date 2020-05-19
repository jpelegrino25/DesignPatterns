package com.julioluis.designpatterns.behavioral.template;

public abstract class PizzaStore {

    public abstract void bakePizza();
    public void order() {
        System.out.println("Ordering pizza");
    }
    public void pack() {
        System.out.println("Packing the pizza");
    }
    public void delivery() {
        System.out.println("Delivering the pizza");
    }

    public void build() {
        order();
        bakePizza();
        pack();
        delivery();
    }
}
