package com.senai.aula006_abstracao.Exemplo_interface.contaBancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("allan",15000,50000));
        testarContas(new ContaPoupanca("allone",15000,0.08));
    }
    public static void testarContas(ContaBancaria contaBancaria){
        System.out.println("testando "+contaBancaria.titular);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.aplicarTaxaMensal();
        System.out.println(contaBancaria.getSaldo());

    }
}
