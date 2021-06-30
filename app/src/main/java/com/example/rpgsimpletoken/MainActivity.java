package com.example.rpgsimpletoken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void addSheet(View view) {
        Intent sheetScreen = new Intent(MainActivity.this, SheetActivity.class);
        startActivity(sheetScreen);
    }
}