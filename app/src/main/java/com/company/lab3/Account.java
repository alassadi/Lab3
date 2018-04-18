package com.company.lab3;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Account {
    private String balance;

    public Account ( String balance ){
        this.balance=balance;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
