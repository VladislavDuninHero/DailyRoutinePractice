package com.mydailyroutine.routine.streams.mmorpg;

import java.math.BigDecimal;
import java.util.*;
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

        //1. найти множество всех рас
        findSetOfAllRaces(world);

        //2. посчитать общее количество золота на карте
        getAllGoldInTheMap(world);

        //3. найти количество объектов по координате x = 2
        countOfObjectOnX(world);

        //4. найти третьего по количеству золота на карте
        findThirdCharacterWithMaxGold(world);

        //5. посчитать общее количество золота по расе
        calculateAllGoldForRaces(world);

        //6. найти второго по количеству золота на каждой клетке
        findSecondCharacterWithMaxGold(world);

    }

    public static void findSetOfAllRaces(Map<Coordinate, List<GameObject>> world) {
        Set<String> races = world.values()
                .stream()
                .flatMap(Collection::stream)
                .map(GameObject::getRace)
                .collect(Collectors.toSet());
        System.out.println("1. найти множество всех рас: " + races);
    }

    public static void getAllGoldInTheMap(Map<Coordinate, List<GameObject>> world) {
        BigDecimal charactersGold = BigDecimal.valueOf(
                world.values().stream()
                        .flatMap(Collection::stream)
                        .mapToInt(GameObject::getGold)
                        .sum()
        );

        System.out.println("2. посчитать общее количество золота на карте: " + charactersGold);
    }

    public static void countOfObjectOnX(Map<Coordinate, List<GameObject>> world) {
        long countOfXCoordinate = world.entrySet().stream()
                .filter((el) -> el.getKey().getX() == 2)
                .map(Map.Entry::getValue)
                .mapToLong(List::size)
                .sum();

        System.out.println("3. найти количество объектов по координате x = 2: " + countOfXCoordinate);
    }

    public static void findThirdCharacterWithMaxGold(Map<Coordinate, List<GameObject>> world) {
        List<GameObject> thirdPlaceForGold = world.values().stream()
                .flatMap(Collection::stream)
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

    public static void calculateAllGoldForRaces(Map<Coordinate, List<GameObject>> world) {
        Map<String, Integer> allGoldWithRaces = world.values().stream()
                .flatMap(Collection::stream)
                .collect(
                        Collectors.groupingBy(GameObject::getRace, Collectors.summingInt(GameObject::getGold))
                );

        System.out.println("5. посчитать общее количество золота по расе: " + allGoldWithRaces);
    }

    public static void findSecondCharacterWithMaxGold(Map<Coordinate, List<GameObject>> world) {
        Map<Coordinate, GameObject> secondCharacterOnCoordinate = world.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        coordinateListEntry -> coordinateListEntry.getValue()
                                .stream()
                                .sorted(Comparator.comparingInt(GameObject::getGold).reversed())
                                .skip(1)
                                .findFirst()
                                .orElseThrow()
                ));


        System.out.print("6. найти второго по количеству золота на каждой клетке: ");
        secondCharacterOnCoordinate.entrySet()
                .forEach(el -> System.out.println(
                        "Coordinate: " +el.getKey().getX() + "." + el.getKey().getY()
                                + "; Race and Gold: " + el.getValue().getRace() + ":" + el.getValue().getGold() + ", "));
    }

}
