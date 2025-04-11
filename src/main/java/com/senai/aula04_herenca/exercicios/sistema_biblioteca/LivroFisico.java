package com.senai.aula04_herenca.exercicios.sistema_biblioteca;

public class LivroFisico extends Livro {
    private int numpags;

    public LivroFisico(String titulo, String autor, int numpags) {
        super(titulo, autor);
        this.numpags = numpags;
    }

    @Override
    public String toString() {
        return "autor: " + getAutor() +
                " numpags: " + numpags + " titulo: "+
                getTitulo();
    }
}
