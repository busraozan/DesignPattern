package com.bsf.designpattern.decorator.option;

import com.bsf.designpattern.decorator.Car;
import com.bsf.designpattern.decorator.CarDecorator;

public class Wheel extends CarDecorator {

    private Car car;

    public Wheel(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 0.6;
    }

    @Override
    public String getModelName() {
        return car.getModelName() + " + 17' ventura wheels ";
    }
}
