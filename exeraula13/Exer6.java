package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o raio do circulo: ");
        double raio = scan.nextDouble();

        double potencia = raio * raio;

        double resultado = potencia * 3.14;

        System.out.println("A área do circulo é: "+ resultado);


    }


}
