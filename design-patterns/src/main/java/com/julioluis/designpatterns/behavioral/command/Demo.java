package com.julioluis.designpatterns.behavioral.command;

public class Demo {

    public static void main(String[] args) {

        TV tv=new TV();
        Command command=new TurnOn(tv);
        ButtonPress buttonPress=new ButtonPress(command);
        buttonPress.press();
        buttonPress.pressUndo();

        //-----------------------------------------

        command=new VolumeUp(tv);
        buttonPress=new ButtonPress(command);
        buttonPress.press();
        buttonPress.press();
        buttonPress.press();
        buttonPress.pressUndo();


    }
}
