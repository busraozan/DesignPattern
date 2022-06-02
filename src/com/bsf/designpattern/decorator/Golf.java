package com.bsf.designpattern.decorator;

public class Golf extends Car{

    public Golf() {
        modelName = "Golf ";
    }

    @Override
    public double price() {
        return 8.0;
    }
}
