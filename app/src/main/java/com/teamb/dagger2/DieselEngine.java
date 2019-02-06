package com.teamb.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "car";


    @Inject
    public DieselEngine() {
    }

    @Override
    public void Start() {
        Log.i(TAG, " Diesel Engine Started... ");
    }
}
