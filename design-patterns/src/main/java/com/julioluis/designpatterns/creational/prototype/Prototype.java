package com.julioluis.designpatterns.creational.prototype;

public interface Prototype extends Cloneable {
    public Prototype clone() throws CloneNotSupportedException;
}
