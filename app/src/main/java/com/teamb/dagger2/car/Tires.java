package com.teamb.dagger2.car;

import android.util.Log;

public class Tires {

    //we don't own this class and comes form third party lib, so cant use @Inject

    private static final String TAG = "car";

    public void Inflate() {
        Log.i(TAG, "Inflated.... ");
    }

}
