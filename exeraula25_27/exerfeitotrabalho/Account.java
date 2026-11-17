package com.loiane.cursojava.exeraula25_27.exerfeitotrabalho;

public class Account {

    int numberAccount;
    double balance;
    boolean overdraft;
    double limit;
    boolean permission;

    public Account(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    void limitedLiberate(double limit) {

        this.limit = limit;
        if (numberAccount > 0) {
            this.permission = true;
            System.out.println("Conta verificada, dados encontrados no sistema!");
        }else{
            this.permission = false;
            System.exit(0);
            System.out.println("Erro conta não encontrada!");
        }



    }

    void deposit(double value) {
        balance+=value;
    }

    void withdraw(double value) {
        balance-=value;
    }

    void overdraft() {
        if(balance < 0) {
            overdraft=true;
            System.out.println("Esta utilizando cheque especial");
        }else {
            overdraft = false;
            System.out.println("Não está utilizando cheque especial");
        }
    }
    public double consultBalance() {
        return balance;
    }

    }

