package com.mydailyroutine.algorithms.mediumLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysAndRooms implements AlgosActionDispatcher {

    @Override
    public void execute() {
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );

        boolean canVisitAllRooms = canVisitAllRooms(rooms);

        System.out.println(canVisitAllRooms);
    }

    private boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, List<Integer>> keysMap = new HashMap<>();
        List<Integer> keys = new ArrayList<>();

        boolean canVisitAll = false;

        for (int i = 0; i < rooms.size(); i++) {
            keysMap.put(i + 1, rooms.get(i));
        }

        System.out.println(keys);

        for (Map.Entry<Integer, List<Integer>> entry : keysMap.entrySet()) {
            if (entry.getKey() == 1) {
                keys.addAll(entry.getValue());
                continue;
            }

            if (!keys.contains(entry.getKey())) {
                canVisitAll = false;
                break;
            }

            keys.addAll(entry.getValue());

            canVisitAll = true;
        }

        return canVisitAll;
    }

}
