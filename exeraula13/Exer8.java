package com.loiane.cursojava.exeraula13;

import java.util.Scanner;


public class Exer8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor ganho por hora: ");
        int hora = scan.nextInt();


        System.out.println("Horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();

        int salario = hora * horasTrabalhadas;

        System.out.println("Seu salário é de: "+ salario);
    }
}
