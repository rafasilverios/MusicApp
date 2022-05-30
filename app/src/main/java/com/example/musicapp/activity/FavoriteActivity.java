package com.example.musicapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.musicapp.R;
import com.example.musicapp.databinding.ActivityFavoriteBinding;
import com.example.musicapp.recyclerview.SearchActivity;
import com.example.musicapp.sharedpref.PerfilActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriteActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private ActivityFavoriteBinding binding;
    private int cont = 1;
    private int cont2 = 1;
    private int cont3 = 1;
    private int cont4 = 1;
    private int cont5 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.ivCoracao.setOnClickListener(v -> {
            if (cont == 1) {
                binding.ivCoracao.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                Toast.makeText(FavoriteActivity.this, "Não está mais entre seus Favoritos", Toast.LENGTH_SHORT).show();
                cont = 0;
            }else {
                binding.ivCoracao.setImageResource(R.drawable.ic_baseline_favorite_24);
                Toast.makeText(FavoriteActivity.this, "Salvo em Favoritos", Toast.LENGTH_SHORT).show();
                cont = 1;
            }
        });

        binding.ivCoracao2.setOnClickListener(v -> {
            if (cont2 == 1) {
                binding.ivCoracao2.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                Toast.makeText(FavoriteActivity.this, "Não está mais entre seus Favoritos", Toast.LENGTH_SHORT).show();
                cont2 = 0;
            }else {
                binding.ivCoracao2.setImageResource(R.drawable.ic_baseline_favorite_24);
                Toast.makeText(FavoriteActivity.this, "Salvo em Favoritos", Toast.LENGTH_SHORT).show();
                cont2 = 1;
            }
        });

        binding.ivCoracao3.setOnClickListener(v -> {
            if (cont3 == 1) {
                binding.ivCoracao3.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                Toast.makeText(FavoriteActivity.this, "Não está mais entre seus Favoritos", Toast.LENGTH_SHORT).show();
                cont3 = 0;
            }else {
                binding.ivCoracao3.setImageResource(R.drawable.ic_baseline_favorite_24);
                Toast.makeText(FavoriteActivity.this, "Salvo em Favoritos", Toast.LENGTH_SHORT).show();
                cont3 = 1;
            }
        });

        binding.ivCoracao4.setOnClickListener(v -> {
            if (cont4 == 1) {
                binding.ivCoracao4.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                Toast.makeText(FavoriteActivity.this, "Não está mais entre seus Favoritos", Toast.LENGTH_SHORT).show();
                cont4 = 0;
            }else {
                binding.ivCoracao4.setImageResource(R.drawable.ic_baseline_favorite_24);
                Toast.makeText(FavoriteActivity.this, "Salvo em Favoritos", Toast.LENGTH_SHORT).show();
                cont4 = 1;
            }
        });

        binding.ivCoracao5.setOnClickListener(v -> {
            if (cont5 == 1) {
                binding.ivCoracao5.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                Toast.makeText(FavoriteActivity.this, "Não está mais entre seus Favoritos", Toast.LENGTH_SHORT).show();
                cont5 = 0;
            }else {
                binding.ivCoracao5.setImageResource(R.drawable.ic_baseline_favorite_24);
                Toast.makeText(FavoriteActivity.this, "Salvo em Favoritos", Toast.LENGTH_SHORT).show();
                cont5 = 1;
            }
        });

        binding.tvBuacarMusicas.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
            startActivity(intent);
        });


        bottomNavigationView = findViewById(R.id.boottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ic_favorite);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.ic_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ic_search:
                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ic_favorite:
                        return true;
                    case R.id.ic_profile:
                        startActivity(new Intent(getApplicationContext(), PerfilActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });


    }
}