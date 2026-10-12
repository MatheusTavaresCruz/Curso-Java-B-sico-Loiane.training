package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer06 {

        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int numero1 = scan.nextInt();

        System.out.println("Entre com outro numero");
        int numero2 = scan.nextInt();

        System.out.println("Entre com um terceiro numero");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 & numero1 > numero3){

            System.out.println("O primeiro numero é o maior!");
        }else if(numero2 > numero1 & numero2 > numero3){

            System.out.println("O segundo numero é o maior");
        }else if (numero3 > numero1 & numero3 > numero2) {

            System.out.println("O terceiro numero é o maior");
        }else{

            System.out.println("Os numeros sao iguais.");
        }
    }
}

