package com.loiane.cursojava.exeraula13;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro numero:");
        int numero2 = scan.nextInt();

        System.out.println("Digite o terceiro numero:");
        double numero3 = scan.nextDouble();


        int resultadoA = (numero1*2) * (numero2/2);
        System.out.println("o produto do dobro do primeiro com metade do segundo: "+ resultadoA);

        double resultadoB = (numero1*3) + numero3;
        System.out.println("a soma do triplo do primeiro com o terceiro: "+ resultadoB);

        double resultadoC = (numero3*numero3)*numero3;
        System.out.println("o terceiro elevado ao cubo: "+ resultadoC);


    }
}
