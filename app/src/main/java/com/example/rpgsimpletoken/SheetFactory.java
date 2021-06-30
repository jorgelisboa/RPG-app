package com.example.rpgsimpletoken;

public class SheetFactory {
    private String dndSheet = "CREATE TABLE dnd ("
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "name VARCHAR(20) UNIQUE NOT NULL, "
            + "strength VARCHAR(3) NOT NULL, "
            + "dexterity VARCHAR(3) NOT NULL, "
            + "constitution VARCHAR(3) NOT NULL, "
            + "wisdom VARCHAR(3) NOT NULL, "
            + "intelligence VARCHAR(3) NOT NULL), "
            + "charisma VARCHAR(3) NOT NULL);";

    String mysheet = "CREATE TABLE dnd ("
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "name VARCHAR(20) UNIQUE NOT NULL, "
            + "strength VARCHAR(3) NOT NULL, "
            + "dexterity VARCHAR(3) NOT NULL, "
            + "constitution VARCHAR(3) NOT NULL, "
            + "wisdom VARCHAR(3) NOT NULL, "
            + "intelligence VARCHAR(3) NOT NULL), "
            + "charisma VARCHAR(3) NOT NULL);";

    public String makeSheet(String sheet) {
       if (sheet.equals("dnd")) {
           return mysheet;
       }
       return dndSheet;
    }
}
