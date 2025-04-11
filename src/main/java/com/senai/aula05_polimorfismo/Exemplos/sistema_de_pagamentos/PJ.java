package com.senai.aula05_polimorfismo.Exemplos.sistema_de_pagamentos;

public class PJ extends Pagamentos {
    private double horasTrabalhadas;
    private double valorPorHora;

    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularPagamentos() {
        return valorPorHora * horasTrabalhadas;
    }
}
