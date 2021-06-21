package com.julioluis.designpatterns.creational.builder.solution2.enums;

import com.julioluis.designpatterns.creational.builder.solution2.Item;

public enum DrinkEnum {
    COKE(new Item(1100,"Coca Cola")),
    PEPSI(new Item(1101,"Pepsi Cola")),
    COLA_REAL(new Item(1102,"Kola Real")),
    COUNTRY(new Item(1103,"Country Club")),
    SPRITE(new Item(1104,"Sprite")),
    ORANGE_JUICE(new Item(1105,"Orange Juice")),
    ICE_TEA(new Item(1106,"Ice Tea"));

    DrinkEnum(Item drink) {
        this.drink=drink;
    }

    private Item drink;

    public Item getDrink() {
        return drink;
    }
}
