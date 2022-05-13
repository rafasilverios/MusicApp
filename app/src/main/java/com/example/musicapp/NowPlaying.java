package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.musicapp.databinding.ActivityNowPlayingBinding;

public class NowPlaying extends AppCompatActivity {

    private ActivityNowPlayingBinding binding;
    private int cont = 1;
    private int cont2 = 1;
    private int cont3 = 1;
    private int cont4 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNowPlayingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);

        ImageButton ibBack2 = findViewById(R.id.ibBack2);
        ibBack2.setOnClickListener(view1 -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        binding.ibPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont == 1) {
                    binding.ibPause.setImageResource(R.drawable.ic_baseline_play_arrow_24);
                    cont = 0;
                }else {
                    binding.ibPause.setImageResource(R.drawable.ic_baseline_pause_24);
                    cont = 1;
                }
            }
        });

        binding.ibVolumeOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont2 == 1) {
                    binding.ibVolumeOn.setImageResource(R.drawable.ic_baseline_volume_off_24);
                    cont2 = 0;
                }else {
                    binding.ibVolumeOn.setImageResource(R.drawable.ic_baseline_volume_up_24);
                    cont2 = 1;
                }
            }
        });

        binding.ibShuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont3 == 1) {
                    binding.ibShuffle.setImageResource(R.drawable.ic_baseline_shuffle_on_24);
                    cont3 = 0;
                } else {
                    binding.ibShuffle.setImageResource(R.drawable.ic_baseline_shuffle_24);
                    cont3 = 1;
                }
            }
        });

        binding.ibRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont4 == 1) {
                    binding.ibRepeat.setImageResource(R.drawable.ic_baseline_repeat_on_24);
                    cont4 = 0;
                }else {
                    binding.ibRepeat.setImageResource(R.drawable.ic_baseline_repeat_24);
                    cont4 = 1;
                }
            }
        });

        binding.ibFoward.setOnClickListener(view1 -> binding.tvEnter2.setText("Sad But True"));

        binding.ibRewind.setOnClickListener(view2 -> binding.tvEnter2.setText("Enter Sandman"));


    }
}