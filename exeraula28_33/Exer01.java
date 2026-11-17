package com.loiane.cursojava.exeraula28_33;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Lamp lamp = new Lamp(false);

        System.out.println("Deseja acender a Lampada?");
        Boolean select = scan.nextBoolean();


        lamp.setTurnOff(select);
        lamp.setTurnOn(select);

        if(lamp.TurnOnn(select)){
            System.out.println("Lampada foi ligada");
        }else if (lamp.getTurnOff()){
            System.out.println("Lampada desligada");
        }






    }
}
