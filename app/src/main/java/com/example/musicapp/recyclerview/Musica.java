package com.example.musicapp.recyclerview;

public class Musica {

    private String tituloMusica;
    private String banda;
    private String tempo;
    private int foto;

    public Musica(String tituloFilme, String genero, String ano, int foto) {
        this.tituloMusica = tituloFilme;
        this.banda = genero;
        this.tempo = ano;
        this.foto = foto;
    }

    public String getTituloMusica() {
        return tituloMusica;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setTituloMusica(String tituloFilme) {
        this.tituloMusica = tituloFilme;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String genero) {
        this.banda = genero;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String ano) {
        this.tempo = ano;
    }
}
