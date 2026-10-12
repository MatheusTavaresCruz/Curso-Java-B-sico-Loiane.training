package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int numero1 = scan.nextInt();

        System.out.println("Entre com outro numero");
        int numero2 = scan.nextInt();

        if (numero1 > numero2){

            System.out.println("O primeiro numero é o maior!");
        }else{

            System.out.println("O segundo numero é o maior");
        }
    }
}
