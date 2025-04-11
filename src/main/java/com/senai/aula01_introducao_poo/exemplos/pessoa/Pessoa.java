package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    public Endereco endereco;

    public Pessoa(Endereco endereco, float altura, int idade, String nome) {
        this.endereco = endereco;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public void falar(String frase){
        System.out.println(this.nome + ":" + frase);
    }

    public void comer(String alimento){System.out.println(this.nome + " está comendo "+alimento);}

    @Override
    public String toString() {
        return "o " +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", endereco=" + endereco +
                "\t";
    }
}
