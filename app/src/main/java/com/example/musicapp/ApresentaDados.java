package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.musicapp.databinding.ActivityApresentaDadosBinding;

public class ApresentaDados extends AppCompatActivity {

    private ActivityApresentaDadosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityApresentaDadosBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.ibMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome, email, senha;
                SharedPreferences preferences = getSharedPreferences("chaveGeral", MODE_PRIVATE);
                nome = preferences.getString("chaveNome", "");
                email = preferences.getString("chaveEmail", "");
                senha = preferences.getString("chaveSenha", "******");

                binding.tvInformacao.setText("Nome: " + nome + "\nE-mail: " + email + "\nSenha: " + senha);
            }
        });

    }
}