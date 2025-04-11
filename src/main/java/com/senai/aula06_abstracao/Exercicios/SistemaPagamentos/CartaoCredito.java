package com.senai.aula06_abstracao.Exercicios.SistemaPagamentos;

class CartaoCredito implements MetodoPagamento {
    public double calcularTaxa(double valor) {
        return valor * 0.05;
    }

    public void realizarPagamento(double valor, ContaBanco conta) {
        double taxa = calcularTaxa(valor);
        conta.debitar(valor + taxa);
        System.out.println("Pagamento realizado via Cartão de Crédito com taxa de R$ " + taxa);
    }
}