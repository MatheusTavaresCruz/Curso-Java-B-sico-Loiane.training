package com.loiane.cursojava.exeraula17;
import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        for (int i = 0 ;i < 5;i++) {
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();
            if  (numero > maior) {

                maior = numero;
            }
        }
        System.out.println("O maior numero é: "+ maior);

    }
}
