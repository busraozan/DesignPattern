package com.bsf.designpattern.decorator;

public class Passat extends Car{

    public Passat(){
        modelName = "Passat ";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
