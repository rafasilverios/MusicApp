package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibPlay2 = findViewById(R.id.ibPlay2);
        ibPlay2.setOnClickListener(view1 -> {
            Intent intent = new Intent(getApplicationContext(), NowPlaying.class);
            startActivity(intent);
        });

        ImageButton ibPerfil = findViewById(R.id.ibPerfil);
        ibPerfil.setOnClickListener(view3 -> {
            Intent intent2 = new Intent(getApplicationContext(), ApresentaDados.class);
            startActivity(intent2);
        });
    }
}