package com.senai.aula05_polimorfismo.Exemplos.sistema_de_pagamentos;

public class Freelancer extends Pagamentos{
    private double valorProjeto;

    public Freelancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamentos() {
        return valorProjeto;
    }
}
