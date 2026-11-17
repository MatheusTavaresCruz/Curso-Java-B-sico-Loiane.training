package com.loiane.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {

        Car van = new Car();

        van.mark = "Fiat";
        van.model = "Ducato";
        van.numbPassengers = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        System.out.println(van.mark);
        System.out.println(van.model);

        Car fusca = new Car();

        fusca.mark = "Volkswagen";
        fusca.model = "Fusca";
        fusca.numbPassengers = 4;
        fusca.fuelCapacity = 30;
        fusca.fuelConsumption = 0.15;

        System.out.println(fusca.mark);
        System.out.println(fusca.model);

    }
}
