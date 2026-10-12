package com.loiane.cursojava.exeraula17;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma nota");
        double nota = scan.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Valor inválido! Entre com uma nota entre 0 e 10");
            nota = scan.nextDouble();
        }
        System.out.println("Nota valida: "+ nota);
        }

    }

