package com.julioluis.designpatterns.behavioral.strategy;

public class Calculator {

    private MathStrategy mathStrategy;

    public Calculator(MathStrategy mathStrategy) {
        this.mathStrategy = mathStrategy;
    }

    public double execute(Request request) {
        return mathStrategy.calculate(request);
    }
}
