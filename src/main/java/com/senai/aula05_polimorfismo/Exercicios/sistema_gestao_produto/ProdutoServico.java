package com.senai.aula05_polimorfismo.Exercicios.sistema_gestao_produto;

public class ProdutoServico extends Produto{
    private double imposto = 10;
    public ProdutoServico(String nomeProduto, double valor, String categoria) {
        super(nomeProduto, valor, categoria);
    }


    @Override
    public double calcular_imposto(double valor) {
        return valor+ (valor*imposto)/100;
    }

}
