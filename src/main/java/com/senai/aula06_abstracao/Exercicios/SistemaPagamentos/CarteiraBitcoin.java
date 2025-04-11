package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

class ContaBitcoin {
    private double saldo;

    public ContaBitcoin() {
        this.saldo = 0;
    }

    public void receberTransferencia(double valor) {
        saldo += valor;
        System.out.println("Transferência recebida: R$ " + valor);
    }

    public void exibirSaldoBitcoin() {
        System.out.println("Saldo Bitcoin: R$ " + saldo);
    }

    public boolean pagarComBitcoin(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com Bitcoin.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento em Bitcoin.");
            return false;
        }
    }
}
