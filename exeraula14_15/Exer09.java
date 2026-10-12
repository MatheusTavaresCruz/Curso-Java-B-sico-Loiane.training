package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int numero1 = scan.nextInt();

        System.out.println("Entre com outro numero");
        int numero2 = scan.nextInt();

        System.out.println("Entre com um terceiro numero");
        int numero3 = scan.nextInt();

        int auxiliar;

        if (numero1 < numero2){
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }
        if (numero1 < numero3){
            auxiliar = numero1;
            numero1 = numero3;
            numero3 = auxiliar;
        }
        if (numero2 < numero3){
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;
        }

        System.out.println("Ordem Decrescente:" + numero1 + numero2 + numero3);
    }
}