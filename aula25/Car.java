package com.loiane.cursojava.aula25;

public class Car {

    String mark;
    String model;

    int numbPassengers;
    double fuelCapacity;
    double fuelConsumption;

    void displayAutonomy(){
        System.out.println("A autonomia do carro é: " + fuelCapacity * fuelConsumption + " KM");

    }

}
