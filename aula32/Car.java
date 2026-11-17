package com.loiane.cursojava.aula32;

public class Car {

    private String mark;
    private String model;
    private int passengerNumber;
    private double fuelCapacity;
    private double fuelConsumption;

    public String getMark(){
        return this.mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getModel(){

        return this.model;
    }

    public void setModel(String model){

        this.model = model;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
