package com.julioluis.designpatterns.behavioral.state;

import java.util.Objects;

public class PackageContext {

    private PackageState currentState;

    public PackageContext(PackageState currentState) {
        this.currentState = currentState;
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public void update(Transaction transaction){
        currentState.updateState(this,transaction);
    }
}
