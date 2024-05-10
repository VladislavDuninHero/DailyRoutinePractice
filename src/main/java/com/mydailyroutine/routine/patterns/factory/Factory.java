package com.mydailyroutine.routine.patterns.factory;

public class Factory {
    public Pizza createPizza(PizzaType pizzaType) {

        Pizza pizza = switch(pizzaType) {
            case PEPPERONI -> new Pepperoni();
            case MEATPIZZA -> new MeatPizza();
            case UNKNOWN -> throw new IllegalArgumentException();
        };

        return pizza;
    }
}
