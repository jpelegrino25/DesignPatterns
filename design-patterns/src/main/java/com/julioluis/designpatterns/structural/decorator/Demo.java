package com.julioluis.designpatterns.structural.decorator;

public class Demo {

    public static void main(String[] args) {

        LunchModel meal=new LunchModel.Builder().description("Honey Glazed Union Rings").cost(4.0).build();
        LunchModel deseart=new LunchModel.Builder().description("Tiramisu").cost(4.0).build();
        LunchModel side=new LunchModel.Builder().description("Mashed Patato").cost(3.50).build();
        LunchModel beverage=new LunchModel.Builder().description("Soda").cost(4.0).build();


        Food lunch= new LunchConcrete(new LunchBase(meal),deseart);
        System.out.println(lunch.getDescription());
        System.out.println(lunch.getCost());
        System.out.println("--------------------------------------");
        Food lunch2=new LunchConcrete(new LunchConcrete(new LunchConcrete(new LunchBase(meal),beverage),side),deseart);

        System.out.println(lunch2.getDescription());
        System.out.println(lunch2.getCost());

    }
}
