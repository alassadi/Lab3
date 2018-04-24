package com.company.lab3;

import java.util.UUID;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Account extends Person {
    private String balance;
    private Person person;

    public Account(String name, String password) {
        super(name, password);

    }

    public Account(String name, String password, String balance) {
        super(name, password);
        this.balance = balance;

    }

    public Account(String name, String password, Account balance) {
        super(name, password);
        this.balance = balance.balance;

    }


    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
