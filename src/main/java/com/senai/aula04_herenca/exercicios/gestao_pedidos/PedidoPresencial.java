package com.senai.aula04_herenca.exercicios.gestao_pedidos;

public class PedidoPresencial extends Pedido {
    private double descontoAvista;

    public PedidoPresencial(int numeroPedido, double valorPedido, double descontoAvista) {
        super(numeroPedido, valorPedido);
        this.descontoAvista = descontoAvista;
    }

    public double getDescontoAvista() {
        return descontoAvista;
    }

    public void setDescontoAvista(double descontoAvista) {
        this.descontoAvista = descontoAvista;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto à vista: R$" + descontoAvista);
        System.out.println("Valor Total (com desconto): R$" + (getValorPedido() - descontoAvista));
    }
}
