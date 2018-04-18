package com.company.lab3.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by hannahkern on 18.04.18.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "Laboration.db";
    private Context context;

    public DataBaseHelper (Context context){
        super (context, DATABASE_NAME, null, VERSION);
        this.context=context;

    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " +
                DataBaseSchema.DBTable.NAME + "(" + " _id integer primary key autoincrement, " +
                DataBaseSchema.DBTable.Cols.NAME + ", " +
                DataBaseSchema.DBTable.Cols.PASSWORD + ", " +
                DataBaseSchema.DBTable.Cols.BALANCE +")");
    }

    public void onUpgrade (SQLiteDatabase db, int OldVerison, int NewVersion){

    }




}
