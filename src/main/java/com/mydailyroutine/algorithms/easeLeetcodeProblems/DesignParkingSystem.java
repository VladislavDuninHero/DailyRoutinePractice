package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignParkingSystem implements AlgosActionDispatcher {

    private int big;

    private int medium;

    private int small;

    private final Map<Integer, String> carTypes = Map.ofEntries(
            Map.entry(1, "big"),
            Map.entry(2, "medium"),
            Map.entry(3, "small")
    );

    @Override
    public void execute() {
        DesignParkingSystem designParkingSystem = new DesignParkingSystem(0, 0, 2);

        List<Boolean> results = List.of(
                addCar(1),
                addCar(2),
                addCar(3)
        );

        System.out.println(results);
    }

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carTypes.get(carType).equals("big")) {
            if (this.big > 0) {
                this.big -= 1;
                return true;
            }
        }

        if (carTypes.get(carType).equals("medium")) {
            if (this.medium > 0) {
                this.medium -= 1;
                return true;
            }
        }

        if (carTypes.get(carType).equals("small")) {
            if (this.small > 0) {
                this.small -= 1;
                return true;
            }
        }

        return false;
    }
}
