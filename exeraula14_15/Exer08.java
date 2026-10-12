package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor");
        double produto1 = scan.nextDouble();

        System.out.println("Entre com outro valor");
        double produto2 = scan.nextDouble();

        System.out.println("Entre com um terceiro valor");
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 & produto1 < produto3){

            System.out.println("Compre o produto1: "+ produto1 + " é o mais barato");
        }else if (produto2 < produto1 & produto2 < produto3){

            System.out.println("Compre o produto2: "+ produto2 + " é o mais barato");
        }else if (produto3 < produto1 & produto3 < produto2){

            System.out.println("Compre o produto3: "+ produto3 + " é o mais barato");
        }

        }

}
