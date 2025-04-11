package com.senai.aula05_polimorfismo.Exemplos.Gestao_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutenção(new Carro("City"));
        realizarManutenção(new Moto("Kawazaky"));
    }
    private static void realizarManutenção(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
