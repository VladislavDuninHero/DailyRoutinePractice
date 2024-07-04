package com.mydailyroutine.routine.patterns.factory;

import java.util.Map;
import java.util.function.Supplier;

public class Factory {

    Map<Integer, Supplier<Pizza>> pizzas = Map.ofEntries(
            Map.entry(1, MeatPizza::new),
            Map.entry(2, Pepperoni::new)
    );

    public Pizza createPizza(int id) {
        if (!pizzas.containsKey(id)) {
            throw new IllegalArgumentException("Pizza is not defined");
        }

        return pizzas.get(id).get();
    }
}
