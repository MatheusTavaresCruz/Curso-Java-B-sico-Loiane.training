package com.loiane.cursojava.aula29;

public class CarTest {

    public static void main(String[] args) {

        Car van = new Car();
        van.mark = "Fiat";
        van.model = "Ducato";
        //van.passengerNumber = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        System.out.println(van.passengerNumber);

        Car van2 = new Car("Fiat", "Ducato", 10 , 100, 0.2);


        System.out.println(van2.mark);
        System.out.println(van2.model);
        System.out.println(van2.passengerNumber);
        System.out.println(van2.fuelCapacity);
        System.out.println(van2.fuelConsumption);
    }
}
