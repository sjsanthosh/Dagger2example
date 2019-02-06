package com.teamb.dagger2;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
   abstract Engine provideEngine(DieselEngine engine) ;

}
