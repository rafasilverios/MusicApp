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

        /*ImageView ivLupa = findViewById(R.id.ivLupa);
        ivLupa.setOnClickListener(view2 -> {
            Intent intent2 = new Intent(getApplicationContext(), ListaMusicas.class);
            startActivity(intent2);
        });*/
    }
}