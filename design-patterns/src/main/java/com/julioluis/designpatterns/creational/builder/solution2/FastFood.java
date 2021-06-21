package com.julioluis.designpatterns.creational.builder.solution2;

public class FastFood implements ItemReader {

    private Item meals;
    private Item drink;
    private Item dessert;
    private Item toys;

    @Override
    public void setMeals(Item meals) {
       this.meals=meals;
    }

    @Override
    public void setDrink(Item drink) {
        this.drink=drink;
    }

    @Override
    public void setDessert(Item dessert) {
        this.dessert=dessert;
    }

    @Override
    public void setToys(Item toys) {
        this.toys=toys;
    }

    public Item getMeals() {
        return meals;
    }

    public Item getDrink() {
        return drink;
    }

    public Item getDessert() {
        return dessert;
    }

    public Item getToys() {
        return toys;
    }
}
