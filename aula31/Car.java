package com.loiane.cursojava.aula31;

public class Car {

    public String mark;
    String model;
    int passengerNumber;
    double fuelCapacity;
    private double fuelConsumption;

    public void displayAutonomy(){
        System.out.println("A autonomia do carro é: " + this.fuelCapacity * this.fuelConsumption + " Km");
    }

    public double gainAutonomy(){

        System.out.println("Método obterAutonomia foi chamado.");

        return this.fuelCapacity * this.fuelConsumption;

    }

    private double divideKmByOfCombustiveConsumption(double km){
        return km/this.fuelConsumption;
    }

    public double calculateFuel(double km){
        return this.divideKmByOfCombustiveConsumption(km);


    }
}
