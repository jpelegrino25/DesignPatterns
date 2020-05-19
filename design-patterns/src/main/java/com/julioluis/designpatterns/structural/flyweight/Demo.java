package com.julioluis.designpatterns.structural.flyweight;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {


    public static void main(String[] args) {
        List<String> colors=load();

        for (int i=1;i<=100;i++) {
            Random generate=new Random();
            int index=generate.nextInt(colors.size());

            Quote quote=FlyWeightFactory.factory(colors.get(index));
            quote.showQoute("Nunca es tarde si la dicha es buena");
        }

    }


    public static List<String> load() {
        List<String> colors= Arrays.asList("BLUE","RED","YELLOW","GREEN");
        return colors;
    }




}
