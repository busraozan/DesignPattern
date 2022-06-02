package com.bsf.designpattern.decorator;

import com.bsf.designpattern.decorator.option.Paint;
import com.bsf.designpattern.decorator.option.Sunroof;
import com.bsf.designpattern.decorator.option.Wheel;

public class TestDecorator {

    public static void main(String[] args) {
        Car passat = new Passat();
        passat = new Paint(passat);
        passat = new Wheel(passat);
        System.out.println(passat.getModelName()+ ", Price: " + String.format("%.2f", passat.price()) );

        Car golf = new Golf();
        golf = new Paint(golf);
        golf = new Sunroof(golf);
        System.out.println(golf.getModelName() + ", Price: " + String.format("%.2f", golf.price()) );
    }
}
