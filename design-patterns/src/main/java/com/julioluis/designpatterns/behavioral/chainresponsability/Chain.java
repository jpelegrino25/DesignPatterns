package com.julioluis.designpatterns.behavioral.chainresponsability;

public interface Chain {
    public void setNextChain(Chain chain);
    public void calculate(NumberDTO request);
}
