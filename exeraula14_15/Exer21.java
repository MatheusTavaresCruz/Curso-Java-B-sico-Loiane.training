package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de litros vendidos");
        double litros = scan.nextDouble();

        System.out.println("Entre com o tipo de combustivel");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int perDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")){

            if (litros <=20){

                perDesconto = 3;
            }else{

                perDesconto = 5;
            }
            total = litros * precoAlc;

            if (tipo.equalsIgnoreCase("g")){

                if (litros <=20){

                    perDesconto = 4;
                }else{

                    perDesconto = 6;
                }
                total = litros * precoGas;
            }

            totalDesconto = (total/100) * perDesconto;
            double precoAPagar = total - totalDesconto;

            System.out.println("O valor a ser pago: " + precoAPagar );
        }
}
}
