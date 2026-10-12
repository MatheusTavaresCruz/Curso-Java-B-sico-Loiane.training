package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double transformar = 1.8 * celsius+32;

        System.out.println("A temperatura em Farenheit é: "+ transformar);
    }
}
