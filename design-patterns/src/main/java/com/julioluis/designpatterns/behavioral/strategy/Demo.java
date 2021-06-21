package com.julioluis.designpatterns.behavioral.strategy;

public class Demo {
    enum FormatType {
        HTML,PLAIN
    }

    public static void main(String[] args) {

        Request request=new Request(23,10);

        Addition add=new Addition();
        Substraction subs=new Substraction();
        Multiplication multiply=new Multiplication();

        double result=add.calculate(request);
        System.out.println("Add:: "+ result);

        result=subs.calculate(request);
        System.out.println("Substraction:: "+ result);

        result=multiply.calculate(request);
        System.out.println("Multiplication:: "+ result);

        System.out.println(FormatType.HTML.toString().equals("HTML"));


    }
}
