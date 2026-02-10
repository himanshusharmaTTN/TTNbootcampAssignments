package com.example.demo.TightlyCoupled;

import org.springframework.stereotype.Component;

public class Car {
    private Engine engine;
    private PetrolEngine pe;

    public Car() {
        engine = new Engine();
        pe= new PetrolEngine();

    }

    public void drive() {
        engine.start();
        pe.start();
        System.out.println("Car is running (Tightly Coupled)");
    }
}
