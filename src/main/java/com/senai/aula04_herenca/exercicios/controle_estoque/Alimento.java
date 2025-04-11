package com.senai.aula04_herenca.exercicios.controle_estoque;

import java.util.Date;

public class Alimento extends Produto {
    private Date data_validade;

    public Alimento(String nome, double preco, int qtd, Date data_validade) {
        super(nome, preco, qtd);
        this.data_validade = data_validade;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }
}
