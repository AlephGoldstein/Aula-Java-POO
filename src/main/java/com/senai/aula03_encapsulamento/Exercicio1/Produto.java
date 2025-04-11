package com.senai.aula03_encapsulamento.Exercicio1;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new IllegalArgumentException("Produto com preço negativo!!");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
