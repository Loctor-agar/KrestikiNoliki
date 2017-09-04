package com.example.krestikinoliki;

/**
 * Created by Хусан on 04.09.2017.
 */

class ControllerGame {
    boolean gameActive = true;
    private Model model;
    private char xo = 'x';
    private int[] coords[6];

    public ControllerGame(Model model) {
        this.model = model;
    }

    public void turn(int i, int j) {
        if(gameActive){
            if(model.isEmpty(i,j)){
                model.writeTurn(i,j,xo);
                if (xo=='x'){
                    xo = 'o';
                }else{
                    xo='x';
                }
                if(winner.chek()){
                    coords[] = winner.giveWinnersCoordinats();
                    model.setWinnerCooordinates(coords[]);
                    gameActive = false;

                }
                else if(model.isTableFull()){
                    gameActive = false;
                }
            }
        }

    }
}
