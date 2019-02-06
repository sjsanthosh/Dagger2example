package com.teamb.dagger2.dagger;


import com.teamb.dagger2.car.Rims;
import com.teamb.dagger2.car.Tires;
import com.teamb.dagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;


// module for wheels
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.Inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
