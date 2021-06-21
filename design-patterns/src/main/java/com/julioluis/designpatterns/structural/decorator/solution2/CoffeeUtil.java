package com.julioluis.designpatterns.structural.decorator.solution2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoffeeUtil {

    private  List<Coffee> coffees=new ArrayList<>();

    public CoffeeUtil() {
        coffees.add(new Coffee(BigDecimal.valueOf(.55),"Capuchino"));
        coffees.add(new Coffee(BigDecimal.valueOf(.35),"Americano"));
        coffees.add(new Coffee(BigDecimal.valueOf(.66),"Doppio"));
    }

    public  Coffee findCoffee(String coffee) {
        for(Coffee coff : coffees) {
            if(coff.getDescription().equalsIgnoreCase(coffee)) return coff;
        }
        return null;
    }
}
