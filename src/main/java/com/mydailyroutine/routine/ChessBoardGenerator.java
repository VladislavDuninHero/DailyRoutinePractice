package com.mydailyroutine.routine;

import java.util.Scanner;

public class ChessBoardGenerator implements RoutineActionDispatcher {
    public char[][] array;
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        int side = scanner.nextInt();

        array = new char[side][side];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = '#';
                    System.out.print(array[i][j]);
                } else if (i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = '#';
                    System.out.print(array[i][j]);
                } else {
                    array[i][j] = ' ';
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
