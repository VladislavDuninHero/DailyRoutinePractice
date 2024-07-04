package com.mydailyroutine.routine.patterns.factory;

public class Pizzeria {
    private final Factory pizzaFactory;

    public Pizzeria(Factory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza run(int pizzasId) {
        Pizza yourPizza = pizzaFactory.createPizza(pizzasId);

        return yourPizza;
    }
}
