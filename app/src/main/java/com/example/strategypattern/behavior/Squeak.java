package com.example.strategypattern.behavior;

import android.content.Context;

import android.widget.Toast;

import com.example.strategypattern.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    private Context context;

    Squeak(Context context) {
        this.context = context;
    }

    @Override
    public void quack() {
        Toast.makeText(context, "Squeak! Squeak!", Toast.LENGTH_LONG).show();
    }
}
