package com.mydailyroutine.routine.streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .map(GameObject::getRace)
                .collect(Collectors.toSet());
        System.out.println("1. найти множество всех рас: " + races);

        BigDecimal charactersGold = BigDecimal.valueOf(
                world.entrySet().stream()
                        .flatMap((el) -> el.getValue().stream())
                        .mapToInt(GameObject::getGold)
                        .sum()
        );

        System.out.println("2. посчитать общее количество золота на карте: " + charactersGold);

        long countOfXCoordinate = world.entrySet().stream()
                .map((el) -> el.getKey())
                .filter((el) -> el.getX() == 2)
                .count();
        System.out.println("3. найти количество объектов по координате x = 2: " + countOfXCoordinate);

        List<GameObject> thirdPlaceForGold = world.entrySet().stream()
                .flatMap((el) -> el.getValue().stream())
                .sorted((a, b) -> b.getGold() - a.getGold())
                .limit(3)
                .min((a, b) -> a.getGold() - b.getGold())
                        .stream().toList();

        System.out.println(
                "4. найти третьего по количеству золота на карте: "
                        + thirdPlaceForGold.get(0).getRace() + ", "
                        + thirdPlaceForGold.get(0).getGold()
        );

    }
}
