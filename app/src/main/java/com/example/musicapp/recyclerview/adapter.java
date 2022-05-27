package com.example.musicapp.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicapp.R;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private List<Musica> listaMusicas;

    public  adapter(List<Musica> lista) {
        this.listaMusicas = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Musica musica = listaMusicas.get(position);
        holder.musica.setText(musica.getTituloMusica());
        holder.banda.setText(musica.getBanda());
        holder.tempo.setText(musica.getTempo());
        holder.foto.setImageResource(musica.getFoto());
    }

    @Override
    public int getItemCount() {
        return listaMusicas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView musica;
        TextView tempo;
        TextView banda;
        ImageView foto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            musica = itemView.findViewById(R.id.textTitulo);
            tempo = itemView.findViewById(R.id.textAno);
            banda = itemView.findViewById(R.id.textGenero);
            foto = itemView.findViewById(R.id.iv_capa);

        }
    }
}
