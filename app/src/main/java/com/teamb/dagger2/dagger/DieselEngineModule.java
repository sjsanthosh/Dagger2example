package com.teamb.dagger2.dagger;


import com.teamb.dagger2.car.DieselEngine;
import com.teamb.dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
   abstract Engine provideEngine(DieselEngine engine) ;

}
