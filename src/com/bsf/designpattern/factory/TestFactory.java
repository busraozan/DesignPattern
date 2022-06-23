package com.bsf.designpattern.factory;

import com.bsf.designpattern.dependencyinjection.IComponent;
import com.bsf.designpattern.dependencyinjection.RenderComponent;

public class TestFactory {

    public static void main(String[] args) {
         Pizza pizza = PizzaStaticFactory.createPizza("cheese");
    }
}
