package com.example.rpgsimpletoken;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {
    //Itens at screen
    FloatingActionButton addSheet;
    RpgDatabase rpgDatabase = new RpgDatabase(MenuActivity.this, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addSheet = findViewById(R.id.addSheet); //FloatingActionButton

    }
    public void addSheet(View view){
        final RadioButton radioButton = new RadioButton(getApplicationContext());
        radioButton.setText("D&D");
        radioButton.setText("Cyberpunk");

        AlertDialog.Builder builder = new AlertDialog.Builder(
                MenuActivity.this)
                .setTitle("Escolha o modelo de ficha que deseja criar")
                .setIcon(R.drawable.dice_logo)
                .setCancelable(false)
                .setPositiveButton("D&D", (dialog, which) -> {
                    Intent sheetScreen = new Intent(MenuActivity.this, SheetActivity.class);
                    startActivity(sheetScreen);
                })
                .setNegativeButton("Fate", (dialog, which) -> {
                    Intent sheetScreen = new Intent(MenuActivity.this, SheetActivity.class);
                    startActivity(sheetScreen);
                }).setNeutralButton("Cancelar", (dialog, which) -> {
                    dialog.dismiss();
                });

        //Creating the dialog message at the screen
        builder.create().show();


    }




}