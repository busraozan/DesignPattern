package com.bsf.designpattern.decorator.option;

import com.bsf.designpattern.decorator.Car;
import com.bsf.designpattern.decorator.CarDecorator;

public class Sunroof extends CarDecorator {
    private Car car;

    public Sunroof(Car car){
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 1.2;
    }

    @Override
    public String getModelName() {
        return car.getModelName() + " + Sunroof added ";
    }
}
