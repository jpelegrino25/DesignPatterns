package com.julioluis.designpatterns.behavioral.chainresponsability;

public class Substraction implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain=chain;
    }

    @Override
    public void calculate(NumberDTO request) {
        if(request.getChainType().equals(ChainType.SUBSTRACT)) {
            System.out.println(request.getNumber1() +" - "+ request.getNumber2() +
                    " = "+ (request.getNumber1()-request.getNumber2()) );
        }else {
            nextChain.calculate(request);
        }
    }
}
