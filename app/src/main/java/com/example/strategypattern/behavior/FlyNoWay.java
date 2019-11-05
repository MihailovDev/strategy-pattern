package com.example.strategypattern.behavior;

import android.content.Context;
import android.widget.Toast;

import com.example.strategypattern.interfaces.FlyBehavior;

/**
 * This is a class that implements a flying behavior.
 * It can also have some fields to indicate state, like wingspan etc.
 */
public class FlyNoWay implements FlyBehavior {
    private Context context;
    public FlyNoWay(Context context){
        this.context = context;
    }

    @Override
    public void fly() {
        Toast.makeText(context,"Nope, not able to fly..", Toast.LENGTH_LONG).show();
    }
}
