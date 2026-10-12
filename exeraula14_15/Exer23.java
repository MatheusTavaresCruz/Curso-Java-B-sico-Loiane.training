package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne: ");
        System.out.println("1 - Filé duplo");
        System.out.println("2 - Alcatra ");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (KG): ");
        double qtdCarne = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(qtdCarne + "kg - file duplo");
            if (qtdCarne < 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }

        } else if (tipo == 2) {
            System.out.println(qtdCarne + "kg - Alcatra");
            if (qtdCarne < 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3) {
            System.out.println(qtdCarne + "kg - Picanha");
            if (qtdCarne < 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }
        double total = qtdCarne * precoKg;
        System.out.println(qtdCarne + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? digite 1 para sim: ");
        int cartao = scan.nextInt();
        if (cartao == 1){
            double desconto = (total /100) * 5;
            System.out.println("desconto de : " + desconto);
            System.out.println("valor a pagar de :" + (total - desconto));
        }else {
            System.out.println("Valor a pagar: "+ total);
        }
    }
}