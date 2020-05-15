package com.julioluis.designpatterns.behavioral.command;

public class TurnOff implements Command {

    private ElectronicDivice electronicDivice;

    public TurnOff(ElectronicDivice electronicDivice) {
        this.electronicDivice = electronicDivice;
    }

    @Override
    public void execute() {
        electronicDivice.turnOff();
    }

    @Override
    public void undo() {
        electronicDivice.turnOn();
    }
}
