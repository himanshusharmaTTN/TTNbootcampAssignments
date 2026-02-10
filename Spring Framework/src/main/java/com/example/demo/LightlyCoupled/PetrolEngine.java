package com.example.demo.LightlyCoupled;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {

    public void start() {
        System.out.println("Petrol Engine started...");
    }
}
