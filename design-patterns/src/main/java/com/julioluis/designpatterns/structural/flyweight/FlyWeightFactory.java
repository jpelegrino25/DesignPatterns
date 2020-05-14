package com.julioluis.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static  Map<String,Quote> colorMap=new HashMap<>();

    public static Quote factory(String color) {
        Quote quote=colorMap.get(color);

        if(quote==null) {
            quote=new Quote(color);
            colorMap.put(color,quote);
            return quote;
        }

        return quote;
    }
}
