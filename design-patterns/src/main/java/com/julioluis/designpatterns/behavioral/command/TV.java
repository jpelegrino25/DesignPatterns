package com.julioluis.designpatterns.behavioral.command;

public class TV implements ElectronicDivice {

    private int valume;

    @Override
    public void turnOn() {
        System.out.println("Tv on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv off..");
    }

    @Override
    public void volumeUp() {
        valume++;
        System.out.println("Valume:: "+ valume);
    }

    @Override
    public void volumeDown() {
        valume--;
        System.out.println("Valume:: "+ valume);
    }
}
