package com.senai.aula05_polimorfismo.Exemplos.sistema_de_pagamentos;

public class CLT extends Pagamentos{
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamentos() {
        return salario;
    }
}
