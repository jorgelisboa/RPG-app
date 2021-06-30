package com.example.rpgsimpletoken;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RpgDatabase extends SQLiteOpenHelper {
    SheetFactory sheetFactory = new SheetFactory();
    private final String dndSheet = sheetFactory.makeSheet();

    public RpgDatabase(@Nullable Context context, int version) {
        super(context, "DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        db.execSQL("PRAGMA foreign_keys=ON"); //FK Enable
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL();
    }
}