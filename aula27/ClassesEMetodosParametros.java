package com.loiane.cursojava.aula27;

public class ClassesEMetodosParametros {

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

        double fuelQuantity10 = van.calculateFuel(10);
        double fuelQuantity15 = van.calculateFuel(15);

        System.out.println("A quantidade de combustivel 10: "+ fuelQuantity10);
        System.out.println("A quantidade de combustivel 10: "+ fuelQuantity15);

    }
}
