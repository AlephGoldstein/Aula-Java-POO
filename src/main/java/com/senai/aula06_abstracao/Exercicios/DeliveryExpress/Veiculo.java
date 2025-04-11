package com.senai.aula06_abstracao.Exercicios.DeliveryExpress;

public abstract class Veiculo {
    protected int velocidadeAtual;
    protected double cargaMaxima;
    protected double distanciaDestino;

    public Veiculo(int velocidadeAtual, double cargaMaxima, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.cargaMaxima = cargaMaxima;
        this.distanciaDestino = distanciaDestino;
    }

    public void aumentarVelocidade(int valor) {
        int novaVelocidade = velocidadeAtual + valor;
        int limite = getVelocidadeMaxima();
        velocidadeAtual = Math.min(novaVelocidade, limite);
    }

    public void exibirDetalhes() {
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
        System.out.println("Capacidade: " + cargaMaxima + " kg");
        System.out.println("Distância: " + distanciaDestino + " km");
    }

    public abstract double calcularTempoEntrega();
    public abstract int getVelocidadeMaxima();
}
