package com.loiane.cursojava.exeraula14_15;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        char letra = scan.next().charAt(0);

        if (letra == 'a' || letra =='A'){

            System.out.println("Vogal");

        }else if (letra == 'e' || letra =='E'){

            System.out.println("Vogal");

        } else if (letra == 'i' || letra =='I') {

            System.out.println("Vogal");

        } else if (letra == 'o' || letra =='O'){

            System.out.println("Vogal");

        }else if (letra == 'u' || letra =='U'){

            System.out.println("Vogal");

        }else {

            System.out.println("Consoante");

        }
    }
}
