package com.example.contactsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import com.example.contactsapp.Contract.ContactEntry;

public class Dbhelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "todaycontact.db";


    public Dbhelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_TABLE = "CREATE TABLE " + ContactEntry.TABLE_NAME + " ("
                + ContactEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," // THIS AUTOMATICALLY INCREMENTS THE ID BY 1
                + ContactEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_EMAIL + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_PHONENUMBER + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_TYPEOFCONTACT + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_PICTURE  + " TEXT);";


        db.execSQL(SQL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}