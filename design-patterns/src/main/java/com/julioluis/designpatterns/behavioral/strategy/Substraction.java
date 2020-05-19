package com.julioluis.designpatterns.behavioral.strategy;

public class Substraction implements MathStrategy {
    @Override
    public double calculate(Request request) {
        return request.getNum1() - request.getNum2();
    }
}
