package com.julioluis.designpatterns.behavioral.chainresponsability;

public class Demo {

    public static void main(String[] args) {

        Chain add=new Addition();
        Chain subs=new Substraction();
        Chain div=new Division();
        Chain mult=new Multiplication();

        add.setNextChain(subs);
        subs.setNextChain(mult);
        mult.setNextChain(div);

        NumberDTO numberDTO=new NumberDTO(20,10,ChainType.DIVISION);
        add.calculate(numberDTO);

    }
}
