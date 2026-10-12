package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma Letra (F/M)");
        char letra = scan.next().charAt(0);

        if (letra == 'F' || letra == 'f'){

            System.out.println("Feminino");
        }else if (letra == 'M' || letra =='m'){
            System.out.println("Masculino");
        }else{
            System.out.println("Sexo inválido");
        }
    }
}
