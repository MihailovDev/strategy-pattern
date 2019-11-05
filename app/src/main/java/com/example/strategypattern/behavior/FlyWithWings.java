package com.example.strategypattern.behavior;

import android.content.Context;
import android.widget.Toast;

import com.example.strategypattern.interfaces.FlyBehavior;

/**
 * This is a class that implements a flying behavior.
 * It can also have some fields to indicate state, like wingspan etc.
 */
public class FlyWithWings implements FlyBehavior {
    private Context context;

    public FlyWithWings(Context context) {
        this.context = context;
    }

    public void fly() {
        Toast.makeText(context, "Flying with wings.", Toast.LENGTH_LONG).show();
    }

}
