package com.example.strategypattern.model;

import android.util.Log;

import com.example.strategypattern.interfaces.FlyBehavior;
import com.example.strategypattern.interfaces.QuackBehavior;

/**
 * This is a superclass. We use composition. Rather than handling the behaviors itself,
 * the Duck object delegates that to the object referenced by the behavior class.
 */
public abstract class Duck {

    private final static String TAG = Duck.class.getName();
    Duck(){
    }

   // All ducks swim
    public void swim(){
        Log.i(TAG, "swim: Swimming!");
    }

    /**
     * These instance variables hold a reference to a behavior that implements the
     * interfaces at runtime.
     */
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    /**
     * Allows dynamic setting of behavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
