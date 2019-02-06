package com.teamb.dagger2.dagger;

import com.teamb.dagger2.car.Car;
import com.teamb.dagger2.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void  inject(MainActivity mainActivity);
}
