package com.company.lab3;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Person {
    private String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
