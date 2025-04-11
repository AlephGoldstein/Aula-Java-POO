package com.senai.aula05_polimorfismo.Exercicios.sistema_gestao_produto;

public class ProdutoDigital extends Produto{
    private double imposto = 12;
    public ProdutoDigital(String nomeProduto, double valor, String categoria) {
        super(nomeProduto, valor, categoria);
    }

    @Override
    public double calcular_imposto(double valor) {
        return valor+ (valor*imposto)/100;
    }
}
