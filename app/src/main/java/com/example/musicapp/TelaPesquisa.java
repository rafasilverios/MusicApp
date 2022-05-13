package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.musicapp.databinding.ActivityTelaPesquisaBinding;

public class TelaPesquisa extends AppCompatActivity {

    private ActivityTelaPesquisaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaPesquisaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent2  = getIntent();
        Bundle dados = intent2.getExtras();

        if (dados != null) {
            String search = dados.getString("chave-search");

            Toast.makeText(TelaPesquisa.this, "Sua pesquisa: " + search, Toast.LENGTH_LONG).show();

        }
    }
}