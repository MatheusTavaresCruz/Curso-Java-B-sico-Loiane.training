package com.loiane.cursojava.exeraula17;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.println("Entre com seu nome de usuario");
            String nome = scan.next();

            System.out.println("Entre com a sua senha");
            String senha = scan.next();

        while(nome.equalsIgnoreCase(senha)){
            System.out.println("A senha não pode ser igual ao nome");
            senha = scan.next();

        System.out.println("Senha e usuarios validos");
        }

        }
    }

