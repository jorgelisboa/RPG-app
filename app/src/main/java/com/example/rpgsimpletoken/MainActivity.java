package com.example.rpgsimpletoken;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    int tempoSplash = 5 * 1000; //Tempo em ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trocarTela();
    }

    private void trocarTela() {
        //Após o delay
        new Handler().postDelayed(() -> {
            Intent trocarDeTela = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(trocarDeTela);
            finish(); //Fecha a activity
        }, tempoSplash);
    }
}