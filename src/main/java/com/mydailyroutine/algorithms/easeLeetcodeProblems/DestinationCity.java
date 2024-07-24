package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.*;

public class DestinationCity implements AlgosActionDispatcher {

    //Description
    //You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
    //
    //It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
    //
    //
    //
    //Example 1:
    //
    //Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
    //Output: "Sao Paulo"
    //Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

    @Override
    public void execute() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<>(List.of("London", "New York")));
        paths.add(new ArrayList<>(List.of("New York","Lima")));
        paths.add(new ArrayList<>(List.of("Lima","Sao Paulo")));

        System.out.println(destCity(paths));
    }

    private String destCity(List<List<String>> paths) {

        Map<String, String> mapOfCities = new HashMap<>();

        for (List<String> path : paths) {
            mapOfCities.put(path.get(0), path.get(1));
        }

        String city = paths.get(0).get(0);

        while (mapOfCities.containsKey(city)) {
            city = mapOfCities.get(city);
        }

        return city;
    }
}
