package com.company.lab3;

import java.util.UUID;

/**
 * Created by hannahkern on 18.04.18.
 */

public class Person {



    private String name;
    private String password;




    public String getPassword() {
        return password;
    }







    public Person( String name, String password, Account account) {
        this.name = name;
        this.password = password;
    }


}
