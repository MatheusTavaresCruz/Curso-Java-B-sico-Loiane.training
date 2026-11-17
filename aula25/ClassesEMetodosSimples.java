package com.loiane.cursojava.aula25;

public class ClassesEMetodosSimples {

    public static void main(String[] args) {

        Car van = new Car();

        van.mark = "Fiat";
        van.model = "Ducato";
        van.numbPassengers = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        System.out.println(van.mark);
        System.out.println(van.model);

        van.displayAutonomy();
    }
}
