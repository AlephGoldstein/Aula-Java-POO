package com.senai.aula04_herenca.exercicios.gestao_pedidos;

public class PedidoOnline extends Pedido {
    private double taxaEntrega;
    private String endereco;

    public PedidoOnline(int numeroPedido, double valorPedido, double taxaEntrega, String endereco) {
        super(numeroPedido, valorPedido);
        this.taxaEntrega = taxaEntrega;
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Entrega: R$" + taxaEntrega);
        System.out.println("Endereço de Entrega: " + endereco);
        System.out.println("Valor Total (incluindo entrega): R$" + (getValorPedido() + taxaEntrega));
    }
}
