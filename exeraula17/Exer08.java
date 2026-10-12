package com.loiane.cursojava.exeraula17;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int media;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            soma += num;
        }
        media = soma/5;
        System.out.println("A soma dos numeros é: "+ soma);
        System.out.println("A media dos numeros é: "+ media);
        }
    }

