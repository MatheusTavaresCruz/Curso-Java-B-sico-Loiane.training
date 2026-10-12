package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();

        double transformar = 5* (farenheit-32) / 9;

        System.out.println("A temperatura em Celsius é: "+ transformar);
    }
}
