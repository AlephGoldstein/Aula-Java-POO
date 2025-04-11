package com.senai.aula04_herenca.exercicios.sistema_biblioteca;

public class LivroPdf extends Livro {
    private double tamanhoArquivo;

    public LivroPdf(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return "autor: " + getAutor() +
                " tamanho arquivo: " + tamanhoArquivo + " titulo: "+
                getTitulo();
    }
}
