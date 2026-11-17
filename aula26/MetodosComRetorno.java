package com.loiane.cursojava.aula26;

public class MetodosComRetorno {

    public static void main(String[] args) {

        Car van = new Car();

        van.mark = "Fiat";
        van.model = "Ducato";
        van.passengerNumber = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        double autonomy = van.gainAutonomy();

        System.out.println("A autonomia do carro é: "+ autonomy);
        System.out.println("A autonomia do carro é: "+ van.gainAutonomy());
    }
}
