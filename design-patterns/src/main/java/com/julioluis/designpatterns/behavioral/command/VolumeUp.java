package com.julioluis.designpatterns.behavioral.command;

public class VolumeUp implements Command {

    private ElectronicDivice electronicDivice;

    public VolumeUp(ElectronicDivice electronicDivice) {
        this.electronicDivice = electronicDivice;
    }

    @Override
    public void execute() {
        electronicDivice.volumeUp();
    }

    @Override
    public void undo() {
        electronicDivice.volumeDown();
    }
}
