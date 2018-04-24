package com.company.lab3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hannahkern on 18.04.18.
 */
public class AccountTest {

    private String balance;
    private Account account;
    private String name;
    private String password;
    private String expectedBalance;
    private String actualBalance;

    public AccountTest() {
        account = new Account(name, password, account);
    }

    @Test
    public void getBalance() throws Exception {

        System.out.println("getBalance");
        account.setBalance("100");
        expectedBalance = "100";
        actualBalance = account.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void setBalance() throws Exception {

        System.out.println("setBalance");
        account.setBalance("100");
        expectedBalance = "100";
        actualBalance = account.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance);


    }


}