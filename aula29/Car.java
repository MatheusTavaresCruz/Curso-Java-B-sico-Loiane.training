package com.loiane.cursojava.aula29;

public class Car {
    String mark;
    String model;
    int passengerNumber;
    double fuelCapacity;
    double fuelConsumption;

    Car(){
        System.out.println("Classe Carro foi instanciada");
        passengerNumber = 4;
    }

    Car(String mark_, String model_, int passengerNumber_, double fuelCapacity_ ,double fuelConsumption_){
        mark = mark_;
        model = model_;
        passengerNumber = passengerNumber_;
        fuelCapacity = fuelCapacity_;
        fuelConsumption = fuelConsumption_;
    }

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
