package com.senai.aula04_herenca.exercicios.controle_estoque;

public class Eletronico extends Produto{
    private float voltagem;

    public Eletronico(String nome, double preco, int qtd, float voltagem) {
        super(nome, preco, qtd);
        this.voltagem = voltagem;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }
}
