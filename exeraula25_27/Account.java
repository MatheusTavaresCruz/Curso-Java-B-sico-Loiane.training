package com.loiane.cursojava.exeraula25_27;

public class Account {

    double balance;
    boolean permitted = true;


    boolean withdrawPermission() {
        if (permitted) {
            System.out.println("Saque permitido");
            return true;
        } else {
            System.out.println("SEM PERMISSÃO CRIE UMA CONTA!");
            return false;
        }
    }

    void depositMoney(double value) {
        if (withdrawPermission()) {
            balance += value;
        }
    }

    void consultBalance(){
        System.out.println("O seu saldo é de: R$ "+ balance);
    }

    void withdraw(double value){
        if(withdrawPermission()){
            balance -= value;
        }

    }
    void stats(){
        if(balance < 0){
            System.out.println("Esta utilizando cheque especial!");
        }else{
            System.out.println("Não está utilizando cheque especial!");
        }
    }
}
