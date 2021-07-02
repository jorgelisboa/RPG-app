package com.example.rpgsimpletoken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    int tempoSplash = 5 * 1000; //Tempo em ms
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        trocarTela();
    }

    private void trocarTela() {
    //Após o delay
        new Handler().postDelayed(() -> {
            Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(trocarDeTela);
            finish(); //Fecha a activity
        }, tempoSplash);
    }

}