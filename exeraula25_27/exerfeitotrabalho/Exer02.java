package com.loiane.cursojava.exeraula25_27.exerfeitotrabalho;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua conta bancaria: ");
        int numberAccount1 = scan.nextInt();

        Account account = new Account(numberAccount1);

        account.limitedLiberate(numberAccount1);

        while (true) {

            System.out.println("\n"+
                    "Olá bem-vindo a sua conta o que deseja realizar?\n"+
                   "1-Depositar\n"+
                   "2-Sacar\n"+
                   "3-Consultar Saldo\n"+
                   "4-Consultar Cheque Especial\n"+
                   "0- Sair");

            System.out.println("Digite a opção que deseja:");
            int option = scan.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Digite o valor que deseja depositar: ");
                    double value = scan.nextDouble();
                    account.deposit(value);
                }
                case 2 : {
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saldo = scan.nextDouble();
                    account.withdraw(saldo);
                }
                case 3 :System.out.println("Seu saldo atual é de: R$" + account.consultBalance());
                case 4 : account.overdraft();
                case 0 : System.exit(0);
                default : System.out.println("Opção invalida");

            }
        }

    }
}
