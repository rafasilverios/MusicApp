package com.example.musicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //********  início RecyclerView  ********
        recyclerView = findViewById(R.id.recyclerView);

        //listagem de Filmes
        this.criarFilmes();

        //configurar adapter
        adapter adapter = new adapter(listaFilmes);


        //configurar recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        //********  fim RecyclerView  ********



        bottomNavigationView = findViewById(R.id.boottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ic_search);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.ic_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ic_search:
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

    public void criarFilmes() {

        Filme filme = new Filme("Enter Sandman", "Metallica", "5:31 m", R.drawable.enter_sandman);
        listaFilmes.add(filme);

        filme = new Filme("Rise Today", "Alter Bridge", "4:21 m", R.drawable.rise_to_day);
        listaFilmes.add(filme);

        filme = new Filme("In the End", "Linkin Park", "3:39 m", R.drawable.in_the_end);
        listaFilmes.add(filme);

        filme = new Filme("Thunderstruck", "AC/DC", "4:53 m", R.drawable.thunderstruck);
        listaFilmes.add(filme);

        filme = new Filme("Yellow", "Cold Play", "4:33 m", R.drawable.yellow);
        listaFilmes.add(filme);

        filme = new Filme("Somewhere I Belong", "Linkin Park", "3:45 m", R.drawable.somewhere_i_belong);
        listaFilmes.add(filme);

        filme = new Filme("Rock And Roll All Nite", "Kiss", "4:02 m", R.drawable.rock_and_roll_all_night);
        listaFilmes.add(filme);

        filme = new Filme("Fade to Black", "Metallica", "6:58 m", R.drawable.fade_to_black);
        listaFilmes.add(filme);

        filme = new Filme("Forever", "Kiss", "3:51 m", R.drawable.forever);
        listaFilmes.add(filme);

        filme = new Filme("Back In Black", "AC/DC", "4:14 m", R.drawable.back_in_black);
        listaFilmes.add(filme);

    }

}