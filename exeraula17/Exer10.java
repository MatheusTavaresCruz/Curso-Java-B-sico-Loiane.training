package com.loiane.cursojava.exeraula17;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


            int maior;
            int menor;

            System.out.println("Entre com um numero");
            int numero = scan.nextInt();

            System.out.println("Entre com um numero");
            int numero1 = scan.nextInt();

            if (numero < numero1){

                maior = numero1;
                menor = numero;

            }else{
                maior = numero;
                menor = numero1;
            }
            for (int i = menor+ 1; i < maior ; i++){

                System.out.println(i);
            }

    }
}
