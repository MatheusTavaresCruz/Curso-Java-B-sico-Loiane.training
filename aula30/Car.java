package com.loiane.cursojava.aula30;

public class Car {

    String mark;
    String model;
    int passengerNumber;
    double fuelCapacity;
    double fuelConsumption;

    public Car(String mark, String model, int passengerNumber, double fuelCapacity, double fuelConsumption) {
        this.mark = mark;
        this.model = model;
        this.passengerNumber = passengerNumber;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {}

    public Car(String mark, String model, int passengerNumber) {
        this.mark = mark;
        this.model = model;
        this.passengerNumber = passengerNumber;
        System.out.println("Chamando construtor com 3 parâmetros");

    }

    public Car(String mark, String model) {
     this(mark, model, 10);
     System.out.println("Chamando construtor com 2 parâmetros");
    }


    void displayAutonomy(){
        System.out.println("A autonomia do carro é: " + this.fuelCapacity * this.fuelConsumption + " Km");
    }

    double gainAutonomy(){

        System.out.println("Método obterAutonomia foi chamado.");

        return this.fuelCapacity * this.fuelConsumption;

    }

    double calculateFuel(double km){
        double fuelQuantity = km / this.fuelConsumption;
        return fuelQuantity;


    }
}
