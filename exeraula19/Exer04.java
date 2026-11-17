package com.loiane.cursojava.exeraula19;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vectorA = new int[15];

        double [] vectorB = new double [vectorA.length];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vectorA[i] = scan.nextInt();

            vectorB[i] = Math.sqrt (vectorA[i]);
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println(vectorA[i]);
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("Vetor B = ");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println(df.format(vectorB[i]) + " ");
        }

    }
}
