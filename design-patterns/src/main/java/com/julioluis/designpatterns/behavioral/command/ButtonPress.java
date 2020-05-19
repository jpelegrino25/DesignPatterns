package com.julioluis.designpatterns.behavioral.command;

public class ButtonPress {

    private Command command;

    public ButtonPress(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
