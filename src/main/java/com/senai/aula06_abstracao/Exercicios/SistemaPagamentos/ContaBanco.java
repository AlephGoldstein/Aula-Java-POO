package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

public class ContaBanco {
    private double saldo;
    private Usuario usuario;

    public ContaBanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void debitar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferirParaBitcoin(ContaBitcoin contaBitcoin, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            contaBitcoin.receberTransferencia(valor);
            System.out.println("Transferência de R$ " + valor + " para conta Bitcoin realizada.");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    public void exibirExtrato() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}


