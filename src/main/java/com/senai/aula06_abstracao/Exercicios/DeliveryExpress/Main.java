package com.senai.aula06_abstracao.Exercicios.DeliveryExpress;

public class Main {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta(20, 10, 10);
        Moto moto = new Moto(90, 30, 10);

        System.out.println("==== Bicicleta ====");
        bike.exibirDetalhes();
        bike.aumentarVelocidade(10);
        bike.exibirDetalhes();
        System.out.printf("Tempo estimado: %.2f h\n", bike.calcularTempoEntrega());

        System.out.println("\n==== Motocicleta ====");
        moto.exibirDetalhes();
        moto.aumentarVelocidade(30);
        moto.exibirDetalhes();
        System.out.printf("Tempo estimado: %.2f h\n", moto.calcularTempoEntrega());
    }
}
