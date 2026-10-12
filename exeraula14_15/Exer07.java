package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int numero1 = scan.nextInt();

        System.out.println("Entre com outro numero");
        int numero2 = scan.nextInt();

        System.out.println("Entre com um terceiro numero");
        int numero3 = scan.nextInt();

       int maior = numero1;
       int menor = numero1;


       if (numero2 > maior){

           maior = numero2;
        } else if (numero2 < menor){

           maior = numero2;
       } if (numero3 > maior){

           maior = numero3;
       }else if (numero3 < menor) {

           menor = numero3;
       }
       System.out.println("O maior numero é: " + maior);
       System.out.println("O menor numero é: " + menor);
    }
}

