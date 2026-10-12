package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor da sua hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora* horasTrabalhadas;

        int percentualIR = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;

        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;

        }else if (salarioBruto > 1500 && salarioBruto <= 2500){

            percentualIR = 10;
        }else if (salarioBruto > 2500){
            percentualIR = 20;
        }
        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto/ 100) * 10;
        double fgts = (salarioBruto/100)* 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("IR: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salario Liquido: " + salarioLiquido);


    }
}
