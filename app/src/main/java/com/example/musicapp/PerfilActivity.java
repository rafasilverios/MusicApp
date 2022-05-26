package com.example.musicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.musicapp.databinding.ActivityPerfilBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PerfilActivity extends AppCompatActivity {

    private ActivityPerfilBinding binding;
    private int cont5 = 1;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.ibBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        binding.ibMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cont5 == 1){
                    binding.ibMostrar.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24);

                    String nome, email, senha;
                    SharedPreferences preferences = getSharedPreferences("chaveGeral", MODE_PRIVATE);
                    nome = preferences.getString("chaveNome", "");
                    email = preferences.getString("chaveEmail", "");
                    senha = preferences.getString("chaveSenha", "******");

                    binding.tvInformacao.setText("Nome: " + nome + "\nE-mail: " + email + "\nSenha: " + senha);
                    cont5 = 0;
                }else {
                    binding.ibMostrar.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24);
                    binding.tvInformacao.setText("");
                    cont5 = 1;
                }
            }
        });

        binding.tvFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), TelaLogin.class);
                startActivity(intent2);
            }
        });

        bottomNavigationView = findViewById(R.id.boottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ic_profile);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
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
                        startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ic_profile:
                        return true;
                }

                return false;
            }
        });

    }
}