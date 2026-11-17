package com.loiane.cursojava.exeraula20;

import java.util.Random;

public class Exer02 {

    public static void main(String[] args) {

        int [] [] matriz = new int[10][10];

        Random random = new Random();

        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                matriz [i] [j] = random.nextInt(100);
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++) {
               System.out.print(matriz[i][j] + " ");
        }
            System.out.println();

        }
        int maximal = 0;
        int minimal = 101 ;
        int lineFive = 5;
        
        int colSeven = 7;
        int minimalValueCol = 101;
        int maximalValueCol = 0;

        for (int i = 0; i <matriz.length; i++){
                if (matriz [lineFive] [i] > maximal) {
                    maximal = matriz[lineFive][i];
                }
                if (matriz [lineFive] [i] < minimal){
                    minimal = matriz [lineFive] [i];
                }
            }

        for (int i = 0; i <matriz.length; i++){
            if (matriz [i] [colSeven] > maximalValueCol) {
                maximalValueCol = matriz[i][colSeven];
            }
            if (matriz [i] [colSeven] < minimalValueCol){
                minimalValueCol = matriz [i] [colSeven];
            }
        }

            System.out.println("Maior valor linha 5: " + maximal);
            System.out.println("Menor valor linha 5: " + minimal);

            System.out.println();
            
            System.out.println("Maior valor coluna 7: " + maximalValueCol);
            System.out.println("Menor valor coluna 7: " + minimalValueCol);

        }
        
    }

