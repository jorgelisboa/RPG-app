package com.example.rpgsimpletoken;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {
    //Itens at screen
    FloatingActionButton addSheet;

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
                .setView(radioButton)
                .setIcon(R.drawable.dice_logo)
                .setPositiveButton("Criar", (dialog, which) -> {
                    Intent sheetScreen = new Intent(MenuActivity.this, SheetActivity.class);
                    startActivity(sheetScreen);
                })
                .setNegativeButton("cancelar", (dialog, which) -> {

                });

        //Creating the dialog message at the screen
        AlertDialog dialog = builder.create();
        dialog.show();


    }




}