package com.mydailyroutine.routine.patterns.factory;

public class Pizzeria {
    private final Factory pizzaFactory;

    public Pizzeria(Factory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza run(PizzaType typeOfPizza) {
        Pizza yourPizza = pizzaFactory.createPizza(typeOfPizza);

        return yourPizza;
    }
}
