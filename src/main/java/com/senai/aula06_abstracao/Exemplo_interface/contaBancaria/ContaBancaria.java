package com.senai.aula006_abstracao.Exemplo_interface.contaBancaria;

public abstract class ContaBancaria {
    String titular;
    protected double saldo;
    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        if(saldo >0){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Erro");
        }
    }
    abstract void aplicarTaxaMensal();

    public void Depositar(double valor){
        if(valor > 0){
            this.saldo = saldo + valor;
        }
    }
    public boolean sacar(double valor){
        if(valor <= saldo && valor > 0){
            this.saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
//    public void transferir(double valor, contadestino){
//        if(this.sacar(valor)) {
//            contadestino.Depositar(valor);
//        }
//    }

}

