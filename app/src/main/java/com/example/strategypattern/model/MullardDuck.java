package com.example.strategypattern.model;

import android.content.Context;

import com.example.strategypattern.behavior.FlyWithWings;
import com.example.strategypattern.behavior.Quack;

/**
 * This Object inherits the quackBehavior and flyBehavior from the Duck class
 */
public class MullardDuck extends Duck {
    private Context context;

    public MullardDuck(Context context) {
        this.context = context;
        quackBehavior = new Quack(context); // this object delegates the behavior to the Quack class
        flyBehavior = new FlyWithWings(context); // this object delegates the behavior to the FlyWithWings class
    }
}
