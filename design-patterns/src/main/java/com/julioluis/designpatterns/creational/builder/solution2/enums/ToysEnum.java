package com.julioluis.designpatterns.creational.builder.solution2.enums;

import com.julioluis.designpatterns.creational.builder.solution2.Item;

import java.util.Random;

public enum ToysEnum {


    CAR(new Item(4400,"Car")),
    DENOSOR(new Item(4401,"Denosor")),
    POKEMON(new Item(4402,"Pikachu")),
    GOKU(new Item(4403,"Goku"));

    ToysEnum(Item toys) {
        this.toys=toys;
    }

    private Item toys;

    public Item getToys() {
        return toys;
    }

    public static ToysEnum getToy() {
        Random random=new Random();
        int toyIndex=random.nextInt(3) +0;
        ToysEnum[] toys=ToysEnum.values();
        ToysEnum toysEnum= toys[toyIndex];
        return toysEnum;
    }


}
