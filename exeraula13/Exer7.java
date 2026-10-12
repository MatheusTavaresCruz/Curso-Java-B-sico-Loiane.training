package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a Área: ");
        double area = scan.nextDouble();

        double calcular = area * area;
        double dobro = calcular * 2;

        System.out.println("A Área: " + calcular);
        System.out.println("O dobro da Área: "+ dobro);

    }
}
