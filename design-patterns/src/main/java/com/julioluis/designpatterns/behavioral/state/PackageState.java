package com.julioluis.designpatterns.behavioral.state;

public interface PackageState {
    void updateState(PackageContext context,Transaction transaction);
}
