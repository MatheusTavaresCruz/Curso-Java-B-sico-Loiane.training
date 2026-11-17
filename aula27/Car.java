package com.loiane.cursojava.aula27;

public class Car {
    String mark;
    String model;
    int passengerNumber;
    double fuelCapacity;
    double fuelConsumption;

    void displayAutonomy(){
        System.out.println("A autonomia do carro é: " + fuelCapacity * fuelConsumption + " Km");
    }

    double gainAutonomy(){

        System.out.println("Método obterAutonomia foi chamado.");
        return fuelCapacity * fuelConsumption;

    }

    double calculateFuel(double km){
        double fuelQuantity = km / fuelConsumption;
        return fuelQuantity;


    }

}

