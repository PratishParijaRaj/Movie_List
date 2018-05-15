package com.example.pratishparija.recycle;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;


public class Data extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "users_db";


    public Data(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Details.CREATE_TABLE);

    }
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + Details.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public Data(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}
