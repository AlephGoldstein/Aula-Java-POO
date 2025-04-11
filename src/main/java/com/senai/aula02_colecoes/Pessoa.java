package com.senai.aula02_colecoes;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public void falar(String frase ){
        System.out.println(nome+"falou:"+frase);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
