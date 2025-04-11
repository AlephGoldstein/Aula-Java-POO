package com.senai.aula06_abstracao.Exemplo.animal;

public abstract class Animal {
    protected String nome; // Tornando o campo 'nome' protegido

    public Animal(String nome) {
        this.nome = nome;
    }

    abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
