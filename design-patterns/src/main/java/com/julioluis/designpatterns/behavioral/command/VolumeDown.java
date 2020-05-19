package com.julioluis.designpatterns.behavioral.command;

public class VolumeDown implements Command {

    private ElectronicDivice electronicDivice;

    public VolumeDown(ElectronicDivice electronicDivice) {
        this.electronicDivice = electronicDivice;
    }

    @Override
    public void execute() {
        electronicDivice.volumeDown();
    }

    @Override
    public void undo() {
        electronicDivice.volumeUp();
    }
}
