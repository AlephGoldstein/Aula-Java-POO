package com.senai.aula05_polimorfismo.Exercicios.sistema_gestao_produto;

public class Produto {
    private String nomeProduto;
    private double valor;
    private String categoria;

    public Produto(String nomeProduto, double valor, String categoria) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double calcular_imposto(double valor){
        return valor;
    }
}
