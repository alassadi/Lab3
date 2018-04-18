package com.company.lab3;

import java.util.UUID;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Person {



    private UUID mUUID;
    private String name;
    private String password;
    private Account account;

    public UUID getUUID() {
        return mUUID;
    }
    public String getName() {
        return name;
    }


    public String getPassword() {
        return password;
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    public Person(UUID UUID, String name, String password, Account account) {
        mUUID = UUID;
        this.name = name;
        this.password = password;
        this.account = account;
    }


}
