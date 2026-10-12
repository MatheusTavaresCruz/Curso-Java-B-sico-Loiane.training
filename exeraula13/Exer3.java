package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        System.out.println("A soma é: "+ (numero1+numero2));
    }
}
