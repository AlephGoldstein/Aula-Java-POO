package com.senai.aula06_abstracao.Exercicios.DeliveryExpress;

public class Bicicleta extends Veiculo {
    public Bicicleta(int velocidadeAtual, double cargaMaxima, double distanciaDestino) {
        super(velocidadeAtual, cargaMaxima, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        return distanciaDestino / (double) velocidadeAtual;
    }

    @Override
    public int getVelocidadeMaxima() {
        return 25;
    }
}
