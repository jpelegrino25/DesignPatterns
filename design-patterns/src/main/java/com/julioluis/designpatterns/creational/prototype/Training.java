package com.julioluis.designpatterns.creational.prototype;

public class Training implements Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Training{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Training clone() throws CloneNotSupportedException {
        return (Training) super.clone();
    }
}
