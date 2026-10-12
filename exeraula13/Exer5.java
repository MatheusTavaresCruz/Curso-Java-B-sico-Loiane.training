package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite quantos metros: ");
        double metro = scan.nextDouble();

        double converter = metro*100;

        System.out.println("A quantidade de: "+ metro+ " metros " + "Corresponde a: "+converter+ " centimetros");
    }
}
