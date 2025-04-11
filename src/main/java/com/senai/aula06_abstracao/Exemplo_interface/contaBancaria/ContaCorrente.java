package com.senai.aula006_abstracao.Exemplo_interface.contaBancaria;

public class ContaCorrente extends ContaBancaria{
    private double limit;

    public ContaCorrente(String titular, double saldo, double limit) {
        super(titular, saldo);
        this.limit = limit;
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo * 0.05;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (this.saldo+getLimit()) && (valor > 0)){
            this.saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
