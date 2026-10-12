package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua primeira nota:");
        double nota = scan.nextDouble();

        System.out.println("Entre com sua segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota + nota2) /2;

        if (media == 10){

            System.out.println("Aprovado!");

        }else if (media >= 7){

            System.out.println("Aprovado com Distinção");

        }else {

            System.out.println("Reprovado!");

        }

    }
}
