package com.company.lab3.database;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by hannahkern on 18.04.18.
 */

public class DataBaseWrapper extends CursorWrapper{
    public DataBaseWrapper(Cursor cursor) {
        super(cursor);
    }


}
