package com.teamb.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    @Inject
    public Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.wheels = wheels;
    }


    @Inject
    void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.Start();
        Log.d(TAG, "driving... ");
    }
}
