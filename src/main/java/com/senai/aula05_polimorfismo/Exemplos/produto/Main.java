package com.senai.aula05_polimorfismo.Exemplos.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz",5);
        Produto produto2 = new Produto("Feijão");
        Produto produto3 = new Produto("Macarrão");
        Produto produto4 = new Produto();
        System.out.println(produto1);
        System.out.println(produto4);
    }
}
