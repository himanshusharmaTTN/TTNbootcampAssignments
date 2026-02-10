package com.example.demo.LightlyCoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;
    public Car(@Autowired @Qualifier("petrolEngine") Engine e)
    {
        this.engine=e;
    }
    public void drive()
    {
        engine.start();
        System.out.println("Petrol hi Petrolllll...");
    }
}
