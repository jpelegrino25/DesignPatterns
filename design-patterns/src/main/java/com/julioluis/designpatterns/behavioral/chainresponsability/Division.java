package com.julioluis.designpatterns.behavioral.chainresponsability;

public class Division implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain=chain;
    }

    @Override
    public void calculate(NumberDTO request) {
        if(request.getChainType().equals(ChainType.DIVISION)) {
            System.out.println(request.getNumber1() +" / "+ request.getNumber2() +
                    " = "+ (request.getNumber1()/request.getNumber2()) );
        }else {
            System.out.println("Only Add, subs, mult and Div are allowed");
        }
    }
}
