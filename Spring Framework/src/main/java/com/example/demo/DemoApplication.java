package com.example.demo;

import com.example.demo.TightlyCoupled.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		System.out.println("-----> Tighly Coupled -----");
		Car tighlyCoupled= new Car();
		tighlyCoupled.drive();
		System.out.println("-----> Loosely Coupled -----");
		com.example.demo.LightlyCoupled.Car lightlyCOupled= context.getBean(com.example.demo.LightlyCoupled.Car.class);
		lightlyCOupled.drive();

	}


}
