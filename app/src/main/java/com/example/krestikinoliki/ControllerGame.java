package com.example.krestikinoliki;

/**
 * Created by Хусан on 04.09.2017.
 */

class ControllerGame {
    boolean gameActive = true;
    private Model model;
    private char xo = 'x';
    private int[][] coords;
    private Winner winner;

    public ControllerGame(Model model) {
        this.model = model;
        winner = new Winner();
    }

    public void turn(int i, int j) {
        if(gameActive){
            if(model.isEmpty(i,j)){
                model.writeTurn(i,j,xo);
                if (xo=='x') xo = 'o';
                else xo='x';
                if(winner.check(model)){
                    coords = winner.giveWinnersCoordinats();
                    model.setWinnerCooordinates(coords, winner.win());
                    gameActive = false;

                }
                else if(model.isTableFull()){
                    gameActive = false;
                }
            }
        }

    }
}
