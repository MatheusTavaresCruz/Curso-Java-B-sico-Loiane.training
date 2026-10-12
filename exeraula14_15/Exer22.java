package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (KG) de morango: ");
        double qtdMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (KG) de maçã: ");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango;

        if (qtdMorango <= 5) {
            precoKgMorango = 2.5;

        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca;

        if (qtdMaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMaca + precoKgMorango;
        double precoTotal = precoParcial;

        if ((qtdMaca + qtdMorango > 8) || precoParcial > 25){
            precoTotal = precoParcial- ((precoParcial /100)*10);
        }
        System.out.println("O preco total: " + precoTotal);
    }
}