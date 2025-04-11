package com.senai.aula006_abstracao.Exemplo.veiculo;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public void acelerar(int incremento){
        velocidade += incremento;
        System.out.println("Acelerando para "+velocidade+" km por hora");
    }

    abstract void ligar();
}
