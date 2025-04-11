package com.senai.aula05_polimorfismo.Exercicios.sistema_gestao_produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoDigital("celular", 1542.0d,"eletronicos");
        Produto produto2 = new ProdutoFisico("Geladeira brastemp",5699.0,"eletrodomestico");

        System.out.println("O valor mais o imposto fica R$"+produto1.calcular_imposto(produto1.getValor()));
        System.out.println("O valor mais o imposto fica R$"+produto2.calcular_imposto(produto2.getValor()));
    }
}
