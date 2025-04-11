package com.senai.aula006_abstracao.Exemplo.veiculo;


public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro());
        testarVeiculo(new Moto());
    }
    public static void testarVeiculo(Veiculo veiculo){
       veiculo.ligar();
       veiculo.acelerar(10);
    }
}
