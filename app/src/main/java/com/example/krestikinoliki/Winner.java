package com.example.krestikinoliki;

import java.util.Arrays;

/**
 * Created by Хусан on 04.09.2017.
 */

class Winner {

    private int[][] winnerCoordinates;
    private char[] xLine = {'x', 'x', 'x'};
    private char[] yLine = {'y', 'y', 'y'};
    private char[][] table;
    char win =  ' ';

    public boolean check(Model model){
        table = model.getTable();

        for(int i=0; i<3; i++){

            if (Arrays.equals(table[i], xLine) || Arrays.equals(table[i], yLine)) {
                winnerCoordinates = new int[][]{{i, 0}, {i, 1}, {i, 2}};
                win = table[i][0];
                return true;
            }

        }
        return false;
    }

    public int[][] giveWinnersCoordinats() {
        return winnerCoordinates;
    }

    public char win() {
        return  win;
    }
}
