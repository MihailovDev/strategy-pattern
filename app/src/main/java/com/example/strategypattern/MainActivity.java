package com.example.strategypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.strategypattern.behavior.FlyNoWay;
import com.example.strategypattern.behavior.FlyWithWings;
import com.example.strategypattern.behavior.Mute;
import com.example.strategypattern.behavior.Quack;
import com.example.strategypattern.model.Duck;
import com.example.strategypattern.model.MullardDuck;


public class MainActivity extends AppCompatActivity {
    private Duck duck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button quack = findViewById(R.id.quack);
        Button mute = findViewById(R.id.mute);
        Button fly = findViewById(R.id.fly);
        Button noFly = findViewById(R.id.no_fly);

        duck = new MullardDuck(this); // context only for toast

        noFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duckNoFly();
            }
        });
        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duckFly();
            }
        });
        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duckMute();
            }
        });
        quack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duckQuack();
            }
        });


    }

    private void duckNoFly() {
        duck.setFlyBehavior(new FlyNoWay(this));
        duck.performFly();

    }

    private void duckFly() {
        duck.setFlyBehavior(new FlyWithWings(this));
        duck.performFly();
    }

    private void duckQuack() {
        duck.setQuackBehavior(new Quack(this));
        duck.performQuack();
    }

    private void duckMute() {
        duck.setQuackBehavior(new Mute(this));
        duck.performQuack();
    }

}
