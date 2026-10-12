package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor");
        int numero1 = scan.nextInt();

        if (numero1 >= 0){

            System.out.println("O Numero é positivo");
        }else{

            System.out.println("O Numero é negativo");
        }

    }
}
