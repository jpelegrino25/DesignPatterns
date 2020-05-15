package com.julioluis.designpatterns.behavioral.chainresponsability;

public class NumberDTO {

    private Integer number1;
    private Integer number2;
    private ChainType chainType;

    public NumberDTO(Integer number1, Integer number2, ChainType chainType) {
        this.number1 = number1;
        this.number2 = number2;
        this.chainType = chainType;
    }

    public Integer getNumber1() {
        return number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public ChainType getChainType() {
        return chainType;
    }
}
