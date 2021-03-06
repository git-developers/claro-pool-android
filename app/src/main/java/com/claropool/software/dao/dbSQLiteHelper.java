package com.claropool.software.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class dbSQLiteHelper extends SQLiteOpenHelper {

    private String DROP_TABLE;

    public dbSQLiteHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.DROP_TABLE = "DROP TABLE IF EXISTS ";
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(dbTables.CREATE_T_USER);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(this.DROP_TABLE + dbTables.T_USER);
        onCreate(db);
    }
}
