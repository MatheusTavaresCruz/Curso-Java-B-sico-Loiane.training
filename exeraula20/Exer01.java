package com.loiane.cursojava.exeraula20;

import java.util.Random;

public class Exer01 {

    public static void main(String[] args) {

        int [] [] matriz = new int[4][4];

        Random random = new Random();

        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                matriz [i] [j] = random.nextInt(10);
            }
        }
        int max = Integer.MIN_VALUE;
        int line = 0;
        int col =0;

        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (matriz [i] [j] > max){
                    max = matriz[i] [j];
                    line = i;
                    col = j;
                }
            }

            }

        System.out.println("Maior valor: " + max);
        System.out.println("Linha: " + line);
        System.out.println("Coluna: " + col);
    }
}
