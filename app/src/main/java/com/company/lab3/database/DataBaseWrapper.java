package com.company.lab3.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.company.lab3.Account;
import com.company.lab3.Person;

import java.util.UUID;

/**
 * Created by hannahkern on 18.04.18.
 */

public class DataBaseWrapper extends CursorWrapper{
    public DataBaseWrapper(Cursor cursor) {
        super(cursor);
    }

    public Account updateBalance() {
        String name = getString(getColumnIndex(DataBaseSchema.DBTable.Cols.NAME));
        String password = getString(getColumnIndex(DataBaseSchema.DBTable.Cols.PASSWORD));
        String balance = getString(getColumnIndex(DataBaseSchema.DBTable.Cols.BALANCE));

        Account account = new Account  (balance);
        account.setBalance(balance);



        return  account;

    }
}
