package com.example.krestikinoliki;

/**
 * Created by Хусан on 04.09.2017.
 */

class ViewGame {
    private Model model;

    public ViewGame(Model model) {
        this.model = model;
    }
    public String text(int i, int j) {
        return String.valueOf(model.getResult(i,j));
    }




}
