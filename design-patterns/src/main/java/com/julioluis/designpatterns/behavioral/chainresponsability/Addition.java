package com.julioluis.designpatterns.behavioral.chainresponsability;

public class Addition implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain=chain;
    }

    @Override
    public void calculate(NumberDTO request) {
        if(request.getChainType().equals(ChainType.ADD)) {
            System.out.println(request.getNumber1() +" + "+ request.getNumber2() +
            " = "+ (request.getNumber1()+request.getNumber2()) );
        }else {
            nextChain.calculate(request);
        }
    }
}
