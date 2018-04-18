package com.company.lab3;

import java.util.UUID;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Account extends Person {
    private String balance;
    private Person person;

    public Account(String name, String password, Account account) {
        super(name, password, account);
    }


    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
