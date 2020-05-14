package com.julioluis.designpatterns.structural.flyweight;

public class Quote {

    private String color;

    public Quote(String color) {
        this.color = color;
    }

    public void showQoute(String qoute) {
        System.out.println(qoute +" was written in "+color);
    }
}
