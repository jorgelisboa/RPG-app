package com.example.rpgsimpletoken;

public class SheetFactory {
    private String dndSheet = "CREATE TABLE dnd ("
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "name VARCHAR(20) UNIQUE NOT NULL, "
            + "strength VARCHAR(2) NOT NULL, "
            + "dexterity VARCHAR(2) NOT NULL, "
            + "constitution VARCHAR(2) NOT NULL, "
            + "wisdom VARCHAR(2) NOT NULL, "
            + "intelligence VARCHAR(2) NOT NULL), "
            + "charisma VARCHAR(2) NOT NULL);";

    String cyberpunksheet = "CREATE TABLE dnd ("
            + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "name VARCHAR(20) UNIQUE NOT NULL, "
            + "body VARCHAR(2) NOT NULL, "
            + "reflex VARCHAR(2) NOT NULL, "
            + "tech VARCHAR(2) NOT NULL, "
            + "charisma VARCHAR(2) NOT NULL, "
            + "intelligence VARCHAR(2) NOT NULL);";

    public String makeSheet(String sheet) {
       if (sheet.equals("cyberpunk")) {
           return cyberpunksheet;
       }
       return dndSheet;
    }
}
