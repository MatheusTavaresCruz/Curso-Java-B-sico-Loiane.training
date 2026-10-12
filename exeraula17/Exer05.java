package com.loiane.cursojava.exeraula17;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validar = false;
        double habitantesA;
        double habitantesB;
        int contador;
        double crescimentoA;
        double crescimentoB;

        do {

            System.out.println("Entre com a população A: ");
            habitantesA = scan.nextDouble();

            System.out.println("Entre com a população B: ");
            habitantesB = scan.nextDouble();

            System.out.println("Entre com o crescimento A: ");
            crescimentoA = scan.nextDouble();

            System.out.println("Entre com o crescimento B: ");
            crescimentoB = scan.nextDouble();

            if (habitantesA <= 0 || habitantesB <= 0 || crescimentoA <= 0 || crescimentoB <= 0) {
                System.out.println("Digite um valor valido");
            } else {
                validar = true;
            }
        }while (!validar);

        validar= false;
        double novaPopulacaoA;
        double novaPopulacaoB;
        contador = 0;

        do{

            novaPopulacaoA = (habitantesA * (crescimentoA / 100));
            novaPopulacaoB = (habitantesB * (crescimentoB / 100));

            habitantesA = novaPopulacaoA + habitantesA;
            habitantesB = novaPopulacaoB + habitantesB;
            contador++;

            if (habitantesA >= habitantesB) {
                validar= true;

            } else {
                System.out.println("Habitantes A:" + habitantesA);
                System.out.println("Habitantes B:" + habitantesB);
                System.out.println("O numero de A é menor que B");
            }
        }while (!validar) ;

    System.out.println("A população A: " + (habitantesA) + " demorou " + contador + " Anos para ultrapassar ou se igualar a população B; " + habitantesB);
        }
}


