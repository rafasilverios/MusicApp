package com.example.musicapp.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.musicapp.activity.FavoriteActivity;
import com.example.musicapp.activity.HomeActivity;
import com.example.musicapp.sharedpref.PerfilActivity;
import com.example.musicapp.R;
import com.example.musicapp.databinding.ActivityNowPlayingBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class NowPlaying extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Musica> listaMusicas = new ArrayList<>();
    BottomNavigationView bottomNavigationView;
    private ActivityNowPlayingBinding binding;
    private int cont = 1;
    private int cont2 = 1;
    private int cont3 = 1;
    private int cont4 = 1;
    private int cont5 = 1;
    private int cont6 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNowPlayingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ImageButton ibBack2 = findViewById(R.id.ibBack2);
        ibBack2.setOnClickListener(view1 -> {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        });


        //********  início RecyclerView  ********
        recyclerView = findViewById(R.id.recyclerView);

        //listagem de Musicas
        this.criarMusicas();

        //configurar adapter
        adapter adapter = new adapter(listaMusicas);


        //configurar recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        //********  fim RecyclerView  ********


        binding.ibPause.setOnClickListener(view15 -> {
            if (cont == 1) {
                binding.ibPause.setImageResource(R.drawable.ic_baseline_play_arrow_24);
                cont = 0;
            }else {
                binding.ibPause.setImageResource(R.drawable.ic_baseline_pause_24);
                cont = 1;
            }
        });

        binding.ibVolumeOn.setOnClickListener(view13 -> {
            if (cont2 == 1) {
                binding.ibVolumeOn.setImageResource(R.drawable.ic_baseline_volume_off_24);
                cont2 = 0;
            }else {
                binding.ibVolumeOn.setImageResource(R.drawable.ic_baseline_volume_up_24);
                cont2 = 1;
            }
        });

        binding.ibShuffle.setOnClickListener(view12 -> {
            if (cont3 == 1) {
                binding.ibShuffle.setImageResource(R.drawable.ic_baseline_shuffle_on_24);
                cont3 = 0;
            } else {
                binding.ibShuffle.setImageResource(R.drawable.ic_baseline_shuffle_24);
                cont3 = 1;
            }
        });

        binding.ibRepeat.setOnClickListener(view14 -> {
            if (cont4 == 1) {
                binding.ibRepeat.setImageResource(R.drawable.ic_baseline_repeat_on_24);
                cont4 = 0;
            }else {
                binding.ibRepeat.setImageResource(R.drawable.ic_baseline_repeat_24);
                cont4 = 1;
            }
        });

        binding.ibFoward.setOnClickListener(v -> {
            if (cont5 == 1) {
                binding.tvEnter2.setText("Sad But True");
                binding.ivMetallicaTransp.setImageResource(R.drawable.metallica23);
                cont5 = 0;
            }else {
                binding.tvEnter2.setText("Enter Sandman");
                binding.ivMetallicaTransp.setImageResource(R.drawable.metallicagt);
                cont5 = 1;
            }
        });

        binding.ibRewind.setOnClickListener(v -> {
            if (cont6 == 1) {
                binding.tvEnter2.setText("Enter Sandman");
                binding.ivMetallicaTransp.setImageResource(R.drawable.metallicagt);
                cont6 = 0;
            }else {
                binding.tvEnter2.setText("Sad But True");
                binding.ivMetallicaTransp.setImageResource(R.drawable.metallica23);
                cont6 = 1;
            }
        });

        bottomNavigationView = findViewById(R.id.boottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ic_home);

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
                        startActivity(new Intent(getApplicationContext(), PerfilActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });


    }

    private void criarMusicas() {
        Musica musica = new Musica("Enter Sandman", "Metallica", "5:31 m", R.drawable.enter_sandman);
        listaMusicas.add(musica);

        musica = new Musica("Rise Today", "Alter Bridge", "4:21 m", R.drawable.rise_to_day);
        listaMusicas.add(musica);

        musica = new Musica("In the End", "Linkin Park", "3:39 m", R.drawable.in_the_end);
        listaMusicas.add(musica);

        musica = new Musica("Thunderstruck", "AC/DC", "4:53 m", R.drawable.thunderstruck);
        listaMusicas.add(musica);

        musica = new Musica("Yellow", "Cold Play", "4:33 m", R.drawable.yellow);
        listaMusicas.add(musica);

        musica = new Musica("Somewhere I Belong", "Linkin Park", "3:45 m", R.drawable.somewhere_i_belong);
        listaMusicas.add(musica);

        musica = new Musica("Rock And Roll All Nite", "Kiss", "4:02 m", R.drawable.rock_and_roll_all_night);
        listaMusicas.add(musica);

        musica = new Musica("Fade to Black", "Metallica", "6:58 m", R.drawable.fade_to_black);
        listaMusicas.add(musica);

        musica = new Musica("Forever", "Kiss", "3:51 m", R.drawable.forever);
        listaMusicas.add(musica);

        musica = new Musica("Back In Black", "AC/DC", "4:14 m", R.drawable.back_in_black);
        listaMusicas.add(musica);
    }
}