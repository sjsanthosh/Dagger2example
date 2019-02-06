package com.teamb.dagger2.car;

import android.util.Log;

import com.teamb.dagger2.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "car";


    @Inject
    public PetrolEngine() {
    }

    @Override
    public void Start() {
        Log.i(TAG, " Petrol engine Started ...");
    }
}
