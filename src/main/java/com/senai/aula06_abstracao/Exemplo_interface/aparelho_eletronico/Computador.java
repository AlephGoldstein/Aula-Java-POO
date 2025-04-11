package com.senai.aula006_abstracao.Exemplo_interface.aparelho_eletronico;

public class Computador implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Ligando computador");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando computador");
    }
}
