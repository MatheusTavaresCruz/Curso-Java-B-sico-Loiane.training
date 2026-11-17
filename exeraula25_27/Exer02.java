package com.loiane.cursojava.exeraula25_27;


import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);System.out.println("Acessando saldo...");

        Account account = new Account();


        System.out.println("Você tem conta neste banco?(Sim ou Não)");
        String response = scan.next();
        boolean permitted = response.equalsIgnoreCase("Sim");

        while(permitted){

            System.out.println("Digite a opção que deseja:");
            System.out.println("1- Depositar valor");
            System.out.println("2- Sacar valor");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Verificar se esta usando cheque especial");
            System.out.println("0- SAIR");

            int option = scan.nextInt();

            switch(option){

                case 1 :{
                    System.out.println("Digite o valor que deseja depositar");
                    double value = scan.nextDouble();
                    account.depositMoney(value); continue;
                }
                case 2 : {
                    System.out.println("Digite o vlaor que deseja sacar: ");
                    double value = scan.nextDouble();
                    account.withdraw(value);continue;
                }
                case 3 :{
                    System.out.println("Acessando saldo...");
                    account.consultBalance();continue;
                }
                case 4: {
                    System.out.println("Acessando verificação de uso de beneficio...");
                    account.stats();continue;
                }
                case 0 : {
                    System.out.println("ENCERRANDO A APLICAÇÃO...");
                    System.exit(0);
                }
                default: System.out.println("Opção invalida!");
            }
        }

    }
}
