package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor ganho por hora: ");
        int hora = scan.nextInt();


        System.out.println("Horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioBruto = hora * horasTrabalhadas;
        double inss = (salarioBruto/100)*8;
        double sindicado = (salarioBruto/100)*5;
        double ir = (salarioBruto/100)*11;
        double totalDescontos = inss+sindicado+ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Seu salário é de: "+ salarioBruto);
        System.out.println("Seu inss é de: "+ inss);
        System.out.println("Seu sindicato é de: "+ sindicado);
        System.out.println("Seu IR é de: "+ ir);
        System.out.println("Seu Total de Descontos é de: "+ totalDescontos);
        System.out.println("Seu salário Liquido é de: "+ salarioLiquido);



    }
}
