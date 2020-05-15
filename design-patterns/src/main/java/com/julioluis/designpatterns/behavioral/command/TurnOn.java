package com.julioluis.designpatterns.behavioral.command;

public class TurnOn implements Command {

    private ElectronicDivice electronicDivice;

    public TurnOn(ElectronicDivice electronicDivice) {
        this.electronicDivice = electronicDivice;
    }

    @Override
    public void execute() {
        electronicDivice.turnOn();
    }

    @Override
    public void undo() {
        electronicDivice.turnOff();
    }
}
