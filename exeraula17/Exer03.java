package com.loiane.cursojava.exeraula17;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean opInvalida = false;
        String nome;
        int idade;
        String sexo;
        double salario;
        String estadoCivil;

        do{
        System.out.println("Digite o seu nome");
        nome = scan.next();

        if (nome.length() > 3){
            opInvalida = true;

        }else{
            System.out.println("Nome precias de no minimo 3 caracteres");
        }

        }while(!opInvalida);

        opInvalida = false;

        do {

            System.out.println("Digite o sua idade");
            idade = scan.nextInt();

            if(idade >=0 && idade <= 150) {
                opInvalida = true;
            }else{

                System.out.println("Idade precisa estar entre 0 e 150.");
            }
        } while (!opInvalida);

        opInvalida = false;
        do {
            System.out.println("Digite o seu salario");
            salario = scan.nextDouble();

            if(salario > 0){
                opInvalida = true;

            }else{

                System.out.println("O salario precisa ser maior que zero");
            }
        }while(!opInvalida);

        opInvalida = false;
        do {
            System.out.println("Digite o seu sexo(F / M)");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                opInvalida = true;

            }else{
                System.out.println("Sexo precisa ser 'F' ou 'M' ");
            }
        }while(!opInvalida);

        opInvalida = false;
        do {
            System.out.println("Digite o seu estado civil: (C, S , V, D)");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("C") ||
                    estadoCivil.equalsIgnoreCase("S")||
            estadoCivil.equalsIgnoreCase("V") ||
                    estadoCivil.equalsIgnoreCase("D")) {
                opInvalida = true;
            }else{
                System.out.println("Estado civil precisa ser 'C', 'S', 'V', ou 'D' ");
            }
        }while(!opInvalida);


        System.out.println("FORAM COLETADAS AS SEGUINTES INFORMAÇÕES: ");
        System.out.println("NOME: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


        }
    }
