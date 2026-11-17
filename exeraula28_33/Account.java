package com.loiane.cursojava.exeraula28_33;

import java.util.Objects;

public class Account {

    private int numberAccount;
    private double balance;
    private boolean overdraft;
    private double limit;
    private boolean autentication;

    public Account(int numberAccount, double balance, double limit) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.limit = limit;
    }

    public boolean autenticator(String numberDigited){
        if (Objects.equals(this.numberAccount,numberDigited)){
            return true;
        }
        return false;
    }
}
