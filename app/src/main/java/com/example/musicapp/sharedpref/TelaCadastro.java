package com.example.musicapp.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.musicapp.activity.HomeActivity;
import com.example.musicapp.activity.TelaLogin;
import com.example.musicapp.databinding.ActivityTelaCadastroBinding;

public class TelaCadastro extends AppCompatActivity {

    private ActivityTelaCadastroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaCadastroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tvJaCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), TelaLogin.class);
            startActivity(intent);
        });

        binding.edtNome.requestFocus();


        binding.btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("chaveGeral", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("chaveNome", binding.edtNome.getText().toString());
                editor.putString("chaveEmail", binding.edtEmail.getText().toString());
                editor.commit();
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                Toast.makeText(TelaCadastro.this, "Gravado com Sucesso", Toast.LENGTH_LONG).show();
            }
        });
    }
}