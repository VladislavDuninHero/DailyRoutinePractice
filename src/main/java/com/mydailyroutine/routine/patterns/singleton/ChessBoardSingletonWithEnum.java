package com.mydailyroutine.routine.patterns.singleton;

public enum ChessBoardSingletonWithEnum {
    INSTANCE(new int[5][5]);

    private final int[][] array;

    ChessBoardSingletonWithEnum(int[][] array) {
        this.array = array;
    }

    public static ChessBoardSingletonWithEnum getInstance() {
        return INSTANCE;
    }
}
