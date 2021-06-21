package com.julioluis.designpatterns.creational.builder.solution2.enums;

import com.julioluis.designpatterns.creational.builder.solution2.Item;

public enum DessertEnum {
    SWEET_CHERRY(new Item(3300,"Sweet Cherry")),
    APPLE_DUMPLING(new Item(3301,"Apple Dumpling")),
    BANANA_PUDDING(new Item(3302,"Banana Pudding"));

    DessertEnum(Item dessert) {
        this.dessert=dessert;
    }

    private Item dessert;

    public Item getDessert() {
        return dessert;
    }
}
