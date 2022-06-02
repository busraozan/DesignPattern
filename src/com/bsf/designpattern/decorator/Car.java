package com.bsf.designpattern.decorator;

public abstract class Car {
    String modelName = "Standard Package";

    public String getModelName() {
        return modelName;
    }

    public abstract double price();
}
