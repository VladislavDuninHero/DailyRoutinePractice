package com.mydailyroutine.routine.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsRunnerRPG {
    //    1. найти множество всех рас
    //    2. посчитать общее количество золота на карте
    //    3. найти количество объектов по координате x = 2
    //    4. найти третьего по количеству золота на карте
    //    5. посчитать общее количество золота по расе
    //    6. найти второго по количеству золота на каждой клетке
    public static void main(String[] args) {
        Map<Coordinate, List<GameObject>> world = GameWorld.game;

        Set<String> races = world.entrySet()
                .stream()
                .flatMap((el) -> el.getValue()
                        .stream())
                .map((el) -> el.getRace())
                .collect(Collectors.toSet());
        System.out.println("1. найти множество всех рас: " + races);


    }
}
