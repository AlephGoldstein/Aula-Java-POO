package com.senai.aula06_abstracao.Exemplo.animal;

public class Pato extends Animal {

    // Construtor
    public Pato(String nome) {
        super(nome);
    }

    // Implementação do método fazerSom()
    @Override
    public void fazerSom() {
        System.out.println("O pato faz: Quack quack quack");
    }

    // Método para o pato botar ovo
    public void botarOvo() {
        System.out.println(getNome() + " virou mamãe!! ");
    }
}
