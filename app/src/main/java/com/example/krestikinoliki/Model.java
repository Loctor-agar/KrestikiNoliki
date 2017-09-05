package com.example.krestikinoliki;

/**
 * Created by Хусан on 04.09.2017.
 */

class Model {

    private char table [][];
    private int[][] winnerCooordinates;
    private boolean tableFull;

    public Model() {
        table = new char[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                table [i][j] = 'e';
            }
        }
    }


    public char getResult(int i,int j) {
        return table[i][j];
    }

    public char[][] getTable() {
        return table;
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public boolean isEmpty(int i, int j) {
        return table[i][j] == 'e';

    }



    public void writeTurn(int i, int j, char xo) {
        table [i][j] = xo;
    }

    public void setWinnerCooordinates(int[][] winnerCooordinates, char win) {
        this.winnerCooordinates = winnerCooordinates;
    }

    public int[][] getWinnerCooordinates() {
        return winnerCooordinates;
    }

    public boolean isTableFull() {
        return tableFull;
    }

    public void setTableFull(boolean tableFull) {
        this.tableFull = tableFull;
    }
}
