package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com seu salario: ");
    double salario = scan.nextDouble();

    int percentual = 0;

    double valorAumentado = 0;

    if (salario <= 280){
        percentual = 20;
        valorAumentado = salario * 20/100;
    }else if (salario > 280 && salario < 700){
        percentual = 15;
       valorAumentado = salario * 15/100;
    }else if (salario >= 700 && salario < 1500){
        percentual = 10;
        valorAumentado = salario * 10/100;
    }else if (salario >= 1500) {
        percentual = 5;
        valorAumentado = salario * 5/100;
    }

        double novoSalario = salario + valorAumentado;

        System.out.println("O seu salario antes do reajuste era de: " + salario);
        System.out.println("O seu salario com reajuste é de: " + novoSalario);
        System.out.println("O seu percentual de aumento foi de: " + percentual +"%");
        System.out.println("O seu aumento foi de: " + (valorAumentado));


    }
}
