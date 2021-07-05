package com.example.rpgsimpletoken;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RpgDatabase extends SQLiteOpenHelper {
    MenuActivity menuActivity = new MenuActivity();

    public RpgDatabase(@Nullable Context context, int version) {
        super(context, "DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dndSheet = "CREATE TABLE dnd ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name VARCHAR(20) UNIQUE NOT NULL, "
                + "strength VARCHAR(2) NOT NULL, "
                + "dexterity VARCHAR(2) NOT NULL, "
                + "constitution VARCHAR(2) NOT NULL, "
                + "wisdom VARCHAR(2) NOT NULL, "
                + "intelligence VARCHAR(2) NOT NULL, "
                + "charisma VARCHAR(2) NOT NULL);";

        String fateSheet = "CREATE TABLE dnd ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name VARCHAR(20) UNIQUE NOT NULL, "
                + "body VARCHAR(2) NOT NULL, "
                + "reflex VARCHAR(2) NOT NULL, "
                + "tech VARCHAR(2) NOT NULL, "
                + "charisma VARCHAR(2) NOT NULL, "
                + "intelligence VARCHAR(2) NOT NULL);";
        db.execSQL(fateSheet);
        db.execSQL(dndSheet);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        db.execSQL("PRAGMA foreign_keys=ON"); //FK Enable
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean fateSheet(String name,
                           String body,
                           String reflex,
                           String tech,
                           String charisma,
                           String intelligence) {
        SQLiteDatabase database = getWritableDatabase();
        //Pass the values to the "insert"
        ContentValues valores = new ContentValues();

        valores.put("_id", (byte[]) null);
        valores.put("name", name);
        valores.put("body", body);
        valores.put("reflex", reflex);
        valores.put("tech", tech);
        valores.put("charisma", charisma);
        valores.put("intelligence", intelligence);

        //Trying to insert
        if (database.insert("fateSheet",null, valores) != -1){
            database.close();
            return true;
        }else{
            database.close();
            return false;
        }
    }

    public boolean dndSheet(String name,
                          String strength,
                          String dexterity,
                          String constitution,
                          String wisdom,
                          String intelligence,
                          String charisma) {
        SQLiteDatabase database = getWritableDatabase();
        //Pass the values to the "insert"
        ContentValues valores = new ContentValues();

        valores.put("_id", (byte[]) null);
        valores.put("name", name);
        valores.put("strength", strength);
        valores.put("dexterity", dexterity);
        valores.put("constitution", constitution);
        valores.put("wisdom", wisdom);
        valores.put("intelligence", intelligence);
        valores.put("charisma", charisma);

        //Trying to insert
        if (database.insert("dndSheet",null, valores) != -1){
            database.close();
            return true;
        }else{
            database.close();
            return false;
        }
    }

}
