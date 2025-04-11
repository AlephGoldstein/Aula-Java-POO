package com.senai.aula02_colecoes.Exercicios2;

public class Produto {
    String nome;
    int qtdEstoque;

    public Produto(String nome, int qtdEstoque) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return qtdEstoque;
    }

    public void setQuantidade(int quantidade) {
        this.qtdEstoque = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Quantidade: " + qtdEstoque;
    }
}
