package com.teamb.dagger2;

import android.util.Log;

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
