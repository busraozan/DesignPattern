package com.bsf.designpattern.decorator.option;

import com.bsf.designpattern.decorator.Car;
import com.bsf.designpattern.decorator.CarDecorator;

public class Paint extends CarDecorator {

    private Car car;

    public Paint(Car car){
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 0.2;
    }

    @Override
    public String getModelName() {
        return car.getModelName() + " + Red Color ";
    }
}
