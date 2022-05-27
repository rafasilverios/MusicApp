package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.musicapp.databinding.ActivityTelaLoginBinding;
import com.example.musicapp.sharedpref.TelaCadastro;

public class TelaLogin extends AppCompatActivity {

    private ActivityTelaLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tvSemLogin.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), TelaCadastro.class);
            startActivity(intent);
        });

    }
}