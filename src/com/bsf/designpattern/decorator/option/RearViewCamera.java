package com.bsf.designpattern.decorator.option;

import com.bsf.designpattern.decorator.Car;
import com.bsf.designpattern.decorator.CarDecorator;

public class RearViewCamera extends CarDecorator {
    private Car car;

    public RearViewCamera(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 0.2;
    }

    @Override
    public String getModelName() {
        return car.getModelName() + " + Add Rear View Camera";
    }
}
