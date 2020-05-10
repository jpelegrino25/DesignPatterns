package com.julioluis.designpatterns.structural.adapter;

public class Adapter extends BankDetail implements Target {

    @Override
    public void accountDetail() {
        this.setAccount("8999");
        this.setBankName("Banco Popular");
        this.setPlaceHolder("Jorge Luis Guerrero");
    }

    @Override
    public String getCreditCard() {
        return this.getBankName() +"\n" +
                this.getPlaceHolder() +"\n"+
                this.getAccount();
    }


}
