package com.bsf.designpattern.factory;

public class PizzaClient {

    private PizzaFactory pizzaFactory;

    public PizzaClient(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
