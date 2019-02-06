package com.teamb.dagger2;

import javax.inject.Inject;

public class Wheels {
    //we don't own this class and comes formthird party lib, so cant use @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
