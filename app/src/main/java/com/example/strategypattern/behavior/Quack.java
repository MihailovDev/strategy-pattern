package com.example.strategypattern.behavior;

import android.content.Context;
import android.widget.Toast;

import com.example.strategypattern.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    private Context context;

    public Quack(Context context) {
        this.context = context;
    }

    @Override
    public void quack() {
        Toast.makeText(context, "Quack! Quack!", Toast.LENGTH_LONG).show();
    }
}
