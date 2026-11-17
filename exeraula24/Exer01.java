package com.loiane.cursojava.exeraula24;

public class Exer01 {

    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        lamp.model = "A60";
        lamp.wattage = "Bivolt";
        lamp.warrantyInMonths = 36;
        lamp.voltage =7;
        lamp.color = "Amarela";
        lamp.typeLight = "Amarela";
        lamp.lampshadeType = true;
        lamp.types = new String[5];

        lamp.types [0] = "Abajour";
        lamp.types [1] = "Lampeões";

    }
}
