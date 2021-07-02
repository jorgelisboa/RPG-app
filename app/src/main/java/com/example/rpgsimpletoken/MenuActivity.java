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
    public void chooseSheet(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getApplicationContext(), R.style.Widget_AppCompat_ActionBar);
        alertDialog.setTitle("Escolha o modelo de ficha que deseja criar");
        alertDialog.setIcon(R.drawable.dice_logo);
        final RadioButton radioButton = new RadioButton(getApplicationContext());
        radioButton.setText("D&D");
        radioButton.setText("Cyberpunk");
        alertDialog.setView(radioButton);

        //Sim ou não
        alertDialog.setPositiveButton("Criar", (dialog, which) -> {

        });
    }

    public void addSheet(View view) {
        /*if(){

        } else {

        }*/
        chooseSheet();
        Intent sheetScreen = new Intent(MenuActivity.this, SheetActivity.class);
        startActivity(sheetScreen);
    }



}