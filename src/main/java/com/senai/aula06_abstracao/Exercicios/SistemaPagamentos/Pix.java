package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

public class Pix implements MetodoPagamento {
    public double calcularTaxa(double valor) {
        return valor * 0.01;
    }

    public void realizarPagamento(double valor, ContaBanco conta) {
        double taxa = calcularTaxa(valor);
        conta.debitar(valor + taxa);
        System.out.println("Pagamento realizado via PIX com taxa de R$ " + taxa);
    }
}