package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("O peso ideal é: "+ (72.7*altura-58));
    }
}
