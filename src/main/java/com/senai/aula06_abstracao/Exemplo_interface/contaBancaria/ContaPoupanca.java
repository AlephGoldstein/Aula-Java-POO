package com.senai.aula006_abstracao.Exemplo_interface.contaBancaria;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo * taxaRendimento;
    }
}
