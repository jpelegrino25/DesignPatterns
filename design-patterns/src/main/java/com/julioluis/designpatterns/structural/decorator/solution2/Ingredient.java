package com.julioluis.designpatterns.structural.decorator.solution2;

import java.math.BigDecimal;

public class Ingredient extends Coffee {

    private BigDecimal cost;
    private String description;

    public Ingredient(BigDecimal cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public Ingredient() {
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
