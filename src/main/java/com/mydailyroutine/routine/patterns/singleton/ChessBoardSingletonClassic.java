package com.mydailyroutine.routine.patterns.singleton;

public class ChessBoardSingletonClassic {
    private static ChessBoardSingletonClassic INSTANCE = new ChessBoardSingletonClassic();

    private ChessBoardSingletonClassic() {
    }

    public static ChessBoardSingletonClassic getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChessBoardSingletonClassic();
        }

        return INSTANCE;
    }
}
