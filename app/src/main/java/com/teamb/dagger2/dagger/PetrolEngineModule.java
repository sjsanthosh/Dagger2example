package com.teamb.dagger2.dagger;


import com.teamb.dagger2.car.Engine;
import com.teamb.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine provideEngine(PetrolEngine engine) ;

}
