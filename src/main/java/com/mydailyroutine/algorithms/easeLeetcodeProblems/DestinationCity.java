package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity implements AlgosActionDispatcher {

    @Override
    public void execute() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<>(List.of("London", "New York")));
        paths.add(new ArrayList<>(List.of("New York","Lima")));
        paths.add(new ArrayList<>(List.of("Lima","Sao Paulo")));

        System.out.println(destCity(paths));
    }

    private String destCity(List<List<String>> paths) {

        return null;
    }
}
