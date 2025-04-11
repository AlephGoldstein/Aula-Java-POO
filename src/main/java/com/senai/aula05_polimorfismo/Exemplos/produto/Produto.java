package com.senai.aula05_polimorfismo.Exemplos.produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome){
        this.nome = nome;
    }
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
