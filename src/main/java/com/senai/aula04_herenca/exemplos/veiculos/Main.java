package com.senai.aula04_herenca.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(2015,"HYUNDAI",4);
        Moto moto1 = new Moto(2012,"HONDA",false);

        carro1.exibirDetalhes();
        moto1.exibirDetalhes();

    }
}
