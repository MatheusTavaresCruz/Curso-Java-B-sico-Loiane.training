package com.loiane.cursojava.exeraula19;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vectorA = new int [8];
        int [] vectorB = new int [vectorA.length];

        for (int i=0; i<vectorA.length;i++){

            System.out.println("Entre com o valor da posição: " + i);
            vectorA[i] = scan.nextInt();

            vectorB[i] = vectorA[i] * 2;
        }

        System.out.println("Vetor A = ");
        for (int i=0; i<vectorA.length; i++){
            System.out.println(vectorA [i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i=0; i<vectorB.length; i++){
            System.out.println(vectorB [i] + " ");
        }
        System.out.println();
    }
    }
