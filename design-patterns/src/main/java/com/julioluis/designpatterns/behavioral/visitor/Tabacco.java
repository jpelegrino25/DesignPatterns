package com.julioluis.designpatterns.behavioral.visitor;

public class Tabacco {

    private double price;

    public Tabacco(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
