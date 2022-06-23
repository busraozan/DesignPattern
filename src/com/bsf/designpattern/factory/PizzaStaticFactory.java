package com.bsf.designpattern.factory;

public class PizzaStaticFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new CheesePizza();
        else if(type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        return pizza;
    }
}
