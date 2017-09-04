package com.example.krestikinoliki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button one_button;
    private Button two_button;
    private Button three_button;
    private Button four_button;
    private Button five_button;
    private Button six_button;
    private Button seven_button;
    private Button eight_button;
    private Button nine_button;

    private ControllerGame controller;
    private ViewGame viewGame;
    private Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        update();

        one_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controller.turn(0,0);
                update();
            }
        });
        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(0,1);
                update();
            }
        });
        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                controller.turn(0,2);
                update();
            }
        });
        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(1,0);
                update();
            }
        });
        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(1,1);
                update();
            }
        });
        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(1,2);
                update();
            }
        });
        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(2,0);
                update();
            }
        });
        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(2,1);
                update();
            }
        });
        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.turn(2,2);
                update();
            }
        });
    }

    private void update() {
        one_button.setText(viewGame.text(0,0));
        two_button.setText(viewGame.text(0,1));
        three_button.setText(viewGame.text(0,2));
        four_button.setText(viewGame.text(1,0));
        five_button.setText(viewGame.text(1,1));
        six_button.setText(viewGame.text(1,2));
        seven_button.setText(viewGame.text(2,0));
        eight_button.setText(viewGame.text(2,1));
        nine_button.setText(viewGame.text(2,2));
    }

    private void init() {
        one_button = (Button)findViewById(R.id.one_button);
        two_button= (Button)findViewById(R.id.two_button);
        three_button = (Button)findViewById(R.id.three_button);
        four_button =(Button)findViewById(R.id.four_button);
        five_button = (Button)findViewById(R.id.five_button);
        six_button = (Button)findViewById(R.id.six_button);
        seven_button = (Button)findViewById(R.id.seven_button);
        eight_button = (Button)findViewById(R.id.eight_button);
        nine_button = (Button)findViewById(R.id.nine_button);

        model = new Model();
        controller = new ControllerGame(model);
        viewGame = new ViewGame(model);
    }
}
