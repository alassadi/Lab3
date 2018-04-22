package com.company.lab3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hannahkern on 22.04.18.
 */
public class PersonTest {

    private Person person;
    private  String name;
    private String passwort;
    private String expectedPassword;
    private String expectedName;
    private String actualName, actualPassword;

    public PersonTest(){
        person = new Person("Name","123456");
    }

    @Test
    public void getPassword() throws Exception {


        System.out.println("getPassword");

        person.getPassword();
        expectedPassword = "123456";
        actualPassword = person.getPassword();

        Assert.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void getName() throws Exception {
        System.out.println("getName");
        person.getName();
        expectedName = "Name";
        actualName = person.getName();

        Assert.assertEquals(actualName, expectedName);

    }

}