package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda? ");

        System.out.println("Digite uma letra para o seu turno (M/V/N)");
        char letra = scan.next().charAt(0);

        if (letra == 'M' || letra == 'm'){

            System.out.println("Bom Dia!");

        }else if (letra == 'V' || letra =='v'){

            System.out.println("Boa Tarde!");

        }else if (letra == 'N' || letra == 'n'){

            System.out.println("Boa Noite!");
        }else{

            System.out.println("Valor Inválido!");
        }
    }
}
