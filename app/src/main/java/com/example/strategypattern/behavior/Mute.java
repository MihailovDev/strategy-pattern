package com.example.strategypattern.behavior;

import android.content.Context;
import android.widget.Toast;

import com.example.strategypattern.interfaces.QuackBehavior;

/**
 * This is a class that implements quack behavior.
 * It can also have fields to indicate state, like volume etc.
 */
public class Mute implements QuackBehavior {
    private Context context;

    public Mute(Context context) {
        this.context = context;
    }

    @Override
    public void quack() {
        Toast.makeText(context, "I am mute.", Toast.LENGTH_LONG).show();
    }
}
