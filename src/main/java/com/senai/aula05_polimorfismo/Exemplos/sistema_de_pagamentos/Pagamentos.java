package com.senai.aula05_polimorfismo.Exemplos.sistema_de_pagamentos;

public class Pagamentos {
    private String nome;

    public Pagamentos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamentos(){
        return 0.0;
    }
}
