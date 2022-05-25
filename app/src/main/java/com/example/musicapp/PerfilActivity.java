package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.example.musicapp.databinding.ActivityPerfilBinding;

public class PerfilActivity extends AppCompatActivity {

    private ActivityPerfilBinding binding;
    private int cont5 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.ibBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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

    }
}