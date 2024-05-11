package com.mydailyroutine.routine.streams;

import java.util.List;
import java.util.Map;

public class GameWorld {
    public static final Map<Coordinate, List<GameObject>> game =
            Map.ofEntries(
                    Map.entry(new Coordinate(1, 1), List.of(new GameObject(200, "elf"), new GameObject(205, "gnome"))),
                    Map.entry(new Coordinate(2, 1), List.of(new GameObject(400, "dwarf"), new GameObject(4200, "ork"))),
                    Map.entry(new Coordinate(3, 1), List.of(new GameObject(350, "dwarf"), new GameObject(355, "troll"))),
                    Map.entry(new Coordinate(1, 2), List.of(new GameObject(2400, "human"), new GameObject(325, "human"))),
                    Map.entry(new Coordinate(2, 2), List.of(new GameObject(5400, "human"), new GameObject(2300, "ork"))),
                    Map.entry(new Coordinate(3, 2), List.of(new GameObject(1350, "elf"), new GameObject(6050, "gnome"))),
                    Map.entry(new Coordinate(1, 3), List.of(new GameObject(7400, "gnome"), new GameObject(300, "troll"))),
                    Map.entry(new Coordinate(2, 3), List.of(new GameObject(2356, "human"), new GameObject(1600, "ork"))),
                    Map.entry(new Coordinate(3, 3), List.of(new GameObject(1350, "elf"), new GameObject(4000, "dwarf")))
            );

}
