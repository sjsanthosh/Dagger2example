package com.teamb.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.teamb.dagger2.DaggerCarComponent;
import com.teamb.dagger2.R;
import com.teamb.dagger2.car.Car;
import com.teamb.dagger2.dagger.CarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //inject feilds  should be public as
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CarComponent component = DaggerCarComponent.create();
      //for deild injection
        component.inject(this);

        //for constructor Injection
        //car = component.getCar();
        car.drive();
    }
}
