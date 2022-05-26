package com.example.musicapp;

public class Filme {

    private String tituloFilme;
    private String genero;
    private String ano;
    private int foto;

    public Filme(String tituloFilme, String genero, String ano, int foto) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
        this.foto = foto;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
