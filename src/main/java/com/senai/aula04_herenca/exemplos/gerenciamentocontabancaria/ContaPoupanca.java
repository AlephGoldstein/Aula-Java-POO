package com.senai.aula04_herenca.exemplos.gerenciamentocontabancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double rendimentoMensal) {
        super(titular, saldo);
        this.taxaRendimento = rendimentoMensal;
    }
    public void aplicarRendimento(){
        saldo += (saldo * taxaRendimento)/100;
        //
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
