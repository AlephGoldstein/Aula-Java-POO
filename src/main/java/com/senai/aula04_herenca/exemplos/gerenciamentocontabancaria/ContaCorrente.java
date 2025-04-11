package com.senai.aula04_herenca.exemplos.gerenciamentocontabancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (this.saldo+this.limite) && (valor > 0)){
            this.saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
