package com.senai.aula04_herenca.exemplos.veiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(int ano, String marca, int portas) {
        super(ano, marca);
        this.portas = portas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
