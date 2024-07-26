package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.HashMap;
import java.util.Map;

public class DesignParkingSystem implements AlgosActionDispatcher {

    private final int big;

    private final int medium;

    private final int small;

    private Map<String, Integer> carTypes = Map.ofEntries(
            Map.entry("big", 1),
            Map.entry("medium", 2),
            Map.entry("small", 3)
    );

    @Override
    public void execute() {
        DesignParkingSystem designParkingSystem = new DesignParkingSystem(1, 2, 4);

        addCar(1);
        addCar(2);
        addCar(3);
        addCar(1);
    }

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        return false;
    }
}
