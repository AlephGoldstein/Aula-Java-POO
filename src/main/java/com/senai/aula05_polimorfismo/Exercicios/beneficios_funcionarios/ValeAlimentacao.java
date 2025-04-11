package com.senai.aula05_polimorfismo.Exercicios.beneficios_funcionarios;

public class ValeAlimentacao extends Beneficio {
    private float valor;

    public ValeAlimentacao(float desconto, float valor) {
        super(desconto);
        this.valor = valor;
    }
}
// testa